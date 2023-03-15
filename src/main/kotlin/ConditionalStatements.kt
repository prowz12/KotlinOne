fun main(args:Array<String>) {
    // IF STATEMENTS
    var age = 20
    if (age <18){
        println("you are underage")
    }else {
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <=24){
        println({"Normal weight"})
    }else if (bmi <=29){
        println("Obese")
    }
    var marks = 30
    if (marks <= 50){
        println("Failed")
    }else if (marks <= 100){
        println("passed")
    }
    // WHEN STATEMENTS
    var bettingNumber = 3
    when (bettingNumber){
        1 -> {
            println("You lost")
        }
        2 -> {
            println("You lost")
        }
        3 -> {
            println("You won")
        }
        4 -> {
            println("You lost")
        }
        else->{
            println("Please enter a number from 1 - 4")
        }
    }
}