package assignment_19thDec;

public class PrimeNum400to300 {

	public static void main(String[] args) {
	    for(int num = 400; num >= 300; num--) {
            boolean isPrime = true;

            // Check to see if the number is prime
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print the number if prime
            if(isPrime) {
                System.out.println(num);
            }
        }
	}

}
