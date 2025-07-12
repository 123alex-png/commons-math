java -jar evosuite-1.2.0.jar \
  -class org.apache.commons.math.linear.EigenMetamorphicTester \
  -projectCP target/classes \
  -generateMOSuite \
  -criterion BRANCH:LINE:WEAKMUTATION \
  -generateNumRandom 500 \
  -Dpopulation=100 \
  -Diterations=200 \
  -Dsearch_budget=600000 \
  -Dassertion_strategy=NONE \
  -Dprimitive_reuse_probability=0.7 \
  -seed 12345 \
javac -cp "evosuite-1.2.0.jar:junit-4.13.2.jar:target/classes" \
      evosuite-tests/org/apache/commons/math/linear/*.java
java -cp "evosuite-1.2.0.jar:junit-4.13.2.jar:target/classes:evosuite-tests" \
     org.junit.runner.JUnitCore \
     org.apache.commons.math.linear.EigenMetamorphicTester_ESTest
