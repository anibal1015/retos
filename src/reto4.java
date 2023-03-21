import java.util.Random;
import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        
        int mon,ale,s=1;
        int apuesta,suma=0,resta=0;
        
        
        Random moneRandom=new Random();
        Scanner lectuScanner=new Scanner(System.in);

        while(s<5){

        System.out.println("cuanto desea apostar");
        apuesta=lectuScanner.nextInt();
        
        System.out.println("escoja 1 piedra, 2 papel, 3 si tijera");
        mon=lectuScanner.nextInt();

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
                break;
        
            }
            break;

            case 2:
            System.out.println("papel");
            switch(mon){
                case 1:
        
                System.out.println("usted perdio");
                resta=resta+apuesta;
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
        
        
        lectuScanner.close();
            

            
        }
    }

