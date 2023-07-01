package com.ph03nixc0ders.njilaka.utils

import kotlin.random.Random

class Utilities {

    companion object{
        fun generateRandomNumber(numbers:Int,min:Int,max:Int):String{
            var result=""
            var lastNumber=0
            var index=0
            while (index<numbers){
                var randomNumber= Random.nextInt(min,max)
                if(index!=0){
                    while (randomNumber==lastNumber){
                        randomNumber= Random.nextInt(min,max)
                    }
                }

                lastNumber=randomNumber
                result+="$randomNumber"+(if (index!=numbers-1) "-" else "")
                ++index
            }

            return result
        }
    }
}