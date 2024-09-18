package com.example.learnandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.learnandroid.weekTwo.Week2DayOne
import com.example.learnandroid.weekOne.DayOne
import com.example.learnandroid.weekTwo.Week2DayThree
import com.example.learnandroid.weekTwo.Week2DayTwo
import com.example.learnandroid.weekTwo.Week2DayTwo.Direction.Down.move

class MainActivity : ComponentActivity(), Week2DayThree.NetworkStateListener by Week2DayThree.NetworkStateHandler(){

    private val dayOne = DayOne()
    private val week2Day2 = Week2DayTwo()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Type of Function
//        dayOne.funWithArgument("John Youlong", 21,4813)
//        dayOne.funWithoutArgument()
//        val result = dayOne.funWithDefaultArgument()
//        Log.e("Test", "$result")

        //Calling Array from Class DayOne
//        val arr1 = dayOne.array1
//        Log.e("Array", arr1.toList().toString())

        //Sum Array
        val arr2 = dayOne.array2
        var sum = 0
        for (arr in arr2) {
//            sum += arr
        }
//        Log.e("Array", "$sum")

        val arr3 = dayOne.nestedArray
//        Log.e("Array", arr3.contentDeepToString())

         //Calling Empty ArrayList and add value
        val arrList = dayOne.arrayList1
        arrList.add("Apple")
        arrList.add("Orange")
        arrList.add("Watermelon")
        arrList.add("Peach")
        arrList.add(10.toString())
//        Log.e("arrayList", "$arrList")

        //Immutable list
        val list1 = dayOne.immuttablelist
//        Log.e("list","$list1")

        //Mutable List, Add, Modify and Remove
        val list2 = dayOne.muttablelist
        list2.add(10)
        list2[1] = 99
        list2.removeAt(3)
//        Log.e("list","$list2")

        //set
        val set1 = dayOne.setOf
//        Log.e("list","$set1")

        //Add add and remove
        val set2 = dayOne.mutableSetOf1
        set2.add(99)
        set2.remove(10)
//        Log.e("list","$set2")

        //Map
        val map1 = dayOne.map2
//        Log.e("map", "$map1")
        val map2 = dayOne.map2
//        Log.e("Map", "$map2")

        //MutableMap
        val map3 = dayOne.mutablemap
        //add , modify and
        map3.put("Geography", 60)
        map3.remove("Math")
//        Log.e("Map", "$map3")

        //Using Enum Class
        val week2day1 = Week2DayOne()
        val enum1 = week2day1.light(Week2DayOne.TrafficLight1.GREEN)
//        Log.e("", enum1)

        val enum2 = week2day1.day(Week2DayOne.Weekday.MONDAY)
        for(i in Week2DayOne.TrafficLight1.entries) {
//            Log.e("", "$i")
        }
//        Log.e("", enum2)


        for(i in Week2DayOne.TrafficLight2.entries) {
//            Log.e("", "$i")
        }

        val result = Week2DayOne.TrafficLight2.YELLOW
//        Log.e("", "$enum3")
//        if (result == Week2DayOne.TrafficLight2.RED) {
//            Week2DayOne.TrafficLight2.RED.info()
//        } else if(result == Week2DayOne.TrafficLight2.YELLOW){
//             Week2DayOne.TrafficLight2.YELLOW.info()
//        } else {
//            Week2DayOne.TrafficLight2.GREEN.info()
//        }
//        Week2DayOne.TrafficLight2.RED.info()
//        Week2DayOne.TrafficLight2.GREEN.info()
//        Week2DayOne.TrafficLight2.YELLOW.info()

        val traffic = Week2DayOne.TrafficLight2.GREEN
//        Log.e("", "The color is ${traffic.getColor()} for ${traffic.getDuration()} second")


        val direction = move(Week2DayTwo.Direction.Left)
//        Log.e("",  "The direction is $direction")


        //Using sealed class
        val circle: Week2DayTwo.Shape = Week2DayTwo.Shape.Circle(5.0)
        val rectangle1: Week2DayTwo.Shape = Week2DayTwo.Shape.Rectangle(4.0, 6.0)
        val triangle: Week2DayTwo.Shape = Week2DayTwo.Shape.Triangle(10.0,12.5)
//        Log.e("", "${triangle.area()}")



        val rectangle2 = Week2DayTwo.MathCalculation.PerimeterOfRectangle(10.0,15.0)
//        Log.e("", "${rectangle2.result()}")


        //Inline Function
        val week2day3 = Week2DayThree()
        val result1 = week2day3.calculate(10,3) { a, b -> a + b }
        val result6 = week2day3.calculate(9,5) { a, b -> a * b }
        val result7 = week2day3.calculate(2,50) { a, b -> a / b }
        val result8 = week2day3.calculate(25,80) { a, b -> a - b }
//        Log.e("", "$result1")
//        Log.e("", "$result6")
//        Log.e("", "$result7")
//        Log.e("", "$result8")

        val result2 = week2day3.test("John", " Youlong") {
            a, b -> a + b
        }
//        Log.e("", result2)

//        val result3 = week2day3.performOperation{
//            Log.e("","Perform operation...")
//        }
//        Log.e("", "$result3")


        val result4 = week2day3.name.value
//        Log.e("" , result4)

//        val result5 = week2day3.Pass
        val result5= Week2DayThree.Password("You can access this!!")
//        Log.e("", "$result5")

        week2day3.performOperation {
            println("Hello Bro")
        }

        observeNetworkState(context = this, lifecycleOwner = this)

        enableEdgeToEdge()
    }
}