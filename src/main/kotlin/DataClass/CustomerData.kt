package DataClass

data class CustomerData(var data:String,var age:Int)

fun main(){
    var customerData = CustomerData("Prasad",1)
    println(::doSomethingAwesome)

}

fun doSomethingAwesome(customerData: CustomerData):String{
    return customerData.data
}