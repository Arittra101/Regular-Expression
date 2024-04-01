import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


def n = Integer.parseInt(sc.nextLine());


String logic1 = '^([0-9]{1,3})[\\-\\s]([0-9]{1,3})[\\-\\s]([0-9]{4,10})$'


Pattern logic1Pattern = Pattern.compile(logic1);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = logic1Pattern.matcher(line)

    int groupCount = matcher.groupCount();
    def numberArea = ["CountryCode", "LocalAreaCode", "Number"]
    if (matcher.find()) {

        for (int i = 1; i <= groupCount; i++) {
            if (i < groupCount)
                print "${numberArea[i - 1]}=${matcher.group(i)},"
            else print "${numberArea[i - 1]}=${matcher.group(i)}"
        }
        println()

    }


}

