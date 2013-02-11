package foundedNumbers;

import java.io.*;

public class FoundedNumbers {
	
	public static void main(String[] args){
		
		String s = "0";
		
		try {
		PrintStream	fout = new PrintStream(new FileOutputStream("output.txt"));
			
			for (int i = 1; i<=7; i++){
				for (int j = i+1; j <= 9; j++){
					for (int k = j+1; k<= 9; k++){
						for (int l = k+1; l<=9; l++){
						
							s = String.format("%d%d%d%d",i,j,k,l);
							fout.println(s);
							System.out.println(s);
							
						}
					}
				}
			}
			fout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
