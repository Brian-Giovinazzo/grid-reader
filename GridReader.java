import java.util.*;
import java.io.*;

public class GridReader{
	private String fileName;
	private char[][] grid;
	
	GridReader(String str) throws FileNotFoundException{
		fileName = str;
		File gridFile = new File(fileName);
		String line;

		if(gridFile.exists()) {
			Scanner params = new Scanner(gridFile);
			int rows = 0;
			while(params.hasNextLine()) {
				line = params.nextLine();
				rows++;
			}
			params.close();
			
			grid = new char[rows][];
			Scanner scnr = new Scanner(gridFile);
			for(int i = 0; i < rows; ++i) {
				line = scnr.nextLine();
				grid[i] = new char[line.length()];
				for(int j = 0; j < grid[i].length; ++j) {
	               grid[i][j] = line.charAt(j);
	            }
			}
			scnr.close();
			
		}else {
			grid = null;
		}
	}
	
	public String toString(){
		String fileString = "";
	    for (int i = 0; i < grid.length; i++) {
	        for (int j = 0; j < grid[i].length; j++) {
	            fileString += grid[i][j];
	        }
	        fileString += "\n";
	    }
		return fileString;
	}
	
	public char[][] getCopy() {
		if(grid != null) {
			char[][] copy = new char[grid.length][];
			for(int i = 0; i < grid.length; i++) {
				copy[i] = Arrays.copyOf(grid[i], grid[i].length);
			}
			return copy;
		} else {
			return null;
		}
	}
	
	public String getFileName() {
		return fileName;
	}
}
