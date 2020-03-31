fun main() {
val terms=10
var first=0;
var second=1
for(i in 1..10){
if(i<=1)
    print(i)
else{
var fib=first+second
first=second
second=fib
print(fib)
    
}
    
}
    
    // write your code here
    
}
