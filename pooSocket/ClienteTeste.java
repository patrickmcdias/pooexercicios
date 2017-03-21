package pooSocket;
import java.net.*;
import java.io.*;

public class ClienteTeste {

	public static void main(String[] args) {
		File fi = new File("/home/ifpb/Área de Trabalho/aja_PATRICK.html");
		try {
			Socket so = new Socket("127.0.0.1",1515);
			ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
			out.writeUTF(fi.getName());
			FileInputStream in = new FileInputStream(fi);
			byte[] b = new byte[8192];
			while(true){
				int l=in.read(b);
				if(l==-1)break;
				out.write(b,0,l);
			}
			out.close();
			so.close();
			in.close();
			System.out.println("Feito!!");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
