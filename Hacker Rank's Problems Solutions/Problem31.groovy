import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


def n = Integer.parseInt(sc.nextLine());


String logic1 = '^[Hh][Ii][\\s][^dD]'


Pattern logic1Pattern = Pattern.compile(logic1);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = logic1Pattern.matcher(line)
    if (matcher.find()) {
        println line
    }

}

