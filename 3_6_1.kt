// create your Laptop class here
class Laptop{
    var ram="4GB"
    var brand="HP"
    var hdd="1TB"
    fun performComputations(){
    println(ram)
    println(brand)
    println(hdd)
        
    }
}


fun main(){

    // Create object of class here    
    var laptop=Laptop()
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()
   
}
