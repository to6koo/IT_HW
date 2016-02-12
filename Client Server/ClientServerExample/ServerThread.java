import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ServerThread  implements Runnable{
	
	Socket sock;
	BufferedReader br;
	
	public ServerThread(Socket sock){
		this.sock = sock;
		try {
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		} catch (IOException e) {
		System.out.println("Kura mi qnko");
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				String in = br.readLine();
				if(in != null)
				System.out.println(in);
				else{
					System.out.println("Client disconnected");
					return;
				}	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
