
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /(ok){3,}/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")

//okokok! cya