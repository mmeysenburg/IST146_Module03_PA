javac -classpath .:target/dependency/* -d . $(find . -type f -name '*.java')
java -classpath .:target/dependency/* RestaurantQualityTest
