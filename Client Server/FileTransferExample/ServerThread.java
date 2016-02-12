import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerThread implements Runnable {

	Socket sock;
	String name;

	public ServerThread(Socket sock, String name) {
		this.sock = sock;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File testFile = new File("/home/dian/Pictures/Test/" + name + ".png");
		try {
			FileOutputStream fos = new FileOutputStream(testFile);
			InputStream is = sock.getInputStream();

			byte[] buffer = new byte[4000];
			int count;

			while ((count = is.read(buffer)) > 0) {
				fos.write(buffer, 0, count);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
