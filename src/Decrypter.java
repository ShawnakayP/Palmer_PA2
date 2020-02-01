
public class Decrypter {
	


	public static int decrypt (int UserInput) {
		
	//takes the user Input 
		
		int	userFirst = UserInput / 1000;	
		int userSecond = (UserInput % 1000)/100;
		int userThird = (UserInput % 100)/10;
		int userFourth = UserInput % 10;
		
		userFirst = (userFirst + 3) % 10; 
		userSecond = (userSecond + 3) % 10;
		userThird = (userThird + 3) % 10;
		userFourth = (userFourth + 3) % 10;	
		
		//swaps the digits 
    	int temp =0;
		temp = userFirst; 
		userFirst = userThird;
		userThird = temp; 
		
		int tempp = 0;
		
		tempp = userSecond;
		userSecond = userFourth;
		userFourth = tempp;
		
	    int	decryptedNum = userFirst * 1000 + userSecond * 100 +  userThird * 10 + userFourth; 
		
	
	return decryptedNum; 
			
	}
	}
	