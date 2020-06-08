package Server;

import Veriler.Veri;
import java.io.*;
import java.net.Socket;

public class Client extends Observer{
   
    private ObjectOutputStream ois;
    private Socket clientSocket = null;

    private Veri veri;
    private boolean kapali = false;

    public Client(Socket clientSocket, Veri veri) {

        this.clientSocket = clientSocket;
        this.veri = veri;
        try {
             ois = new ObjectOutputStream(clientSocket.getOutputStream());
        } catch (Exception e) {
        }
    }

    @Override
    public boolean update() {
        boolean basarili = false;
        try {
              ois.writeObject(veri);
              ois.reset();
              System.out.println("Yazdı");
              basarili = true;
         
        } catch (Exception e) {
           
        } 
        
        return basarili;
    }


}
