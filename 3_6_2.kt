class Laptop {
   var ram: Int = 4
   var brand: String = "Dell"
   var hdd: Int = 512

   fun performComputations(){
       println("I perform computations")
   }
}

fun main(){
var l=Laptop()
var m=Laptop()
l.performComputations()
m.performComputations()
    
    // Create objects here
   
}
