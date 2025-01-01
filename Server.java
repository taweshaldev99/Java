// Exit when one of them says goodbye

import java.util.*;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 1234;
        try (ServerSocket serverSocket = new ServerSocket(port)) {

            Socket socket = serverSocket.accept();  //connection established

            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);
            //BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
            //String messageFromClient, messageToClient;

            while (true) {
                String messageFromClient = input.readUTF();
                System.out.println("Client : " + messageFromClient);

                if (messageFromClient.equalsIgnoreCase("GoodBye")) {
                    System.out.println("Chat ended by Client.");
                    break;
                }

                System.out.print("You : ");
                //String messageToClient = consoleInput.readLine();
                String messageToClient = sc.nextLine();
                output.writeUTF(messageToClient);

                if (messageToClient.equalsIgnoreCase("GoodBye")) {
                    System.out.println("Chat ended by you.");
                    break;
                }
            }

            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}