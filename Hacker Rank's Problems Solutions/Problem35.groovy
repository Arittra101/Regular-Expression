import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);


def n = Integer.parseInt(sc.nextLine());
def emptyMap = [:]

def programmeName = ["C","CPP","JAVA", "PYTHON", "PERL", "PHP", "RUBY", "CSHARP", "HASKELL", "CLOJURE", "BASH", "SCALA", "ERLANG", "CLISP", "LUA", "BRAINFUCK", "JAVASCRIPT", "GO", "D", "OCAML", "R",
                     "PASCAL", "SBCL", "DART", "GROOVY", "OBJECTIVEC"]


for (int i = 0; i < programmeName.size(); i++) {
    emptyMap[programmeName[i]] = 1;
}

//print "${numberArea[i - 1]}=${matcher.group(i)},"

String logic1 = '^[\\d]{1,}\\s([A-Za-z]+)$'
Pattern logic1Pattern = Pattern.compile(logic1);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = logic1Pattern.matcher(line)
    if (matcher.find()) {
        def programme = matcher.group(1);
        if (emptyMap[programme]) {
            println "VALID"
        }
        else println "INVALID"


    } else println "INVALID"

}


