
data class ParkingSpace(var vehicle: Vehicle)

data class Parking(val vehicles: MutableSet<Vehicle> = mutableSetOf()) {
        fun setVehicles(value: Vehicle) = vehicles.add(value)
    }

data class Vehicle(val plate: String) {
    override fun equals(other: Any?) : Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
    return super.equals(other)
    }

    override fun hashCode(): Int = this.plate.hashCode()
    }

/*
propriedades:
tipo
tarifa
 */
enum class VehicleType(val type: String, fee: Int) {
    CAR("Car", 20),
    MOTORCYCLE("Motorcycle", 15),
    MICROBUS("Micro Bus",25 ),
    BUS("Bus", 30)
}



