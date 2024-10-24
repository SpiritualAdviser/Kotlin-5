package ru.otus.cars

abstract class TankMouth : Tank {
    abstract var mouthType: String

    class PetrolMouth : TankMouth(), Tank {
        override var mouthType: String = "PetrolMouth";
        override var amountFuel: Int = 0
    }

    class LpgMouth : TankMouth(), Tank {
        override var mouthType: String = "LpgMouth"
        override var amountFuel: Int = 0
    }

    fun open(liters: Int, typeOfFuel: String) {

        if (mouthType === typeOfFuel) {
            this.receiveFuel(liters = liters)

        } else {
            throw IllegalArgumentException("wrong type of fuel")
        }

    }

    fun close() {}
}


