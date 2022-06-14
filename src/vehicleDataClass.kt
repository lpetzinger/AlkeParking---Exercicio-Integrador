import java.util.*

data class Vehicle(val plate: String, val type: VehicleType, val discountCard: String?, val checkInTime: Calendar) {
    override fun equals(other: Any?) : Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }
    override fun hashCode(): Int = this.plate.hashCode()
}