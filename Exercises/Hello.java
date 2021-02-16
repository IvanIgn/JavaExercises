import java.util.*;


public class Hello {
    public static boolean isChanged = false;
    static int a = 10;
    static int b = 20;
    static int prog = 20;
    public static Scanner myMoneyScanner = new Scanner(System.in);
    public static Scanner helloProgScanner = new Scanner(System.in);


    public static void main(String[] args) 
    {
    while (true) 
     {
        helloFunction();
    }
     
       
    }

private static void helloFunction() {
    System.out.println("=====================================================");
    System.out.println("Hello, please choose which program do u want to run!");
    System.out.println("1) Draw a rectangle");
    System.out.println("2) Switch variables 10 and 20");
    System.out.println("3) Exchange money from BRL to SEK");
    System.out.println("=====================================================");
    int choosedValue = helloProgScanner.nextInt();

    switch (choosedValue) {
        case 1:
        drawRectangle();
            break;
        case 2:
        switchVariables(a, b); 
            break;
        case 3:
        exchangeMoney();   
            break;
    
        default: System.out.println("You entered wrong number! Choose from 1 to 3!");
       // helloFunction();
            break;
    }
}

private static void drawRectangle() {
    System.out.println("xxxxx");
    System.out.println("x   x");
    System.out.println("x   x");
    System.out.println("xxxxx");
}

private static void switchVariables(int i, int n) {

    int x = i;
        i = n; 
    int z = x;

    System.out.println(" A = " + i + " B = " + z);
	
};

private static void exchangeMoney(){
    System.out.println("Ange antal BRL som du vill växla till SEK");
   int ammount = myMoneyScanner.nextInt();
   double SEK = 2.64; 
   double BRL = SEK * ammount; 

   System.out.println("Antal SEK: " + BRL);

}

}