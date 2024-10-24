package ru.otus.cars

class GasStation {

    fun addFuel(car: Car, liters: Int) {

        safeStation {
            val typeOfFuel = car.tankMouth.mouthType

            when (typeOfFuel) {
                "PetrolMouth"->petrolRefuelingColumn(car, liters)
                "LpgMouth"->lpgRefuelingColumn(car, liters)

                else-> {
                    throw IllegalArgumentException("wrong type of fuel")
                }
            }
        }
    }

    private inline fun safeStation(block: ()->Unit) {
        try {
            block()
        } catch (e: Exception) {
            println("blow on gas station")
        }
    }

    private fun petrolRefuelingColumn(car: Car, liters: Int) {
        car.tankMouth.open(liters)
        car.tankMouth.close()
    }

    private fun lpgRefuelingColumn(car: Car, liters: Int) {
        car.tankMouth.open(liters)
        car.tankMouth.close()
    }
}