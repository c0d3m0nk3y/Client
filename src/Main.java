import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("217.146.93.157",63455);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("foo");
			oos.writeUTF("lol");
			oos.close();
			socket.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
