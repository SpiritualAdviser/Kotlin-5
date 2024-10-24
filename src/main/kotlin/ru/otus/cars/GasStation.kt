package ru.otus.cars

class GasStation {

    fun addFuel(car: Car, liters: Int) {
        val typeOfFuel = car.tankMouth.mouthType

        when (typeOfFuel) {
            "PetrolMouth"->petrolRefuelingColumn(car, liters)
            "LpgMouth"->lpgRefuelingColumn(car, liters)

            else-> {
                throw IllegalArgumentException("wrong type of fuel")
            }
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