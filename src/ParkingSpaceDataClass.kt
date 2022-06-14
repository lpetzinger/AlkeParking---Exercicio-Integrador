import java.util.*

data class ParkingSpace(var vehicle: Vehicle, val parking: Parking) {
    private val MINUTES_IN_MILISECONDS = 60000
    private val parkedTime: Int

    get() = ((Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILISECONDS).toInt()

    fun checkoutVehicle(plate: String) {
        if (vehicle.plate == plate) {
            val totalFee = calculateFee(vehicle.type, parkedTime)
            onSuccess(totalFee)
            parking.vehicles.remove(vehicle)
        } else  onError()

    }

    private fun onSuccess(fee: Int) {
        parking.totalVehicles = Pair(parking.totalVehicles.first + 1, parking.totalVehicles.second + fee)
        println("Your fee is $$fee. Come back soon.")
    }

    private fun onError() = println("Sorry, the check-out failed")

    private fun calculateFee(type: VehicleType, parkedTime: Int): Int {
        var discountCard = 0
        val hasDiscountCard = vehicle.discountCard.isNullOrEmpty()
        if (!hasDiscountCard) discountCard = 15 / 100

        if (parkedTime <= 120) {
            return type.fee - (type.fee * discountCard)
        } else {
            return ((parkedTime - 120) % 15) * 5 + type.fee - (type.fee * discountCard)
        }
    }
}








