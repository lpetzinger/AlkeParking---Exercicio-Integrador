import java.util.*

data class ParkingSpace(var vehicle: Vehicle, val parking: Parking ){
    val MINUTES_IN_MILISECONDS = 60000
    val parkedTime: Int
        get() = ((Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis)/ MINUTES_IN_MILISECONDS).toInt()

    fun checkoutVehicle(plate: String){
        if(vehicle.plate == plate){
            parking.vehicles.remove(vehicle)
            onSuccess(calculateFee(vehicle.type, parkedTime))
        } else {
            onError()
        }

    }
   private fun onSuccess(fee: Int){

    }

    private fun onError(){

    }

    private fun calculateFee(type: VehicleType, parkedTime: Int) : Int {
        var discountCard = 0
        if(!vehicle.discountCard.isNullOrEmpty()) discountCard = 15/100

        if(parkedTime <= 120 ) {
            return type.fee - (type.fee*discountCard)
        } else {
            return ((parkedTime - 120) % 15) * 5 + type.fee - (type.fee * discountCard)
        }
    }
}

data class Parking(val vehicles: MutableSet<Vehicle> = mutableSetOf()) {
        private val maxNumberOfVehicles = 20
        fun addVehicle (vehicle: Vehicle): Boolean {
            if(vehicles.size < 20){
                println("Welcome to AlkeParking!")
                return vehicles.add(vehicle)
            } else{
                println("Sorry, the check-in failed")
                return false
            }
        }
    }


data class Vehicle(val plate: String, val type: VehicleType, val discountCard: String?, val checkInTime: Calendar) {
    override fun equals(other: Any?) : Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }
    override fun hashCode(): Int = this.plate.hashCode()
}

enum class VehicleType(val type: String, val fee: Int) {
    CAR(type="Car", fee = 20),
    MOTORCYCLE(type="Motorcycle", fee = 15),
    MICROBUS(type= "Micro Bus", fee = 25 ),
    BUS(type = "Bus", fee = 30)
}


