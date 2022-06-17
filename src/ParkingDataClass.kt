data class Parking(val vehicles: MutableSet<Vehicle> = mutableSetOf()) {
    private val maxNumberOfVehicles = 20
    var totalVehicles = Pair(0, 0)
    fun totalEarnings() {
        println("${totalVehicles.first} vehicles have checked out and have earnings of $${totalVehicles.second}.")
    }

    fun listVehicles() = println(vehicles.map { it.plate })

    fun addVehicle (vehicle: Vehicle): Boolean {
        if(vehicles.size < 20){
            println("Welcome to AlkeParking!")
            return vehicles.add(vehicle)
        }
        println("Sorry, the check-in failed")
        return false

    }
}