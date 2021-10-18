import kotlin.random.Random
import kotlin.random.nextInt

//Defining an anonymous greeting function
//Adding a playerName parameter to the anonymous function
//Using the it keyword
//Accepting a second argument
//Using type inference
//Adding the runSimulation function
//Passing a trailing lambda
//Defining the printConstructionCost function
//Adding a costPrinter parameter

fun main() {

    //val greetingFunction = { playerName : String , numBuildings: Int ->

    runSimulation("guyal",::printConstructionCost) { playerName, numBuildings ->

        val currentYear = 2018

        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

    // println(greetingFunction("guyal",2))
    //runSimulation("guyal",greetingFunction) }
}


         fun runSimulation (playerName:String , costPrinter:(Int) -> Unit , greetingFunction : (String , Int) -> String){

          val numBuildings = Random.nextInt(1..3)
             println(greetingFunction(playerName , numBuildings))}


             fun printConstructionCost(numBuildings: Int) {
                 val cost = 500
                 println("construction cost: ${cost * numBuildings}") }



