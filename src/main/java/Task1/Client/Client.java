package Task1.Client;

import Task1.Object.Human;

import java.io.*;
import java.net.Socket;

public class Client {
    private Socket socket;
    private int port;
    private final String host = "localhost";

    public Client(int port) {
        socket = null;
        this.port = port;
    }

    public void start_client() {
        try {
            System.out.println("Connecting to server...");
            socket = new Socket(host, port);
            System.out.println("Connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendObject(Human human) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(human);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
