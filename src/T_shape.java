
public class T_shape {

	public static void main(String[] args) {

		int i, j;
		for (i=1;i<=10;i++) { // 1st loop
		     for (j=1;j<=10;j++) {// 2nd
		    
		    if(i==1) 
		    {
		      System.out.print("*");   // to print 1st line of T
		    }
		    if (i==2)
		    {
		    	if(j==1) 
		    	{
				    System.out.println("*"); // to print 2nd line of T
		    	}
		    	else {
		    		System.out.print("*");
		    	}
		    }
		    if (i>2 && j!= 5)
		    {
		    	if(j==1) {
				    System.out.println(" "); // to print spaces for the T
		    	}
		    	else {
		    		System.out.print(" ");
		    	}			    }
		    if (i> 2 && j==6) 
		    {
		    		System.out.print("**"); // To print Vertical line of T			    
		    }
		    }
		}
	}
}
