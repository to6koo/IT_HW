import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static ServerSocket ss;

	public static void main(String[] args) throws IOException {
		System.out.println("Server started");
		ss = new ServerSocket(4444);
		Socket sock;

		while (true) {
			sock = ss.accept();
			System.out.println("Connection established");
			ServerThread st = new ServerThread(sock);
			Thread t = new Thread(st);
			t.start();
		}

	}
}