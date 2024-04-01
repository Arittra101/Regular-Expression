
//3threeormorealphabets.


def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[0-9]{1,2}[a-zA-Z]{3,}[.]{0,3}$/
def count = 0


if(senteceMatcher.find()) println("True")
else println("False")
