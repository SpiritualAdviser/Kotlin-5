package ru.otus.cars

class FuelSystem {

    private var amountFuel: Int = 0

    fun getAmountFuel(): String {
        println(amountFuel)
        return amountFuel.toString()
    }


    class TankMouth {

    }

    class Tank {

        fun addFuel(amountFuel: Int): Int {
            return amountFuel + 10
        }
    }

}


