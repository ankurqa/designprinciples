package first;

public class eager {
	  static eager instance = new eager();
	  public int a;
	   private eager()
	   {
		a =100;
	   }
	 public static eager getInstance()
	 {
		 return instance ; 
	 }
	   public static void main(String args[])
	   {
		   eager obj1 = eager.getInstance();
		   eager obj2 = eager.getInstance();
		   obj1.a = 50;
		   System.out.println(obj1.a);
		   System.out.println(obj2.a);
		   
	   }
}
