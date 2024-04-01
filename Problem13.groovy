
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[a-zA-z]*s$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")