def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /\S{2}\s\S{2}\s\S{2}/
def count = 0


if(senteceMatcher.find()) println("True")
else println("False")

//12 11 15 - true