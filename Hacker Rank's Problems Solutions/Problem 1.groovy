def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /[0-9]{2}\D[0-9]{2}\D([0-9]{4})/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")
