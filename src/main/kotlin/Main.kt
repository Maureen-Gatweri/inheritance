fun main() {
  printNationality("Tanzania")
    printNationality("Ethiopian")
    printNationality("Uganda")
    printNationality("Kenya")
    assignSchool(450)
    assignSchool(60)
    printNationalityWhen("South Africa")
    printNationalityWhen("kenya")
    printNationalityWhen("South Sudan")
    fruits("kiwi")
    fruits("apple")
    fruits("pineaple")


}
fun printNationality(country:String){
    if (country=="Tanzania"){
        println("Tanzanian")
}

else if (country=="Uganda"){
    println("Ugandan")
}
    else if(country=="Kenya"){
        println("Kenyan")
    }
    else if (country=="South Sudan") {
        println("Sudanese")
    }
        else if(country=="Malawia")
            println("Malawian")

        else{
        println("Foreigner")
    }
}
fun assignSchool(marks:Int){
    if (marks>390){
        println("national school")
    }
    else if (marks in 350..389){
        println("Provincial")
    }
    else {
        println("District")
    }
}
fun printNationalityWhen(country:String){
    when (country){
        "Tanzania" -> println("Tanzanian")
        "Uganda" -> println("Ugandan")
        "kenya" -> println("kenyan")
        "Malawi" -> println("Malawian")
        "South Sudan" -> println("Sudanese")

        else -> println("Foreiner")
    }
}

fun fruits(tunda:String){
    when (tunda){
        "apple" -> println("love it")
        "watermelon" -> println("is a fruit")
        "banana" -> println("is sweet")
        "grapes" ->  println("is yucky")

        else -> println("is poisonous")
    }
}
