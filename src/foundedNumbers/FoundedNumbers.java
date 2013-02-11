package foundedNumbers;

public class FoundedNumbers {
	
	public static void main(String[] args){
		
		String s = "0";
		
		for (int i = 1; i<=7; i++){
			for (int j = i+1; j <= 9; j++){
				for (int k = j+1; k<= 9; k++){
					for (int l = k+1; l<=9; l++){
						s = String.format("%d%d%d%d",i,j,k,l);
						System.out.println(s);
					}
				}
			}
		}
		
	}

}
