

import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


def n = Integer.parseInt(sc.nextLine());


//String logic1 = '^\\([+-]?([0-9][\\.][0-9]+|[0-9]|90[\\.][0]+|90|[0-8][0-9][\\.][0-9]+|[0-8][0-9]),\\s[+-]?(180[\\.][0]+' +
//        '|1[0-7][0-9]\\.[0-9]+|1[0-7][0-9]|180|[0-9][\\.][0-9]*|[0-9][0-9][\\.][0-9]+|[0-9][0-9]|[0-9])\\)$'


String logic1 = '[+-]\\\\s[+-]?'



Pattern logic1Pattern = Pattern.compile(logic1);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = logic1Pattern.matcher(line)
    if (matcher.find()) {
        println "Valid"
    }
    else println "Invalid"

}

