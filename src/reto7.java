import java.util.Random;
import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {

        int mon,ale,s=3;
        int apuesta,suma=0,resta=0;
        
        
        Random moneRandom=new Random();
        Scanner lectuScanner=new Scanner(System.in);

        System.out.println("BIENVENIDO al juego de piedra, papel o tijera");

        System.out.println("tienes 3 vidas");

        int volver=0; 
            
        do{ System.out.println("cuanto desea apostar");
        apuesta=lectuScanner.nextInt();
        
          
System.out.println("escoja 1 piedra, 2 papel, 3 si tijera");
        mon=lectuScanner.nextInt();

 while(s>0){

   System.out.println("la computadora lanzo");

        ale=moneRandom.nextInt(3)+1;
        System.out.println(ale);

        switch(ale){

            case 1:

            System.out.println("piedra");
            switch(mon){

                 case 1:
        
                System.out.println("empate");
                suma=suma+apuesta;
                break;
                case 2:
                System.out.println("usted gano");
                suma=suma+(apuesta*2);
                break;
        
                case 3:
                System.out.println("usted perdio");
                resta=resta+apuesta;
                s--;
                break;
        
            }
            break;

            case 2:
            System.out.println("papel");
            switch(mon){
                case 1:
        
                System.out.println("usted perdio");
                resta=resta+apuesta;
                s--;
                break;
                case 2:
                System.out.println("empate");
                suma=suma+apuesta;
                break;
        
                case 3:
                System.out.println("usted gano");
                suma=suma+(apuesta*2);
                break;
            }
            break;

            case 3:
            System.out.println("tijera");
            switch(mon){
                case 1:
        
                System.out.println("usted gano");
                suma=suma+(apuesta*2);
                break;
                case 2:
                System.out.println("usted perdio");
                resta=resta+apuesta;
                s--;
                break;
        
                case 3:
                System.out.println("empate");
                suma=suma+apuesta;
                break;
            }
            break;


        }
        suma=suma-resta;
        System.out.println("el valor acomulado es "+suma );

    }
System.out.println("has perdido todas tu vidas para volver a jugar presiona 1");
volver=lectuScanner.nextInt();
s++;
s++;
s++;

}while(volver==1);

        
        
        lectuScanner.close();
            
    
            
        }
    }

