def scanner = new Scanner(System.in)
def inputText = scanner.nextLine()

def senteceMatcher = inputText =~ /hackerrank/
def count = 0


while(senteceMatcher.find()){
    def result = senteceMatcher.group(1)
    println("matching value is : "+result)

}
println("Total Value: " + count)
