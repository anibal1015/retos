import java.util.Random;
import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {

        int mon,ale,apuesta;
        int suma=0,resta=0;
        int volver=0;
        
        
        Random moneRandom=new Random();
        Scanner lectuScanner=new Scanner(System.in);

        System.out.println("tienes tres vidas");
        int x=3;
       

            do{System.out.println("ingrese su apuesta");
            apuesta=lectuScanner.nextInt();
            
        System.out.println("escoja 1 si quiere cara y 2 si quiere sello");
        mon=lectuScanner.nextInt();
    
 while(x>0){

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
            x--;
        }else if(ale==2 && mon==1){
            System.out.println("sello y perdio");
            resta=resta+(apuesta-apuesta);
            x--;
        }else{
            System.out.println("el numero ingresado no concuerda");
        }
        System.out.println("el dinero acomulado es " +suma);

         System.out.println("el numero de veces jugadas es "+x);
 
        }
        System.out.println("has perdido todas tu vidas para volver a jugar presiona 1");
volver=lectuScanner.nextInt();
x++;
x++;
x++;
    }while(volver==1);
      lectuScanner.close();



    }
}