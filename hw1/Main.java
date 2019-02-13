/**
 * Coded by Travis Brown @02822994 for SYCS363
 * 
 */
class Main {
    public static void main(String[] args) {
        int[] Pluto = new int[] {1,2,3,4,5};
        int[] Neptune = new int[] {2,2,2,2,2};
        int[] Uranus = new int[] {};

        int[] Saturn = new int[] {1};
        int[] Jupiter = new int[] {3,4,1,2,5};
        int[] Mars = new int[] {5,4,3,2,1};

        System.out.println("Pluto:");
        WhiteBox(Pluto);
        System.out.println("\nNeptune:");
        WhiteBox(Neptune);
        System.out.println("\nUranus:");
        WhiteBox(Uranus);

        System.out.println("\nSaturn:");
        WhiteBox(Saturn);
        System.out.println("\nJupiter:");
        WhiteBox(Jupiter);
        System.out.println("\nMars:");
        WhiteBox(Mars);

       };
    
    /**
     * The method below, "WhiteBox", does all the 
     * necessary organization checks in a reasonable order.
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
            System.out.println("Array has only one element");
        }
        else if (orderChecker.IsTheSame(container)) {
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

            if (orderChecker.isAscending(container) ) {
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

            if (orderChecker.isDescending(container)) {
                System.out.println("is in descending order");
            } else {
                System.out.println("is not in descending order");
            };
        }
    }
}