# KotTerm ✅
One of three Kotlin related projects for my final semester, this one a Terminal Calculator! This was an interesting one, as after I realized how similar it is to Java, it was pretty smooth sailing! Similar syntax, similar imports, the whole project wasn't very taxing, but it did refamiliarize me with how Java worked. The only pain was figuring out how exactly to run this from the Command Line. That is, whenever IntelliJ was working properly and not randomly deciding my files weren't Kotlin files. All in all, I liked the simplicity of this project, and did enjoy how simple it was to set something like this up given my familiarity with it's cousin language.


# Requirements
- Kotlin v2.1.10 (JRE 23.0.2)
  - Ensure you have Kotlin by running the following command in a terminal: `kotlin -version`
- Java v23.0.2
  - Ensure you have a Java Runtime Environment (JRE) by running the following command in a terminal: `java -version`

# How to Run:
- Download the files, then navigate to the directory they are stored in via a command line
- Run the following command:
  -   `kotlinc Main.kt CalculationResult.kt -include-runtime -d kotapp.jar`
  -   This will create a ".jar" file to run with the Java Environment
- Finally, run the following command to run the program:
  - `java -jar kotapp.jar`
