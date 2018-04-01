//package OOP; you can remove it or insert your pakage name here
public class Sorting {
    public static void main(String args[]){
        int array [] = {1,4,5,3,8,9,0,5,6,2,7};
        //lets print array befor sorting
        System.out.println("=== Before Sorting ===");
        for (int i = 0; i <array.length; i++) {
          System.out.print(" "+array[i]);  
        }//end for
        Bubble(array);//call method
        //print array after sotring
        System.out.println("\n=== After Sorting ===");
        for (int i = 0; i <array.length; i++) {
          System.out.print(" "+array[i]);  
    }//End if
        System.out.println();
    }//End Main
    public static void Bubble(int [] array){
        int temp = 0;//lets init temp
        for (int i = 0; i <array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j-1]>array[j]) {
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }//end if
            }//end for
        }//end for
    }//end Method
}//end class
