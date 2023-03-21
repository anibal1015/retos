import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        double cen;
        double kel=0;
        int person;
         double graper=0;
         double kilos=0;

         Scanner lectuScanner=new Scanner(System.in);
 
         System.out.println("ingese grados centigrados");
         cen=lectuScanner.nextDouble();
         
         kel=cen+273.15;
         System.out.println("los grados kelvin son "+kel);

         System.out.println("ingrese el numero de personas");
         person=lectuScanner.nextInt();

         graper= person*13;
         System.out.println("gramos de harina necesarios "+graper+"g");

         kilos=graper/1000;
         System.out.println("kilos de harina necesarios "+kilos+"kg");
 
        lectuScanner.close();
       
    }
    
}
