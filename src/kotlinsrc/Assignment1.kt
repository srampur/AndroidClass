package kotlinsrc

import java.util.Scanner

class Assignment1 {
}

fun main() {
    println("Assignments")
    val input = Scanner(System.`in`)

    while (true) {
        println("Select Assignments and 99 to exit")
        when (input.nextInt()) {
            1 -> assignment1()
            2 -> assignment2()
            3 -> assignment3()
            4 -> assignment4()
            5 -> assignment5()
            6 -> assignment6()
            7 -> assignment7()
            8 -> assignment8()
            99 -> break
            else -> println("select valid assignments between 1..8 and 99 to exit")
        }
    }
}

fun assignment8() {
    println("assignment8 - Not yet implemented")
}

fun assignment7() {
    println("assignment7 - Not yet implemented")
}

fun assignment6() {
    println("assignment6 - Not yet implemented")
}

fun assignment5() {
    println("assignment5 - Not yet implemented")
}

fun assignment4() {
    println("assignment4 - Not yet implemented")
}

fun assignment3() {
    println("assignment3 - Not yet implemented")
}

fun assignment2() {
    val probStmt = """
        Print a square pattern with # character.
    """.trimIndent()
    println("assignment2 - $probStmt")

    println("Enter the value of n")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    var i = n
    var j = n

    while(i > 0) {
        while(j > 0) {
            print('#')
            j--
        }
        j = n
        i--
        println()
    }
    println()
}

fun assignment1() {
    val probStmt = """
        Calculate the sum of the series (1*1) + (2*2) + (3*3) + (4*4) + (5*5) + ... + (n*n).
    """.trimIndent()
    println("assignment1 - $probStmt")

    println("Enter the value of n")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    var i = 1
    var sum = 0
    var computation = ""
    while (i <= n) {
        computation += "($i * $i)"

        sum += (i * i)
        i += 1

        if (i <= n)
            computation += " + "
    }
    println("Sum of the $computation series = $sum")
}
