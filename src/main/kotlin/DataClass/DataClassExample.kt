package DataClass

data class DataClassExample(val firstName: String, val lastName: String)

interface UserRepo {
    fun findAll(): List<DataClassExample>
}

class Example : UserRepo {
    override fun findAll(): List<DataClassExample> {
        return listOf(getDTO())
    }

    private fun getDTO(): DataClassExample {
        return DataClassExample(firstName = "Prasad", lastName = "Thangavel")
    }

}

fun main(){
    val example = Example()
    println(example.findAll())
}