import java.net.ServerSocket
import kotlin.concurrent.thread

fun main(){
    val server = ServerSocket(9999)
    println("Server is running on port ${server.localPort}")

    while (true) {
        val client = server.accept()
        println("Client connected: ${client.inetAddress.hostAddress}")


        thread { Server(client).run() }
    }
}

