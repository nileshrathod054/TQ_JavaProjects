package logicalPrograms;

public class SecondLargestElement {
public static void main(String[] args) {
	int a[]= {6,7,8,9,10,3,4};
	int temp;
	for(int i=0; i<a.length;i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Second largest element in an array : "+a[1]);
}
}
