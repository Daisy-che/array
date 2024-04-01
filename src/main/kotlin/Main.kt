fun main() {
var friends=arrayOf("Ben","Paul","Ken", "Mary","Susan")
people(arrayOf("Ben","Paul","sam","Ken"))

    friends = friends.plus(arrayOf("Natalie","Daisy","Gatweri"))
    println(friends.contentToString())
    println(friends.indexOf("Ken"))

    val statistics= arrayOf(21,14,56,18,9,32,5,6,32,67,88,43)
    println(statistics.maxOrNull())
    println(statistics.sum().toDouble()/statistics.size)

var friends1=arrayOf("Ben","Paul","Ken", "Mary","Susan")
    friends1=friends1.sortedArray()
    println(friends1.contentToString())

    var friends2=arrayOf("Ben","Paul", "Abraham")
friends2.forEach{ f->
    friends.forEachIndexed{idx,f->
        if(idx==1|| idx==2){
            println(f)
        }

    }

println(f)
    }
    statistics.forEach{stat->
        println(stat*stat)

    }
    for(f in friends){
        println(f)
    }
    for(stat in statistics){
        println(stat*stat)


    }
}
fun people(names:Array<String>){
    println(names.contentToString())
}




