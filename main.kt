fun main(){
    var age  =20 
    //  readLine()!!после написания двух знаков восклицания мы можем указать тип в который переводим введенное значение
   //можно писать так , но это слишком неудобно и некрасиво
    if (age>=1){
        var ashole = true
    }
    else{
        var ashole = false
    }
    //также можно писать просто в строку , но это тоже не решение проблемы 
 //var ageRes  = if (age<=18) println("you are so small bro ") else println("Or gosh you like an my grandpa mb you are too wise ")
//а можно вообще на драйве просто писать when и писать все очень понято и быстро
 var superRes  = when {
    age < 1 ->  "not good"
    age > 1 -> "super" 
    else -> "what!!!"
}
var sum  = 100
while(age <=100){
    sum += age
    age++
if (sum>=100){
    break;
}
} 
var firstKotlinArr = arrayOf("Success","Crash","Life")

for (i in firstKotlinArr.indices){
  //  println(firstKotlinArr[i])
}
//обычная функция
fun Suck (x:Int,y:Int):Int{
    return (x+y)
}
//если бы мы были в js то назвали бы это стрелочной функцией , но в kotlin она называется анонимная ф-ция
val Sick : (x:Int,y:Int) -> Int = {
    x,y->
    x/y
}
fun newFuns (array: Array<String>): Array<String>{

    
    array.forEachIndexed { index, item ->
        // Add "Supers" to each item and store it in the new array
      // println("supers" + array)
 //println(array[index] + item)
    }
    return  array
}
//println(newFuns(firstKotlinArr))
//println(Suck(12, 54))//66
//println(Sick(20,4))// 5
//println(firstKotlinArr.random())//выводит рандомный элемент массива
//высоко порядочные функции с действиями  то есть любыми с конктерным интом
fun HighOrder (x:Int,action:(Int) -> Int):Int{
return action(x)
}

//println(HighOrder(4, { x -> x*2 })) //return eight

var IntArray = arrayOf(320,2,32,323,23234,4234)
//фильтер фильтрует как не странно
//println(IntArray.filter({it>12}))//[320, 32, 323, 23234, 4234]

//КЛАССЫ
class User {
var name  = ""
var age  = 0
}
 val classNw = User()
 classNw.age = 20
 //самый обычный класс без конструкторов защищенностей и функций
 //println(classNw.age)//20
 class SuperUser(var name:String,var id :Int, var ready:Boolean, var age:Int){

 }
 val superUser = SuperUser(name = "Roman", id = 2, ready = true, age = 23)
 //println(superUser.name +  "\n" + superUser.ready)//Roman true
 //можно сделать все гораздо проще 
 class SuperEasyUser{
    var name = ""
    var id = 0
    constructor (n:String,m:Int){
name  = n
        id = m
    }
 }
 val superEasyUser = SuperEasyUser("Alex", 323)
//print(superEasyUser.id  )
class GetterAndSetter{
var age = 0
get()  = field +10
set(value){
    if (field<18){
   field = 18
    }
    else{
        field = value
    }

}
}//getter and setter
//гетер и сетер они создают легкую возможность писать кастомную логику на добавление и устаноление свойств обьекта
//короче облегчают работу с логикой установки свойств обьекта
class   RealFunInClass{
    var name = ""
    var age = 0
    constructor(n:String,m:Int){
        name = n.toString()
        age = m
    }
    fun printName(){
        println("You name is so complicated  " + name)
    }
}
var funRun = RealFunInClass("Name",32)
funRun.printName()
}