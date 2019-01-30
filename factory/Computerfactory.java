package factory;


public class Computerfactory { 
	public static Computer getComputer(String type, int ram, String hostname, String ip){
		
		if("pc".equalsIgnoreCase(type))
		{
		return new PC(hostname,ip,ram);	
		}
		if("server".equalsIgnoreCase(type))
		{
		return new server(hostname,ip,ram);	
		}
		return null;
	}
	public static void main(String args[])
	{
	Computer pc = Computerfactory.getComputer("pc",45,"www.gmail.com" , "10.2.3.65");
	Computer server = Computerfactory.getComputer("server",45,"www.gmail.com" , "192.168.56.23");
	System.out.println(pc.getdata());
	System.out.println(server.getdata());
	}
}
