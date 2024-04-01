import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);

//println "Enter the number of lines: "
def n = Integer.parseInt(sc.nextLine());

//println "Enter your String in input: "


String regex = '^[_.][0-9]+[a-zA-Z]*_?$';
Pattern pattern = Pattern.compile(regex);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = pattern.matcher(line)
    if (matcher.find()) {
        println "VALID"
    } else {
        println "INVALID"
    }
}
