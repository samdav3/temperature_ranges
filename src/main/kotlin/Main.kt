fun main(args: Array<String>) {
    val temperature = 98.5
    val low = 97.5
    val normal = 99.5

    if (temperature < low)
        println("The temperature is $temperature, this temperature is low.")
    else if (temperature < normal)
        println("The temperature is $temperature, this temperature is normal.")
    else
        println("The temperature is $temperature, this temperature is high.")
}