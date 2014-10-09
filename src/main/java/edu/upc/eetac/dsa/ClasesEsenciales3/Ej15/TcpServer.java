package edu.upc.eetac.dsa.ClasesEsenciales3.Ej15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class TcpServer {

	public static void main(String args[]) {
		int numplayers = 0;
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(4567);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Server started");
		Protocolo prot = new Protocolo();

		while (true) {
			try {
				Socket socket = ss.accept();
				System.out.println("client accepted");
				prot.addPlayer(socket);
				numplayers++;
				if (numplayers % 2 == 0) {
					prot = new Protocolo();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
