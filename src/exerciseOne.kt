import java.util.*

data class ParkingSpace(var vehicle: Vehicle){
    val MINUTES_IN_MILISECONDS = 60000
    val parkedTime: Long
    get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis)/ MINUTES_IN_MILISECONDS
}

data class Parking(val vehicles: MutableSet<Vehicle> = mutableSetOf()) {
        fun setVehicles(value: Vehicle) = vehicles.add(value)
    }

data class Vehicle(val plate: String, val discountCard: String?, val checkInTime: Calendar) {
    override fun equals(other: Any?) : Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
    return super.equals(other)
    }
    override fun hashCode(): Int = this.plate.hashCode()
}

enum class VehicleType(val type: String, fee: Int) {
    CAR("Car", 20),
    MOTORCYCLE("Motorcycle", 15),
    MICROBUS("Micro Bus",25 ),
    BUS("Bus", 30)
}



