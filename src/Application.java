import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Takes the user's input
				
		System.out.println("Enter a four digit number");
		int userInput = input.nextInt();
		
		//calls encrypter and decrypter methods
		
		int encrypted_Num = Encrypter.encrypt (userInput);
		int decrypted_Num = Decrypter.decrypt (userInput);
		
		//prints output 
		System.out.println("The encrypted number: " +encrypted_Num );
		System.out.println("The decrypted number is " +decrypted_Num);
	}

}
