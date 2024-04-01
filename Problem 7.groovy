
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[^1234567890][^aeiou][^bcDF][\S][^AEIOU][^a.,]\u0024/
def count = 0


if(senteceMatcher.find()) println("True")
else println("False")

//think? = truethink?