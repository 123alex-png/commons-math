@echo off
java -cp "target\classes;randoop-all-4.3.4.jar" ^
  randoop.main.Main gentests ^
  --testclass=org.apache.commons.math3.test ^
  --junit-output-dir=.\randoop-tests ^
  --time-limit=20 ^
  --generated-limit=100000 ^
  --output-limit=5000 ^
  --maxsize=1000 ^
  --null-ratio=0.05 ^
  --alias-ratio=0.4 ^
  --input-selection=ORIENTEERING ^
  --method-selection=UNIFORM ^
  --no-regression-assertions=false ^
  --check-compilable=true ^
  --only-test-public-members=true ^
  --unchecked-exception=ERROR ^
  --npe-on-non-null-input=ERROR ^
  --cm-exception=INVALID ^
  --oom-exception=INVALID ^
  --sof-exception=INVALID ^
  --flaky-test-behavior=OUTPUT ^
  --minimize-error-test=true ^
  --usethreads=true ^
  --call-timeout-millis=5000 ^
  --progressdisplay=true ^
  --junit-package-name=randoop.tests ^
  --deterministic=false ^
  --randomseed=12345 ^
  --literals-level=ALL ^
  --string-maxlen=5000 ^
  --checked-exception=ERROR ^
  --npe-on-non-null-input=ERROR ^
  --cm-exception=ERROR ^
  --literals-file=my_literals.txt


