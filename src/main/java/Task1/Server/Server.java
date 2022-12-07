package Task1.Server;

import Task1.Object.Human;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private Socket socket;
    private ServerSocket server;
    private int port;

    public Server(int port) {
        socket = null;
        this.port = port;
    }

    public void start_server() {
        try {
            server = new ServerSocket(port);
            System.out.println("Waiting for a client ...");
            socket = server.accept();
            System.out.println("Client connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getObject() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            Human human = (Human) inputStream.readObject();
            System.out.println(human);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
