fun main() {
    println("Teste main")
    var vehicleOne = Vehicle("122344")

    println("veiculo: $vehicleOne")

    var parking = Parking()
    println("Parking vazio: $parking")
    parking.setVehicles(vehicleOne)
    println("Parking preenchido: ${parking.vehicles}")

}