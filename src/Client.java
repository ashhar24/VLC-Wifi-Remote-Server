import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


public class Client
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			Socket s = new Socket("localhost",8000);
			System.out.println("CONNECTED");
			OutputStream out = s.getOutputStream();
			DataOutputStream o = new DataOutputStream(out);
			String str = "\"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe\" \"F:\\TV Series\\Constantine S01E01 HDTV x264-LOL.mp4\"";
			System.out.println(str);
			o.writeUTF(str);
			
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
