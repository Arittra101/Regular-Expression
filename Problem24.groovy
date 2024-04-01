import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner scanner = new Scanner(System.in)

StringBuilder stringBuilder = new StringBuilder()

def tags = [] as Set<String>

def n, line
n = scanner.nextInt()
scanner.nextLine()

String regex = "<\\s*(\\w+)[^<]*>"
Pattern pattern = Pattern.compile(regex)

for (int i = 0; i < n; i++) {
    line = scanner.nextLine()
    stringBuilder.append(line)
}

Matcher matcher = pattern.matcher(stringBuilder)
while (matcher.find()) {
    String tag = matcher.group(1)
    println(tag)
    tags.add(tag)
}

//def sortedTags = tags.toList().sort().join(";")
//println sortedTags

