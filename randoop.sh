#!/bin/zsh
java -cp "target/classes:randoop-all-4.3.4.jar" \
  randoop.main.Main gentests \
  --testclass=org.apache.commons.math.linear.EigenMetamorphicTester \
  --junit-output-dir=./randoop-tests \
  --time-limit=6000 \
  --generated-limit=100000 \
  --output-limit=5000 \
  --maxsize=1000 \
  --null-ratio=0.05 \
  --alias-ratio=0.4 \
  --input-selection=ORIENTEERING \
  --method-selection=UNIFORM \
  --no-regression-assertions=false \
  --check-compilable=true \
  --only-test-public-members=true \
  --unchecked-exception=ERROR \
  --npe-on-non-null-input=ERROR \
  --cm-exception=INVALID \
  --oom-exception=INVALID \
  --sof-exception=INVALID \
  --flaky-test-behavior=OUTPUT \
  --minimize-error-test=true \
  --usethreads=true \
  --call-timeout-millis=5000 \
  --progressdisplay=true \
  --junit-package-name=randoop.tests \
  --deterministic=false \
  --randomseed=12345 \
  --literals-level=ALL \
  --string-maxlen=5000
#!/bin/zsh
## 设置 classpath（包括 junit 和 hamcrest）
#CP=".:junit-4.13.2.jar:hamcrest-core-1.3.jar:target/classes:randoop-tests"
#
## 清理旧的 .class 文件
#rm -f randoop-tests/*.class
#
## 编译所有测试类
#echo "Compiling tests..."
#javac -cp "$CP" randoop-tests/RegressionTest*.java
#
#for testfile in randoop-tests/RegressionTest*.java; do
#    TEST_CLASS=$(basename $testfile .java)
#    echo "--------------------------------------------------"
#    echo "Running randoop-tests.$TEST_CLASS"
#    java -cp "$CP" org.junit.runner.JUnitCore "$TEST_CLASS"
#done
