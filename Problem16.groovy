
def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^(Mr|Mrs|Ms|Dr|Er)\.[A-Za-z]+$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")

//Dr.xzxsadsasd1212
//Dr.xzxsadsasd
