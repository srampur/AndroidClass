package kotlinsrc.bauscs

import com.sun.org.apache.xpath.internal.operations.Bool

class BaiscUnder {

}

fun main() {
    println("Hello")
    add(12, 30000)
    evenOrOdd(12, 2)


    val a = "29"


    var s: Int = a.toInt()
    var ss = a.toFloat()
    var ssa = a.toDouble()
    var sf = a.toLong()

    if ((s == ss.toInt()).and(ssa == sf.toDouble())) {

    }

    val text = """
    * Tell me and I forget.
    $ Teach me and I remember.
    % Involve me and I learn.
    # (Benjamin Franklin)
    """
    val text1 = "Tell me and I forget." +
            "Teach me and I remember." +
            "Involve me and I learn." +
            "(Benjamin Franklin)"

    println(text)
    println(text1)
    var x: Int = 21
    var y: Int = 21
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

    println()
    println()
    when (x) {
        in 1..10 -> print("x is in the range")
//        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    when {
        x.isOdd() -> print("x is odd")
        y.isEven() -> print("y is even")
        else -> print("x+y is odd")
    }

}

private fun Int.isOdd(): Boolean {
    return true
}

private fun Int.isEven(): Boolean {
    return true
}


fun add(a: Int, b: Int) {
//    return a + b
    println("value $a plus value $b is ${getTotalInterest(2, a, b)}")
}


fun getTotalInterest(interestRate: Int, time: Int, principleAmount: Int): Int {
    return (principleAmount.times(time).times(interestRate)).div(100)
}

fun evenOrOdd(numn: Int, divi: Int) {
    println(
        "${numn} is ${
            if (numn % divi == 0) {
                "even"
            } else {
                "odd"
            }
        }"
    )
}