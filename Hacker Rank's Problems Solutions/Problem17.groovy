

def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^([a-z])([A-Za-z0-9_])(\s)(\W)([0-9])(\D)([A-Z])([A-Za-z])([AEIOUaeiou])(\S)\1\2\3\4\5\6\7\8\9\10$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")


//ab #1?AZa$ab #1?AZa$