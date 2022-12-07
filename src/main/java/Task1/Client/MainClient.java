package Task1.Client;

import Task1.Object.Human;

public class MainClient {
    public static void main(String[] args) {
        int port = 12345;
        Client client = new Client(port);
        client.start_client();

        Human human = new Human("Andriy", "Klitenko", 19);
        client.sendObject(human);
    }
}
