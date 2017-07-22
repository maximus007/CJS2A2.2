
public class Diamond {

	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int temp,startChar = 97, numRows = 5, numCols = 5; // Declaring & initializing variables
	 	for(int k=0; k<numRows/2+1; k++){
	 		for(int i=numRows/2+1; i>=k; i--){ // for loop for printing space
	 			System.out.print(" ");
	 		}
	 		for(int i = 0; i<=k; i++){ // for printing char 
	 			temp = startChar + i;
	 			System.out.print((char)temp);
	 		}
	 		for(int i = k-1;i>=0; i--){ //for printing in descending order
	 			temp = startChar + i;
	 			System.out.print((char)temp);
	 		}
	 		System.out.println(); // for new line
	 	}
	 	for(int k=numRows/2-1; k>=0; k--){
	 		for(int i=numRows/2+1; i>=k; i--){
	 			System.out.print(" ");
	 		}
	 		for(int i = 0; i<=k; i++){
	 			temp = startChar + i;
	 			System.out.print((char)temp);
	 		}
	 		for(int i = 0;i<k; i++){
	 			temp = startChar + i;
	 			System.out.print((char)temp);
	 		}
	 		System.out.println();
	 	}
	}
}