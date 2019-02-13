//package com.journaldev.readfileslinebyline;
/**
 * Change the name of this FileOperations and the method to 
 * getTestArrays
 * 
 * @param args
 */ 

import java.io.File;
import java.lang.Integer;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperations {

	public static int[][] main(String[] args) {
        int[][] grid = new int[10][8];
        try {
			Scanner scanner = new Scanner(new File("/Users/travisbrown/hucode/lsp/hw2/arrays.txt"));
			while (scanner.hasNextLine()) {

                for (int w = 0; w < 10; w++){
                    String line = scanner.nextLine();
                    String[] arr = line.split(", ", 8);
                    for (int i = 0; i < arr.length; i++){
                        grid[w][i] = Integer.parseInt(arr[i]);
                        //System.out.print(arr[i] + " ");
                    }
                }

                for (int a = 0; a < 10; a++){
                    for (int d = 0; d < 8; d++){
                        //grid[w][i] = Integer.parseInt(arr[i]);
                        if (grid[a][d] != 0){
                            System.out.print(grid[a][d] + " ");
                        }
                    }
                    System.out.print("\n");
                }
                return grid;
                //
				//System.out.println("--" + scanner.nextLine() + "--");
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}