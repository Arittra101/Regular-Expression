import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


int n = Integer.parseInt(sc.nextLine());


//\w+(cellphone)\w+

String totalString = "";
while (n--) {
    String line = sc.nextLine();
    totalString += " " + line;
}

int queryInt = Integer.parseInt(sc.nextLine());

while (queryInt--) {
    int count = 0;
    String word = sc.nextLine();
    String logic1 = "\\w+(${word})\\w+"
    Pattern logic1Pattern = Pattern.compile(logic1);
    Matcher matcher = logic1Pattern.matcher(totalString)
    println(matcher.size())

}
