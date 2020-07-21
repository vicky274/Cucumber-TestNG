package JavaConcept;

public class SortArray {

	public static void main(String[] args) {
		
		int[] a = new int[]{4,1,3,4,6,3,1,6,4,1,4};
		
		for(int i=0; i<a.length;i++)
		{
			
			for(int j=i; j<a.length;j++){
				
				
				if(a[i]>a[j]){
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		
		for(int i: a){
			System.out.print(i);
		}
		
		
	}
}