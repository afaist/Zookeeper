fun main() {
    // put your code here
    var outStr = ""
    for (i in 1..5){
        if (outStr.isNotEmpty()) outStr += " "
        outStr += readLine()!!
    }
    println(outStr)
}