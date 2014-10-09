package edu.upc.eetac.dsa.ClasesEsenciales3.Ej12;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpServerSin {
   
	public static void main(String[] args) throws IOException {
		
				int portNumber = 5005;
		
				try {
					ServerSocket serverSocket = new ServerSocket(5005);
					Socket clientSocket = serverSocket.accept();
					PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
							true);
					// BufferedReader in = new BufferedReader(
					// new InputStreamReader(clientSocket.getInputStream()));
					String patron = "dd/MM/yyyy HH:mm:ss";
					SimpleDateFormat formato = new SimpleDateFormat(patron);
					System.out.println(formato.format(new Date()));
		
					String inputLine = formato.format(new Date());
					// while ((inputLine = in.readLine()) != null) {
					out.println(inputLine);
					// }
					serverSocket.close();
				}
		
				catch (IOException e) {
					System.out
							.println("Exception caught when trying to listen on port "
									+ portNumber + " or listening for a connection");
					System.out.println(e.getMessage());
				}
			}
	
	
}
