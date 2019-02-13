//package Users.travisbrown.hucode.lsp.hw1;

import java.io.File;
import java.lang.Integer;
import java.lang.String;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperations {
    
    /**
     * The following try section reads the file 
         * places it into the 2D array like a grid 
         * How? By looping through the file, extracting each number and
         * putting it in the 2D array or grid as i call it
     * @param filepath
     * @return grid
     */
    public static int[][] getTestArrays(String filepath) {
        int[][] grid = new int[10][8];

        try {
            Scanner scanner = new Scanner(new File(filepath));
            int w = 0;
			while (scanner.hasNextLine() || w < 10) {
                    String line = scanner.nextLine();
                    String[] arr = line.split(", ", 8);

                    for (int i = 0; i < arr.length; i++){
                        grid[w][i] = Integer.parseInt(arr[i]);
                    }
                    w++;
                }
            scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
        }
        return grid;
	}

}