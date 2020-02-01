
public class Encrypter {

		// encrypter takes a four digit number and encrypts it
		
	   public static  int encrypt (int UserInput) {
			
			int encryptedNum = 0;
			int temp = 0; 
			
			
		int	userFirst = UserInput / 1000;	
		int userSecond = (UserInput % 1000)/100;
		int userThird = (UserInput % 100)/10;
		int userFourth = UserInput % 10;
		
		// each number is encrypted by adding 7 and finds the remainder after it is divided by 10 
		
		userFirst = (userFirst + 7) % 10; 
		userSecond = (userSecond + 7) % 10;
		userThird = (userThird + 7) % 10;
		userFourth = (userFourth + 7) % 10;
		
		// The first and third digits are swapped
		temp = userFirst; 
		userFirst = userThird;
		userThird = temp; 
		
		//The fourth and second are swapped
		int tempp = 0;
		
		tempp = userSecond;
		userSecond = userFourth;
		userFourth = tempp;
		
		encryptedNum = userFirst * 1000 + userSecond * 100 +  userThird * 10 + userFourth; 
		

			return encryptedNum;
		}
		
		
	


}



