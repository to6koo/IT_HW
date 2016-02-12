import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	static Socket sock;
	static BufferedWriter bw;

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		sock = new Socket("localhost", 4444);
		bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print(">>");
			bw.write(scanner.nextLine() + "\n");    		
			bw.flush();
		}
	}
}
