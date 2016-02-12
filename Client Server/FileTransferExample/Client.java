import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		Socket sock = new Socket("127.0.0.1", 4444);
		
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
		br.write("tashko" + "\n");
		br.flush();
		
		OutputStream os = sock.getOutputStream();
		File testFile = new File("/home/dian/Pictures/test.png");
		FileInputStream fis = new FileInputStream(testFile);

		byte[] buffer = new byte[4000];
		int count;
		
		while ((count = fis.read(buffer)) > 0) {
			os.write(buffer, 0, count);
		}
	}
}