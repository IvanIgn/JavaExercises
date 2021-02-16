public class Loops {

    public static void main(String[] args) {
        
       drawTable();

  }

  private static void drawTable() {
    System.out.println("N     10*N     100*N    1000*N\n");

    for (int i= 1; i<=5; i++) {
        for (int j= 1; j<=4; j++) {
           // System.out.print(i);
        /*    
           if (j == 1) {
            System.out.print(i);
           } else if ( j == 2) {
            System.out.print("     " + i + "0  ");
           } else if (j == 3) {
            System.out.print("     " + i + "00 ");
           } else if (j == 4) {
            System.out.print("     " + i + "000");
           }
           */
           switch (j) {
               case 1:    System.out.print(i);
                   
                   break;
               case 2:    System.out.print("     " + i + "0  ");
            
                   break;
               case 3:    System.out.print("     " + i + "00 ");
            
                   break;
               case 4:    System.out.print("     " + i + "000");
            
                   break;    

               default:
                   break;
           }
        }
        System.out.println("");
        
    }
  }


  }
