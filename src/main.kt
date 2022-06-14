import java.util.*

fun main() {
    val car = Vehicle("Car1", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val motorCycle = Vehicle("moto1", VehicleType.MOTORCYCLE, "Discount2", Calendar.getInstance())
    val miniBus = Vehicle("minibus1", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val bus = Vehicle("bus1", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val bus2 = Vehicle("bus1", VehicleType.CAR, "Discount1", Calendar.getInstance())

    val parking = Parking(mutableSetOf(car, motorCycle, bus, miniBus))

    println(parking.vehicles.contains(car)) //true
    println(parking.vehicles.contains(motorCycle)) //true
    println(parking.vehicles.contains(miniBus)) ///true
    println(parking.vehicles.contains(bus)) //true
    println(parking.vehicles.add(bus2)) //false

    parking.vehicles.remove(motorCycle)

    println(parking.vehicles.contains(motorCycle)) //false

    val motorCycle2 = Vehicle("moto2", VehicleType.MOTORCYCLE, "Discount2", Calendar.getInstance())
    val car2 = Vehicle("Car1", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car3 = Vehicle("Car2", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car4 = Vehicle("Car3", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car5 = Vehicle("Car4", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car6 = Vehicle("Car5", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car7 = Vehicle("Car6", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car8 = Vehicle("Car7", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car9 = Vehicle("Car8", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car10 = Vehicle("Car10", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car11 = Vehicle("Car11", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car12 = Vehicle("Car12", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car13 = Vehicle("Car13", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car14 = Vehicle("Car14", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car15 = Vehicle("Car15", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car16 = Vehicle("Car16", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car17 = Vehicle("Car17", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car18 = Vehicle("Car18", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car19 = Vehicle("Car19", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val car20 = Vehicle("Car20", VehicleType.CAR, "Discount1", Calendar.getInstance())


    val miniBus2 = Vehicle("minibus2", VehicleType.CAR, "Discount1", Calendar.getInstance())
    val bus3 = Vehicle("bus2", VehicleType.CAR, "Discount1", Calendar.getInstance())

    println(parking.addVehicle(car2))
    println(parking.addVehicle(car3))
    println(parking.addVehicle(car4))
    println(parking.addVehicle(car5))
    println(parking.addVehicle(car6))
    println(parking.addVehicle(car7))
    println(parking.addVehicle(car8))
    println(parking.addVehicle(car9))
    println(parking.addVehicle(car10))
    println(parking.addVehicle(car11))
    println(parking.addVehicle(car12))
    println(parking.addVehicle(car13))
    println(parking.addVehicle(car14))
    println(parking.addVehicle(car15))
    println(parking.addVehicle(car16))
    println(parking.addVehicle(car17))
    println(parking.addVehicle(car18))
    println(parking.addVehicle(car19))
    println(parking.addVehicle(car20))

    println(parking.vehicles.size)

    parking.listVehicles()

    val parkingSpace = ParkingSpace(car19, parking)

    println(parkingSpace)
    println(parkingSpace.checkoutVehicle("Car19"))
}