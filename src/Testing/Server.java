package Testing;

import sun.lwawt.macosx.CSystemTray;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    //constructor w port
    public Server(int port){
        //start and wait
        try{
            server = new ServerSocket(port);
            System.out.println("Server Started");

            System.out.println("Waiting for a client...");

            socket = server.accept();
            System.out.println("Client Accepted!");

            //takes input from client socket
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            String line = "";
            //reads message from client until "Over"
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);

                } catch (IOException i) {
                    System.out.println(i);
                }
            }
                System.out.println("Closing Connection...");

                //close connection
            socket.close();
            in.close();
            } catch (IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
