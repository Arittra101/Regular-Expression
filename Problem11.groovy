//^[\d]{2}\d*[a-z]*[A-Z]*0$


def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[\d]{2}\d*[a-z]*[A-Z]*$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")