package factory;

public abstract class Computer {
     
	public abstract String  getip();
	public abstract String gethostname();
	public abstract int getRam();
	
	public String getdata()
	{
		return ("ip address= "+ this.getip() + " Hostname = "+ this.gethostname() + " Ram ="+ this.getRam());
	}
}

class PC extends Computer{
	public String ip;
	public String hostname;
	public int ram;
	
	public PC (String hostname, String ip , int ram)
	{
		this.ip = ip;
		this.hostname = hostname;
		this.ram = ram;
	}
	
	public String gethostname()
	{
		return hostname;
	}
	public String getip()
	{
		return ip;
	}
	public int getRam()
	{
		return ram;
	}
}




class server extends Computer{
	public String ip;
	public String hostname;
	public int ram;
	public String request;
	
	public server (String hostname, String ip , int ram)
	{
		this.ip = ip;
		this.hostname = hostname;
		this.ram = ram;
	}
	public String getrequest(String request)
	{
		this.request = request;
				return request; 
	}
	public String gethostname()
	{
		return hostname;
	}
	public String getip()
	{
		return ip;
	}
	public int getRam()
	{
		return ram;
	}
}
