
import java.util.Scanner
import java.util.regex.Matcher
import java.util.regex.Pattern

Scanner sc = new Scanner(System.in);

//println "Enter the number of lines: "
def n = Integer.parseInt(sc.nextLine());

//println "Enter your String in input: "


String IPV4regex = '^([0-9][0-9]\\.|[0-9]\\.|0[0-9]?[0-9]?\\.|1[0-9]?[0-9]?\\.|2[0-5]?[0-5]?\\.){3}([0-9][0-9]|[0-9]|0[0-9]?[0-9]?|1[0-9]?[0-9]?|2[0-5]?[0-5]?)$';
String IPV6regex = '^([a-f0-9]{1,4}\\:){7}([0-9a-f]{1,4})$';
Pattern ipv4Pattern = Pattern.compile(IPV4regex);
Pattern ipv6Pattern = Pattern.compile(IPV6regex);

while (n--) {
    String line = sc.nextLine();
    Matcher matcher = ipv4Pattern.matcher(line)
    Matcher matcher2 = ipv6Pattern.matcher(line)
    if (matcher.find()) {
        println "IPv4"
    } else if(matcher2.find()){
        println "IPv6"
    }
    else println "Neither"
}



//^([0-9][0-9]\.|[0-9]\.|0[0-9]?[0-9]?\.|1[0-9]?[0-9]?\.|2[0-5]?[0-5]?\.){3}([0-9][0-9]|[0-9]|0[0-9]?[0-9]?|1[0-9]?[0-9]?|2[0-5]?[0-5]?)$

//^([a-f0-9]{1,4}\:){7}([0-9a-f]{1,4})$