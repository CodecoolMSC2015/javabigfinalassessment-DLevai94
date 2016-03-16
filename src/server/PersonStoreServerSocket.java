package server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import database.DataReader;

public class PersonStoreServerSocket {
	DataReader store;
	private void start(){
	}
	
	public static void main(String[] args) {

		try {
		    ServerSocket serverSocket = new ServerSocket(4444);
		    System.out.println("Server started...");
		    Socket clientSocket = serverSocket.accept();
		    System.out.println("Client connected...");
		    ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());
		    ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream());
		    String[] readedSkills = (String[]) inputStream.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
