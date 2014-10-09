package edu.upc.eetac.dsa.ClasesEsenciales3.Ej12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClienteSin {

	public static void main(String[] args) throws IOException {
		
		String hostName = "localhost";
				int portNumber = 5005;
				Socket timeSocket;
				try {
					timeSocket = new Socket(hostName, portNumber);
					PrintWriter out = new PrintWriter(timeSocket.getOutputStream(),
							true);
					BufferedReader in = new BufferedReader(new InputStreamReader(
							timeSocket.getInputStream()));
					BufferedReader stdIn = new BufferedReader(new InputStreamReader(
							System.in));
				System.out.println("Escriba su elección");
					String choice = stdIn.readLine();
					out.println(choice);
		
					String fromServer;
					
		
					fromServer = in.readLine();
					System.out.println(fromServer);
		
					timeSocket.close();
				} catch (UnknownHostException e) {
					System.err.println("Don't know about host " + hostName);
					System.exit(1);
				} catch (IOException e) {
					System.err.println("Couldn't get I/O for the connection to "
							+ hostName);
					System.exit(1);
				}
		
		
	}
		
}
