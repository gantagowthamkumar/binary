import java.util.Scanner;
public class Binary
	{
	public static void main(String [] args)
		{
		int n,i;
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the size of array A");
	n=scan.nextInt();
	int[]a=new int[n];
	System.out.println("enter the element of the array");
	for(i=0;i<=a.length-1;i++)
	{
		a[i]=scan.nextInt();
}
System.out.println("enter the element need to be search");
	int x=scan.nextInt();
int mid=0,found=0;
i=0;
int j=a.length-1;
while(i<=j)
	{
	mid=(i+i)/2;
	if(x==a[mid])
		{
		found=1;
		break;
		}
		else if(x>a[mid])
		{
			i=mid+i;
		}
		else
			{
			j=mid-1;
		}
	}
	if(found==0)
	{
		System.out.println("element not found");
	}
	else
	{
		System.out.println("element found");
	}
	}
	}