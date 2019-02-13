//package Users.travisbrown.hucode.lsp.hw1;

public class OrderChecker{

    /**
     * The following method determines if the 
     * contents of the array are in descending order.
     */
    public static boolean isDescending(int [] list){
      boolean array_descending_so_far = true;
      for(int i = 1; i < list.length; i++ ){
          if(list[i] > list[i-1]){
            array_descending_so_far = false;
            break;
          }
      }
      return array_descending_so_far;
    }

    /**
     * The following method determines if the
     * contents of the array are in ascending order.
     */
    public static boolean isAscending(int [] list){
      boolean array_ascending_so_far = true;
      for(int i = 1; i < list.length; i++ ){
          if(list[i] < list[i-1]){
            array_ascending_so_far = false;
            break;
          }
      }
      return array_ascending_so_far;
    }

    /**
     * The following method determines if all the 
     * contents of the array are the same.
     */
    public static boolean IsTheSame(int [] list){
      boolean same = true;
      for (int i = 1; i < list.length; i++){
        if (list[i] != list[i-1]) {
          same = false;
        }
      }
      return same;
    }
  }