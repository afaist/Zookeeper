import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    // put your code here
    var k = 5
    while (k > 0) {
        val lst: List<String> = scanner.nextLine().split(" ")
        for(w in lst){
            k -= 1
            println(w)
        }
    }
}