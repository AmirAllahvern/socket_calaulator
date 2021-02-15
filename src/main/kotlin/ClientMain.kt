fun main() {
    val address = "localhost"
    val port = 9999

    val client = Client(address, port)
    client.run()
}