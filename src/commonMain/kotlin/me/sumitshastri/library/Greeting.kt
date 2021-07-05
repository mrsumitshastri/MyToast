package me.sumitshastri.library


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}

class MathsUtils {
    fun performSomeCalculations(i: Int, i1: Int, i2: Int): Any {
        return i + i1 + i2
    }
}