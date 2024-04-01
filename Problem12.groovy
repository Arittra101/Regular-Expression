//^[0-9]+[A-Z]+[a-z]+$
//^[\d]{2}\d*[a-z]*[A-Z]*0$


def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[0-9]+[A-Z]+[a-z]+$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")