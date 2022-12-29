import java.io.*;
import java.util.*;

public class GameFileTester {

	public static void main(String[] args) throws FileNotFoundException{
		
		GridReader a = new GridReader("Test.txt");
		System.out.println(a.getFileName());
		System.out.println(a.toString());
		System.out.println(a.getCopy());
		System.out.println("EXTRA CREDIT");
		boolean winFlag = false;
		char[][] b = a.getCopy();
		int turnNum = 1;
		
		for(int i = 0; i < 3; ++i) {
			if(winFlag) { 
				System.out.println("winFlag: " + winFlag + "i: " + i );
			}
			for(int j = 0; j < 3; ++j) {
				if (turnNum % 2 == 0) {
					b[i][j] = 'O';
					turnNum++;
				} else {
					b[i][j] = 'X';
					turnNum++;
				}
				if ((b[0][0] == b[0][1]) && (b[0][1] == b[0][2]) && (b[0][0] != '.')) {
					winFlag = true;
					break;
				} else if ((b[1][0] == b[1][1]) && (b[1][1] == b[1][2]) && (b[1][0] != '.')) {
					winFlag = true;
					break;
				} else if ((b[2][0] == b[2][1]) && (b[2][1] == b[2][2]) && (b[2][0] != '.')) {
					winFlag = true;
					break;
				} else if ((b[0][0] == b[1][0]) && (b[1][0] == b[2][0]) && (b[0][0] != '.')) {
					winFlag = true;
					break;
				} else if ((b[0][1] == b[1][1]) && (b[1][1] == b[2][1]) && (b[0][1] != '.')) {
					winFlag = true;
					break;
				} else if ((b[0][2] == b[1][2]) && (b[1][2] == b[2][2]) && (b[0][2] != '.')) {
					winFlag = true;
					break;
				} else if ((b[0][0] == b[1][1]) && (b[1][1] == b[2][2]) && (b[0][0] != '.')) {
					winFlag = true;
					break;
				} else if ((b[0][2] == b[1][1]) && (b[1][1] == b[2][0]) && (b[0][2] != '.')) {
					winFlag = true;
					break;
				}
            }
		}
		
		if (winFlag) {
			String str = "";
		    for (int i = 0; i < b.length; i++) {
		        for (int j = 0; j < b[i].length; j++) {
		            str += b[i][j];
		        }
		        str += "\n";
		    }
		    System.out.println(str);
		} else {
			System.out.println("There is no winner");
		}
		
	}

}
