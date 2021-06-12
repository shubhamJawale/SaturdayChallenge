// q1.java

import java.util.*;

class array{
	Scanner sc = new Scanner(System.in);
	int arr[];
	
	int count;
	array(int size){
		arr = new int[size];
		 
	}
    
	public void addElement()
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
	}


	public void subarray(){

		for(int i=0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					
					arr[i]=0;

				}

			}

			if(arr[i]!=0){
				System.out.print("[");
				count++;
				System.out.print(" "+arr[i]+" ");
				System.out.print("]");
			}

		}
		count = arr.length-count;
		System.out.println("output(Size of sub array) : "+count);

	}





}


class q1{

public static void main(String[] args) {
	Scanner sc1= new Scanner(System.in);
	int size = sc1.nextInt();
	array a = new array(size);

	a.addElement();
	System.out.println();
	a.subarray();



}
}