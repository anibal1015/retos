import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {

        int mon,ale,apuesta;
        int suma=0,resta=0;
        
        
        Random moneRandom=new Random();
        Scanner lectuScanner=new Scanner(System.in);

        for(int x=1; x<=9999;x++){

            System.out.println("ingrese su apuesta");
            apuesta=lectuScanner.nextInt();
            
        System.out.println("escoja 1 si quiere cara y 2 si quiere sello");
        mon=lectuScanner.nextInt();

        ale=moneRandom.nextInt(2)+1;
        System.out.println(ale);
        
        if(ale==1 && mon==1){
            System.out.println("cara y gano");
            suma=suma+(apuesta*2);
        }else if(ale==2 && mon==2){
            System.out.println("sello y gano");
            suma=suma+(apuesta*2);
        }else if(ale==1 && mon==2){
            System.out.println("cara y perdio");
            resta=resta+(apuesta-apuesta);
        }else if(ale==2 && mon==1){
            System.out.println("sello y perdio");
            resta=resta+(apuesta-apuesta);
        }else{
            System.out.println("el numero ingresado no concuerda");
        }
        System.out.println("el dinero acomulado es " +suma);

        System.out.println("el numero de veces jugadas es "+x);
        }
        
        
      lectuScanner.close();



    }
}