def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /^[123][120][xs0][30Aa][xsu][.,]$/
def count = 0


if (senteceMatcher.find()) println("True")
else println("False")

