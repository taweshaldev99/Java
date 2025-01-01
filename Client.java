import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) {
        String clientAddress = "localhost";
        int port = 1234;
        try(Socket socket = new Socket(clientAddress,port)) {
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                System.out.print("You : ");
                String messageToServer = consoleInput.readLine();
                output.writeUTF(messageToServer);

                if(messageToServer.equalsIgnoreCase("GoodBye")){
                    System.out.println("Chat ended by you.");
                    break;
                }

                String messageFromServer = input.readUTF();
                System.out.println("Server : "+messageFromServer);

                if(messageFromServer.equalsIgnoreCase("GoodBye")){
                    System.out.println("Message Ended by Server.");
                    break;
                }
            }
            input.close();
            output.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

