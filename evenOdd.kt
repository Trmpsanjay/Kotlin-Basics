fun main(){
    var i=0;
    println("*************Even*************")
    for(i in 0..100){
        if(i%2==0)
            println(i)
    }
    println("***********Odd*********")
    for(i in 0..100){
        if(i%2!=0)
            println(i)
    }
}
