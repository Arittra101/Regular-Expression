
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /(?<=[13579])[0-9]/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")


//gooooo

