
import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


int cnt=0;

def n = Integer.parseInt(sc.nextLine());




String regex = '^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}';
Pattern pattern = Pattern.compile(regex);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = pattern.matcher(line)
    if (matcher.find()) {
        println "VALID";
    }
    else println "INVALID";
}

