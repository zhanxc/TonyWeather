//kotlin learning

import kotlin.math.E
import kotlin.math.PI

fun main() {
//    println("run kt scripts")
//    luckynumber(2)
//      luckynumber(3)
    val nums = mutableListOf(1, 2, 3, 4, 5)
//    nums[0] = 10
    for (element in nums) {
//        print("PI * $element = ${element * PI} \n")
//        print("\n")
//        print(E)
    }
//    nums.size
//    nums[0]
    for (i in (1..9)) {
        for (j in (1..i)) {
            print("$i * $j = ${i*j} ")
        }
        println()
    }
    println()


}

fun luckynumber(number: Int) {
    if (number == 1) {
        print("sorry!")
    }
    else if (number == 2) {
        print("you won!")
    }
    else {
        print("get iphone 14!")
    }
}

//fun luckynumber(number: Int) {
//    when(number) {
//        1 -> print("sorry! please try again later...")
//        2 -> print("you won!")
//    }
//}