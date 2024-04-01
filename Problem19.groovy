

def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[0-9]{2}((?|---|\.|-|:))[0-9]{2}\1[0-9]{2}\1[0-9]{2}$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")


//ab #1?AZa$ab #1?AZa$

