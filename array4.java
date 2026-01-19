public class array4 {


   public static void main(String x[])
   {    int a[]=new int[5];
        a[1]=1000;
		
        for(int i=0; i<a.length; i++)
		{
		  System.out.printf("%d\t",a[i]);
		}
		boolean flag=false;
		for(int i=0; i<a.length;i++)
		{
			 if(a[i]!=0)
			 { flag=true;
		        break;
			 }
		}
		if(flag)
		{ System.out.println("\nArray not is empty");
		}
		else{
			 System.out.println("\nArray is  empty");
		}
   }
}

