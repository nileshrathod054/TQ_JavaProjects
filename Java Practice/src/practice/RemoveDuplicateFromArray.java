package practice;

public class RemoveDuplicateFromArray { 
	
    public static void main(String[] args)  
    { 
        // Initializing a String Array 
        String Array[] = { "A", "B", "C", "D", "A", "C", "B" }; 
  
        // Printing the String Array 
        System.out.println("Initial Array: "); 
        for (int i = 0; i < Array.length; i++) { 
            System.out.print(Array[i] + " "); 
        } 
  
        // Finding the duplicate elements 
        for (int i = 0; i < Array.length; i++) { 
            for (int j = i + 1; j < Array.length; j++) { 
                if ((Array[i].equals(Array[j])) && (i != j)) { 
                    // Replace the duplicate element with empty 
                    Array[j] = ""; 
                } 
            } 
        } 
  
        // Copying only unique elements of my_array into array1 
        int k = 0; 
        String[] array2 = new String[Array.length]; 
        for (int i = 0; i < Array.length; i++) { 
            if (!Array[i].equals("")) { 
                array2[k] = Array[i]; 
                k++; 
            } 
        } 
  
        System.out.println(); 
        // Printing arrayWithoutDuplicates 
        System.out.println("Array with unique values: "); 
        for (int i = 0; i < array2.length; i++) { 
            if (!array2[i].equals("")) 
                System.out.print(array2[i] + " "); 
        } 
    } 
}