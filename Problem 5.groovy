

def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^\d\w{4}.$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")