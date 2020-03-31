fun main() {
    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    print(compareArrayLength(a, b))
}

// Create compareArrayLength() function here
fun compareArrayLength(x :Array<String> ,y: Array<String>) : Boolean {
if(x.size==y.size){
    return true
}
else{
    return false
}
    
}
