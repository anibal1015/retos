import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {

        String nommed="",nom="",nombebe="";
        int semanas,meses=0;
        double pesobebe,dosisvacuna=0;
        
        Scanner lectuScanner= new Scanner(System.in);

         System.out.println("ingrese el nombre del doctor");
         nommed=lectuScanner.nextLine();

         System.out.println("ingrese el nombre de la madre");
         nom=lectuScanner.nextLine();

         System.out.println("ingrese el nombre del bebe");
         nombebe=lectuScanner.nextLine();

         System.out.println("ingrese el peso del bebe");
         pesobebe=lectuScanner.nextDouble();

         System.out.println("ingrese las semanas del bebe");
         semanas=lectuScanner.nextInt();
        
         meses= semanas/4;
         System.out.println("el bebe tiene "+meses+" meses");

         dosisvacuna=(pesobebe+15/meses*10)*8;
         System.out.println("el doctor "+nommed+" suministra "+dosisvacuna+" de dosis al bebe "+nombebe);


         lectuScanner.close();

         





         


    }
    
}
