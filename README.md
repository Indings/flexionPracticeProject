# Triangle Analyzer
This is a simple program that will identify the type of triangle given side lengths prompted from the user via the CLI.


## Requirements 
- JDK 17+
- Maven 3.9+

## Examples
The program will prompt for 3 side lengths from the user.

The CLI looks for the next 3 tokens. So enter your input delimited by spaces or new lines.

if the user entered: <br> 

```3 4 5``` <br> or <br> ```3```<br>```4```<br>```5```<br>

The program will identify the triangle variation: ```Right Scalene```
### To run the program in terminal
navigate to the project root folder.

first, run: ```mvn install```

Then,

To run the program:
```mvn compile exec:java```

To run tests:
```mvn test```


