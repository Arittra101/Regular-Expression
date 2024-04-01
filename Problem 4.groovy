

def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /\w{3}\W\w{10}\W\w{3}/
def count = 0


if(senteceMatcher.find()) println("True")
else println("False")
