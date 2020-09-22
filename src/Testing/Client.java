package Testing;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class Client {

    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;
    //private String url = "https://youtu.be/BqBKEXLqdvI";

    // constructor for IP address and port
    public Client(String address, int port){
        //establish connection
        try{
            socket = new Socket(address, port);
            System.out.println("Connected");

            //input
            input = new DataInputStream(System.in);

            //output
            output = new DataOutputStream(socket.getOutputStream());

        } catch(UnknownHostException u){
            System.out.println(u);
        } catch (IOException i){
            System.out.println(i);
        }

        //String to read from
        String line = "";

        //keep reading until "Over"
        while(!line.equals("Over")){
            try{
                line = input.readLine();
                output.writeUTF(line);
            } catch (IOException i){
                System.out.println(i);
            }
        }

        //close the connection
        try{
            input.close();
            output.close();
            socket.close();
        } catch(IOException i){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1" /*localhost*/,5000);
    }

}
