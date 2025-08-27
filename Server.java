 import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started, waiting for client...");
        Socket socket = server.accept();

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        output.println("Hello Client, this is Server!");
        System.out.println("Client says: " + input.readLine());

        socket.close();
        server.close();
    }
} 