import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String [] args){
        try{
            Socket socket = new Socket("localhost",6666);
            Thread.sleep(5000);
            DataOutputStream dataOutputStream= new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("HelloServer");
            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
