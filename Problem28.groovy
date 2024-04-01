
import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


int cnt=0;

def n = Integer.parseInt(sc.nextLine());




String regex = '[Hh][Aa][Cc][Kk][Ee][Rr][Rr][Aa][Nn][Kk]';
Pattern pattern = Pattern.compile(regex);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = pattern.matcher(line)
    if (matcher.find()) {
        cnt++;
    }
}
println "${cnt}";