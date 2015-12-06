import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		ServerSocket s= new ServerSocket(8000);
		while (true)
		{
				Socket s1=s.accept();
				System.out.println("CONNECTED");
				InputStream inp = s1.getInputStream();
				DataInputStream in = new DataInputStream(inp);
				while(true)
					{
						String command = in.readUTF();
						System.out.println(command);
						if(command.compareTo("exit")==0)
							break;
						Runtime rt = Runtime.getRuntime();
						Process p = rt.exec(command);
					}
		}
		
	}

}
