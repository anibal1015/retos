import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        
        int precio, total=0, paga,pipo=0;
        String emple, clien;

      Scanner lectuScanner=new Scanner(System.in); 
      
      System.out.println("ingrese el nombre del empleado:");
            emple=lectuScanner.next(); 
        
            System.out.println("registre el nombre del clinte:");
            clien=lectuScanner.next();


      System.out.println("Ingresar la cantidad de productos a pagar");
      int f = lectuScanner.nextInt();
        


        for( int x=1; x<=f;x++){

           

            System.out.println("ingrese el precio delproducto:");
            precio=lectuScanner.nextInt();

            total=total+precio;
            System.out.println("el total a pagar es "+total);

    }
  

    System.out.println("¿con cuanto paga el cliente?");
    pipo=lectuScanner.nextInt();

   
    paga=pipo-total;

     
if(pipo<total){
    System.out.println("hace falta "+paga+" para realizar la compra");
}

   else if(pipo==total){
       System.out.println("gracias por su compra");

   } else {
    System.out.println("se entrega "+paga+" de cambio");
   }
System.out.println("el cliente "+clien+" ha sido registrado por el empleado "+emple);

      lectuScanner.close();
}
}
