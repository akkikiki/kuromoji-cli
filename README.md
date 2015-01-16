# kuromoji-cli
This is a command line interface tool for kuromoji.

To create an executable jar file from the command line, follow the following steps:

1. Run `mvn package`
2. Run `java -jar target/kuromoji-cli-1.0-SNAPSHOT-jar-with-dependencies.jar `
3. Type in the words or sentences you want to tokenize.


You can also use `-u` option to specify the path to your own user dictionary. For example,

`java -jar target/kuromoji-cli-1.0-SNAPSHOT-jar-with-dependencies.jar -u ./src/test/resources/userdic.txt`
