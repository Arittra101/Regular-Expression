
import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


def n = Integer.parseInt(sc.nextLine());


//String logic1 = '^\\([+-]?([0-9][\\.][0-9]+|[0-9]|90[\\.][0]+|90|[0-8][0-9][\\.][0-9]+|[0-8][0-9]),\\s[+-]?(180[\\.][0]+' +
//        '|1[0-7][0-9]\\.[0-9]+|1[0-7][0-9]|180|[0-9][\\.][0-9]*|[0-9][0-9][\\.][0-9]+|[0-9][0-9]|[0-9])\\)$'


String logic1 = '^\\([+-]?(\\d\\.\\d+|\\d|90\\.0+|90|[0-8]\\d\\.\\d+|[0-8]\\d),\\s[+-]?(180\\.0+|1[0-7]\\d\\.\\d+|1[0-7]\\d|180|\\d\\.\\d*|\\d{2}\\.\\d+|\\d{2}|\\d)\\)$'


Pattern logic1Pattern = Pattern.compile(logic1);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = logic1Pattern.matcher(line)
    if (matcher.find()) {
        println "Valid"
    }
    else println "Invalid"

}

