
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[a-z][1-9][^a-z][^A-Z][A-Z]/
def count = 0


if (senteceMatcher.find()) println("True")
else println("False")

//h4CkR