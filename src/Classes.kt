import java.awt.Color

fun main() {
    class Dog
    {
        var name: String
        var age: Int
        var furColor: String

        constructor()
        {
            name=""
            age=0
            furColor=""
        }
        constructor(name: String,age: Int,furColor: String)
        {
            this.name=name
            this.age=age
            this.furColor=furColor

        }
        fun dogInfo()
        {
            println("$name is $age years old and is $furColor")
        }
    }
    var myDog= Dog("Fido",8,"Red")
    myDog.dogInfo()
}

