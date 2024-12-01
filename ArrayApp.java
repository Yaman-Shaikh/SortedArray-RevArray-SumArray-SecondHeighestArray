import java.util.*;
class ArrayParent 
{
int a[];
	void setvalue(int x[])
	{
		a=x;
	}
	
}

class SortedArray extends ArrayParent
{
	int []getsortedArray()
	{
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;

					}
				}
			}
		return a;
	}
}

class RevArray extends ArrayParent
{
	int []getRevArray()
	{
		int mid=a.length/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		return a;
	}
}


class Sum extends ArrayParent
{
	int getSum()
	{
		int sum=0;
		for(int i=0;i<a.length;i++)	
		{
			sum=sum+a[i];
		}
		return sum;
	}
}

class SecondHeighest extends ArrayParent
{
	int getSecond()
	{
		int max=0,Smax=0;
		max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
					Smax=max;
					max=a[i];
			}
			else if(a[i] > Smax && a[i]!=max)
			{
				Smax=a[i];
			}
			
		}
		return Smax;
	}
	
}





public class ArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("1 for sort Array");
		System.out.println("2 for rev Array");
		System.out.println("3 for sum Array");
		System.out.println("4 for Second heighest Array");
		int num1=xyz.nextInt();
		
		switch(num1)
		{
			case 1:
			{
				
				System.out.println("enter the size of array");
				int size =xyz.nextInt();
				int a[]=new int[size];
				System.out.println("ener the elements of Array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=xyz.nextInt();
				}
				SortedArray s=new SortedArray();
				s.setvalue(a);
				int result[]=s.getsortedArray();
				System.out.println("Sorted Array");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
					
				}
				break;
			}
			
			
			case 2:
			{
				System.out.println("enter the size of array");
				int size =xyz.nextInt();
				int a[]=new int[size];
				System.out.println("ener the elements of Array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=xyz.nextInt();
				}
				
				RevArray r=new RevArray();
				r.setvalue(a);
				r.getRevArray();
				System.out.println("RevArray");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
				}
				break;
				
			}
				case 3:
				{
					
				System.out.println("enter the size of array");
				int size =xyz.nextInt();
				int a[]=new int[size];
				System.out.println("ener the elements of Array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=xyz.nextInt();
				}
				
					Sum s =new Sum();
					s.setvalue(a);
					int result=s.getSum();
					System.out.println("Sum of Array  :"+result);
					
					break;
					
				}
				
				case 4:
				{
					System.out.println("enter the size of array");
				int size =xyz.nextInt();
				int a[]=new int[size];
				System.out.println("ener the elements of Array");
				for(int i=0;i<a.length;i++)
				{
					a[i]=xyz.nextInt();
				}
					SecondHeighest se=new SecondHeighest();
					se.setvalue(a);
					int result=se.getSecond();
					System.out.println("Second heighest number is "+result);
					
					break;
				}
			
		}
		
	}
}