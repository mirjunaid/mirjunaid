fun main() {
    println("Enter\n 1 for addition: \n 2 for subtraction: \n 3 for multiplication: \n 4 for division: " +
            "\n 5 for modular division: \n 6 for factorial: \n 7 for fibonacci series: " +
            "\n 8 for Nth term of arithmetic progression: \n 9 for sum of N terms of an AP:  ")
    val n = Integer.valueOf(readLine())
     if(n==1){
        val sum = add()
        println("The sum of the given numbers is: $sum")
    }
    else if(n==2){
        val sub = subtract()
        println("The difference between given two numbers is: $sub")
    }
    else if (n==3){
        val mul = multiplication()
        println("The product of the two numbers is: $mul")
    }
    else if (n==4){
        val div = division()
        println("The coefficient of the division is: $div")
    }
    else if (n==5){
        val md = modulardivision()
        println("The remainder of the division is: $md")
    }
    else if (n==6){
        val fac = fact()
        println("the factorial of the given numbers is $fac")
    }
    else if (n==7){
         val fib = fibonacci()
         println("The last term of the required fibonacci series is: $fib")
    }
    else if (n==8){
        val nth = nthtermofAP()
         println("The Nth term of the given AP is: $nth")
    }
    else if (n==9){
        val s = sumofNtermsofAP()
         println("The sum of N terms of the given AP is: $s")
    }
    else{
        println("You are a boring person go and get a life.")
    }
}
fun add(): Int {
    println("Enter first number: ")
    val a = Integer.valueOf(readLine())
    println("Enter second number: ")
    val b = Integer.valueOf(readLine())
    return a + b
}
fun subtract(): Int {
    println("Enter first number: ")
    val x = Integer.valueOf(readLine())
    println("Enter second number: ")
    val y = Integer.valueOf(readLine())
    return x-y
}
fun multiplication(): Int {
    println("Enter first number: ")
    val a = Integer.valueOf(readLine())
    println("Enter second number: ")
    val b = Integer.valueOf(readLine())
    return a * b
}
fun division(): Int {
    println("Enter first number: ")
    val a = Integer.valueOf(readLine())
    println("Enter second number: ")
    val b = Integer.valueOf(readLine())
    return a/b
}
fun modulardivision(): Int {
    println("Enter first number: ")
    val a = Integer.valueOf(readLine())
    println("Enter second number: ")
    val b = Integer.valueOf(readLine())
    return a % b
}
fun fact(): Int {
    println("Enter the number whose factorial is to be found: ")
    val a = Integer.valueOf(readLine())
    var result =1
    for (i in 1..a)
        result =+ result*i
    return result
}
fun fibonacci():Int {
    println("Enter first number of the fibonacci series: ")
    var a = Integer.valueOf(readLine())
    println("Enter second number of the fibonacci series: ")
    var b = Integer.valueOf(readLine())
    println("Enter the number of terms of the series to be printed: ")
    val n = Integer.valueOf(readLine())
    var result = 0
    println("$a")
    for (i in 0..n){
        result = a+b
        a=b
        b=result
        println("$result")
    }
    return result
}
fun nthtermofAP(): Any {
    println("Enter the first term of the AP: ")
    val a = Integer.valueOf(readLine())
    println("Enter the number of terms of the AP: ")
    val n = Integer.valueOf(readLine())
    println("Enter the common difference of the AP: ")
    val cd = Integer.valueOf(readLine())
    return a + (n - 1) * cd
}
fun sumofNtermsofAP(): Any{
    println("Enter the first term of the AP: ")
    val a = Integer.valueOf(readLine())
    println("Enter the number of terms of the AP: ")
    val n = Integer.valueOf(readLine())
    println("Enter the common difference of the AP: ")
    val cd = Integer.valueOf(readLine())
    return n/2*(2*a+(n-1)*cd)
}