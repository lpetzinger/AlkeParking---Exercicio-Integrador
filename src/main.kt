import java.util.*

fun main() {
    val car = Vehicle("Car1", VehicleType.CAR, "Discount1",  Calendar.getInstance())
    val motorCycle = Vehicle("moto1", VehicleType.MOTORCYCLE, "Discount2",  Calendar.getInstance())
    val miniBus = Vehicle("minibus1", VehicleType.CAR, "Discount1",  Calendar.getInstance())
    val bus = Vehicle("bus1", VehicleType.CAR, "Discount1",  Calendar.getInstance())
    val bus2 = Vehicle("bus1", VehicleType.CAR, "Discount1",  Calendar.getInstance())

    val parking = Parking(mutableSetOf(car,motorCycle,bus,miniBus))

    println(parking.vehicles.contains(car)) //true
    println(parking.vehicles.contains(motorCycle)) //true
    println(parking.vehicles.contains(miniBus)) ///true
    println(parking.vehicles.contains(bus)) //true
    println(parking.vehicles.add(bus2)) //false
    parking.vehicles.remove(motorCycle)
    println(parking.vehicles.contains(motorCycle)) //false






}