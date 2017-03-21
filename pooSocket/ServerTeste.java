package pooSocket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerTeste {

	public static void main(String[] args) {
			try {
				ServerSocket serv = new ServerSocket(1515);
				while(true){
					System.out.println("Aguardando Cliente..");
					Socket sock = serv.accept();
					ObjectInputStream in = new ObjectInputStream(sock.getInputStream());
					//BufferedReader r= new BufferedReader(in);
					String File = in.readUTF();
					long size = in.readLong();
					FileOutputStream f = new FileOutputStream(File);
					byte[] b = new byte[8192];
					
					while(true){
						int len = in.read(b);
						if(len==-1)break;
						f.write(b,0,len);
					}
					f.flush();
					f.close();
					System.out.println("Recebido!!");
					}
				}
			 catch(Exception e) {
				e.printStackTrace();
			}
}
}
