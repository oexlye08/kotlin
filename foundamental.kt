/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
   
   
   //varaible
   val x = 5
   val y = 4

   println(x*y)
    
    val age = 20
    val result = age*5/4
    println(result)
    
    //double and float
    val pi = 3.14
    
    val myAge = 23.0
    val myResult = myAge*5/4
    println(myResult)
    
    //string
    val name = "Oki"
    val surename = "Sulton"
    val fullname = name + " " + surename
    
    println(fullname)
    
    //boolean
    var isAlive = true
    isAlive = false
    
    //array
    val myArray = arrayOfNulls<String>(4)
    myArray[0] = "Siti"
    myArray[1] = "Manan"
    myArray[2] = "Gaplek"
    myArray[3] = "Wawok"
    
    println(myArray[3])
    
    val myNumberArray = intArrayOf(10,20,30,40,50)
    println(myNumberArray.size)
    myNumberArray.set(1, 25)
    println(myNumberArray[1])
//     myNumberArray.get(1)

    //list
    val myMusician = ArrayList<String>()
    myMusician.add("Manohara")
    myMusician.add("Sutanto")
    
    println(myMusician)
    
    myMusician.add(1, "Kirik")
    println(myMusician)
    
    //set
    val mySet = HashSet<String>()
    
    mySet.add("Papano")
    mySet.add("Colorado")
    
//     println(mySet)
    
    //Hashmap
    val myHashMap = HashMap<String, String>()
    myHashMap.put("name", "Pitri")
    myHashMap.put("position", "Deffender")
    
//     println(myHashMap)
    println(myHashMap["position"])
    
    //operator
    var m = 5
    println(m)
    m = m+1
    println(m)
    m++
    println(m)
    m--
    println(m)
    
    var n = 6
    println(m<n)
    
    // <
    // >
    // >=
    // <=
    // ==
    // !=
    // &&
    // ||
    
    //if

    if(m<n){
        println("M lebih kecil dari N")
    }else if(m>n){
        println("M lebih besar dari N")
    }else{
        println("M sama dengan N")
    }
    
    //switch
    val day = 3
    var dayString = ""
    
    if(day == 1){
        dayString = "Sunday"
    }else if(day == 2){
        dayString = "Monday"
    }else if(day == 3){
        dayString = "Tuesday"
    }
    
    when (day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        else -> dayString = "Wednesday"
    }
    
    println(dayString)

    //for loops
    val myNumbers = intArrayOf(12,15,18,21,24)
    
    val q = myNumbers[1] /3*5
    println(q)
    println()
    
    for (number in myNumbers){
        val z = number / 3*5
        println(z)
    }
    
    for (i in myNumbers.indices){
        val y = myNumbers[i] / 3*5
        println(y)
    }
    println()
    
    for (a in 0..9){
        val x = a+1
        println(x)   
    }
    println()
    
    //while loop
    var j = 0
    while(j<=10){
        val k = j * 10
        println(k)
        j++
    }

}
