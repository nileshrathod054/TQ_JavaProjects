package map_assignment;

public class Q10RemoveCommonElements {
public static void main(String[] args) {
	int []arr1= {4,7,3,9,2,33,44};
	int []arr2= {3,2,12,9,40,32,4};
	
	int flag=0;
	for(int i=0; i<arr1.length; i++) {
		flag=0;
		for(int k=0; k<arr2.length; k++) {
			if(arr1[i]==arr2[k]) {
				flag=1;
				
			}
		}
		for( i=0; i<arr1.length; i++) {
			flag=0;
			for(int k=0; k<arr2.length-1; k++) {
				if(arr2[i]==arr1[k]) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(arr2[i]+" ");
			}
		}
	}
}
}
