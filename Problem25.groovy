//The dot (.) matches anything (except for a newline).
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^((.){3})\.((.){3})\.((.){3})\.((.){3})$/
def count = 0

if (senteceMatcher.find()) println("True")
else println("False")


//!#3.456.abc.def
