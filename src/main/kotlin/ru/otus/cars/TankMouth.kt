package ru.otus.cars

abstract class TankMouth : Tank {
    abstract var mouthType: String
    private var mouthIsOpen = false

    class PetrolMouth : TankMouth() {
        override var mouthType: String = "PetrolMouth";
        override var amountFuel: Int = 0
    }

    class LpgMouth : TankMouth() {
        override var mouthType: String = "LpgMouth"
        override var amountFuel: Int = 0
    }

    fun open(liters: Int) {
        mouthIsOpen = true
        this.receiveFuel(liters = liters)
    }

    fun close() {
        mouthIsOpen = false
    }
}


