fun main (){
val word = "elephant"
    val reversed = reverseString("elephant")
    println(reversed)
    personDetails("Agnes",22,"Nakuru")
    calculateArea(10,3.142)
    modulus(50.00,20.32)
    greeting("Ajema")
}
fun reverseString(s:String):String {
   return s.reversed()
}

fun personDetails (name:String,age:Int,city:String){
    println("my name is $name i am $age from $city")
}
fun calculateArea(r:Int,pi:Double){
    println(r*r*pi)
}

fun modulus (num1:Double,num2:Double){
    var result = num1%num2
    println(result)
}
fun greeting(name: String){
    var name = "Hello $name"
    println(name)
}