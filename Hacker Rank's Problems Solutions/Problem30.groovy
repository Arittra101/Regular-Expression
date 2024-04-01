import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


def n = Integer.parseInt(sc.nextLine());


String logic1 = '^hackerrank$'
String logic2 = '^hackerrank'
String logic3 = 'hackerrank$'

Pattern logic1Pattern = Pattern.compile(logic1);
Pattern logic2Pattern = Pattern.compile(logic2);
Pattern logic3Pattern = Pattern.compile(logic3);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = logic1Pattern.matcher(line)
    if (matcher.find()) {
        println "0"
        continue
    }
    Matcher matcher2 = logic2Pattern.matcher(line)
    if (matcher2.find()) {
        println "1"
        continue
    }
    Matcher matcher3 = logic3Pattern.matcher(line)
    if (matcher3.find()) {
        println "2"
        continue
    } else println "-1"

}
