
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[A-Za-z02468]{40}[13579\s]{5}$/
def count = 0


if(senteceMatcher.find()) println("True")
else println("False")

//2222222222aaaaaaaaaa2222222222aaaaaaaaaa13 57
