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
            99 -> break
            else -> println("select valid assignments between 1..8 and 99 to exit")
        }
    }
    input.close()
}

fun assignment7() {
    val probStmt = """
        To calculate the sum of following series where n is input by user. 
        1 + 1/2 + 1/3 + 1/4 + 1/5 +... +1/n
    """.trimIndent()
    println("assignment7 - $probStmt")

    println("Enter the value of n")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()



    scan.close()
}

fun assignment6() {
    val probStmt = """
        To display Pascal's triangle like right angle traingle.
        Input number of rows: 7                                               
        1                                                                      
        1   1                                                                  
        1   2   1                                                              
        1   3   3   1                                                          
        1   4   6   4   1                                                      
        1   5   10   10   5   1                                                
        1   6   15   20   15   6   1
    """.trimIndent()
    println("assignment6 - $probStmt")

    println("Enter the value of n")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()



    scan.close()
}

fun assignment5() {
    val probStmt = """
        To make such a pattern like a pyramid with numbers increased by 1.
        Input number of rows: 4                                               
               1                                                               
              2 3                                                              
             4 5 6                                                             
            7 8 9 10
    """.trimIndent()
    println("assignment5 - $probStmt")

    println("Enter the value of n")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()



    scan.close()
}

fun assignment4() {
    val probStmt = """
        To make such a pattern like right angle triangle with number increased by 1.
        Sample op Input number of rows: 4        
        1                                                                                  
        2 3                                                                                                         
        4 5 6                                                                                                       
        7 8 9 10
    """.trimIndent()
    println("assignment4 - $probStmt")

    println("Enter the value of n")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()



    scan.close()
}

fun assignment3() {
    val probStmt = """
       Display the sum of the series [ 9 + 99 + 999 + 9999 ...]
    """.trimIndent()
    println("assignment3 - $probStmt")

    println("Enter the value of n")
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()



    scan.close()
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
    scan.close()
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
    scan.close()
}
