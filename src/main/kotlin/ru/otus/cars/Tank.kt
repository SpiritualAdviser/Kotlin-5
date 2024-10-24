package ru.otus.cars

interface Tank {

    var amountFuel: Int

    fun getContents(): String {
        return amountFuel.toString()
    }

    fun receiveFuel(liters: Int) {
        amountFuel += liters
    }
}