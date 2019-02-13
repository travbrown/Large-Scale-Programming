/**
 * Coded by Travis Brown @02822994 for SYCS363
 * 
 */

//import Users.travisbrown.hucode.lsp.hw1.OrderChecker;
//import Users.travisbrown.hucode.lsp.hw1.FileOperations;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {

        int[][] testArrays = FileOperations.getTestArrays("/Users/travisbrown/hucode/lsp/hw1/arrays.txt");

        for(int c = 0; c < testArrays.length; c++){
            int stop = 8;
            for (int i = 0; i < 8; i++){
                if(testArrays[c][i] == 0){
                    stop = i;
                    break;
                }
            }
            int[] row = Arrays.copyOfRange(testArrays[c], 0, stop);

            WhiteBox(row);
            System.out.println("\n");
        }

    };

    /**
     * The method below, "WhiteBox", does all the
     * necessary organizational checks in a reasonable order.
     * Checks:
     * 1. Empty/null check
     * 2. single element in array check
     * 3. All the elements are the same
     * 4. Ascending & Descending Check
     * 
     * @param container
     */
    public static void WhiteBox(int [] container){
        if (container.length == 0 || container == null) {
            System.out.println("Array is empty or null");
        } else if (container.length == 1) {
            System.out.println("The array={" + container[0] + "} contains a single element");
        }
        else if (OrderChecker.IsTheSame(container)) {
            System.out.println("The values in the array are all the same.");
        }
        else {

            System.out.print("The array: ");
            for(int count = 0; count < container.length; count++) {
                System.out.print(container[count]);
                if(count != container.length-1 ){
                    System.out.print(", ");
                } else{
                    System.out.print(" ");
                }
            }

            if (OrderChecker.isAscending(container) ) {
                System.out.println("is in ascending order");
            } else {
                System.out.println("is not in ascending order");
            }

            System.out.print("The array: ");
            for(int count = 0; count < container.length; count++) {
                System.out.print(container[count]);
                if(count != container.length-1 ){
                    System.out.print(", ");
                } else{
                    System.out.print(" ");
                }
            }

            if (OrderChecker.isDescending(container)) {
                System.out.println("is in descending order");
            } else {
                System.out.println("is not in descending order");
            };
        }
    }
}