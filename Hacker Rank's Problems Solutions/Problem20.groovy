//Forward reference creates a back reference to a regex that would appear later.
//Forward references are only useful if they're inside a repeated group.
//Then there may arise a case in which the regex engine evaluates the backreference after the group has been matched already.



def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^(\2tic|(tac))+$/
def count = 0

if(senteceMatcher.find()) println("True")
else println("False")


=


