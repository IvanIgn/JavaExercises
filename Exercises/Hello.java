import java.util.*;


public class Hello {
    public static boolean isChanged = false;
    static int a = 10;
    static int b = 20;
    public static Scanner myMoneyScanner = new Scanner(System.in);


    public static void main(String[] args) {

        drawRectangle();
        var bla = switchVariables(a, b);

        System.out.println(bla);

    exchangeMoney();
  
        
    

}

private static void drawRectangle() {
    System.out.println("xxxxx");
    System.out.println("x   x");
    System.out.println("x   x");
    System.out.println("xxxxx");
}

private static String switchVariables(int i, int n) {
   
    int x = i;
    int y = n; 
    if (isChanged == false) {
        x = i;
        y = n; 
        isChanged = true;
     
    } else {
        x = n;
        y = i;   
       isChanged = false;

    } 
  
    //isChanged = !isChanged;

 return (" A = " + x + " B = " + y);
	
};

private static void exchangeMoney(){
    System.out.println("Ange antal BRL som du vill växla till SEK");
   int ammount = myMoneyScanner.nextInt();
   double SEK = 2.64; 
   double BRL = SEK * ammount; 

   System.out.println("Antal SEK: " + BRL);

}

}