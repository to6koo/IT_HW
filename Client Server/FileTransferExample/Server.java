import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	static ServerSocket ss;

	public static void main(String[] args) throws IOException {
		System.out.println("File server started");
		ss = new ServerSocket(4444);
		BufferedReader br;
		Socket sock;
		while (true) {
			sock = ss.accept();
			br = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			System.out.println("Client connected");
			ServerThread st = new ServerThread(sock, br.readLine());
			new Thread(st).start();
		}
	}
}
