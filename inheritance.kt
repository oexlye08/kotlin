/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main(args: Array<String>) {
//     test()
//     numbers()
	val op = Sum()
    println(op.sum(5,3))
    println(op.div(20,4))
}

// fun test(){
//     val a = 5*4
//     println(a)
// }

// fun sum(a: Int, b: Int):Int{
//     return a+b
// }
// 
	class Sum:Div(){
        fun sum(a: Int, b: Int):Int{
            return a+b
        }
    }
    
    open class Div{
        fun div(a: Int, b: Int):Int{
            return a/b
        }
    }