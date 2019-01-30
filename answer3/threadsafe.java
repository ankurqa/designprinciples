package first;

public class threadsafe extends Thread{

	  static threadsafe instance ;
	  private  int a ;
	  private threadsafe()
	   {
		  a=78;
	   }
	 private  synchronized static threadsafe getInstance()
	 {
		 if (instance == null)
		 {
			 instance  = new threadsafe();
		 }
		 return instance ; 
	 }
	   public static void main(String args[])
	   {
		   threadsafe obj1 = threadsafe.getInstance();
		   threadsafe obj2 = threadsafe.getInstance();
		   obj2.a = obj1.a*3;
		   System.out.println("by second object" + " " + obj2.a);
		   System.out.println("by first object" + " " + obj1.a);
	   }
}