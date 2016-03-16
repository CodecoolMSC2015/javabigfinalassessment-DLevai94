package client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketClient {
	String[] skills;
	Socket socket;

	public SocketClient(String[] skills) {
		this.skills = skills;
		try {
			socket = new Socket("127.0.0.1", 4444);
			ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
			outputStream.writeObject(skills);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
