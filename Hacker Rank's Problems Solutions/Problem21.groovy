
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /o(?=oo)/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")




