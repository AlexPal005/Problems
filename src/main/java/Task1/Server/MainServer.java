package Task1.Server;

public class MainServer {
    public static void main(String[] args) {
        int port = 12345;
        Server server = new Server(port);
        server.start_server();
        server.getObject();
    }
}
