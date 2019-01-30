package first;

public class lazy {
	  static lazy instance ;
	  private int a;
	  private String str;
	  private lazy()
	   {
		a =100;
		str = "This is Ankur Mangal";
	   }
	 private static lazy getInstance()
	 {
		 if (instance == null)
		 {
			 instance  = new lazy();
		 }
		 return instance ; 
	 }
	   public static void main(String args[])
	   {
		   lazy obj1 = lazy.getInstance();
		   lazy obj2 = lazy.getInstance();
		   obj1.a = 78;
		   System.out.println(obj1.a);
		   System.out.println(obj2.a);
		   System.out.println(obj1.str);
		   System.out.println(obj2.str);
		   
	   }
}