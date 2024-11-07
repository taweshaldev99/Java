import java.net.*;
import java.io.*;

public class MyServer {
    public static void main(String[] args){
        try{
            System.out.println("Server Starting..");
            ServerSocket serverSocket = new ServerSocket(6666);
            System.out.println("Server Started..");
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String string = dataInputStream.readUTF();
            System.out.println("Message= " +string);
            serverSocket.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
