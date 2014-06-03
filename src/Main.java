import java.io.PrintWriter;
import java.net.Socket;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",63400);
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
			printWriter.println("Hello World");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
