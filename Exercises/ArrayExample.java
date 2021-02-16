import java.util.*;

public class ArrayExample {
public static int a = 20;
public static int counter = 0;


    public static void main(String[] args) {
      //  forLoop(a);
    // whileLoop(counter);
   // doWhileLoop(counter);
   arraySorting(a);

    }

    public static void forLoop (int x) {
       // int y;
        for (int i= 1; i<=x; i++){
            System.out.println(i);
        }
     
    }


    public static void whileLoop (int x) {
         x = 1;
         while (x <= 20){
             System.out.println(x);
             x++;
         }
      
     }

     public static void doWhileLoop (int x) {
         x = 1;
       do {
        System.out.println(x);
        x++;
       }
        while (x <= 20);  
    }

    public static void arraySorting (int x) {
     

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i = 1; i<=x; i++) {
            arr1.add(i);
        }
        System.out.println("Our 1st array is:" + arr1);
          Collections.reverse(arr1);
             System.out.println("Our 2nd array is:" + arr1);


       
      
    
    }
    


}