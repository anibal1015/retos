import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {

        String nom,ficha,tipo,docu,tel,cor;
        int aux,tra=0;

        Scanner lectuScanner = new Scanner(System.in);
        
        System.out.println("Digita el nombre completo del Aprendiz: ");
        nom = lectuScanner.nextLine();
        
        System.out.println("¿ya esta registrd@? digita 1 para Si o cualquier digito para No :");
        aux = lectuScanner.nextInt();

        if (aux==1) {
            System.out.println("El aprendiz " + nom + " ya está registrado en un auxilio");
        }else {
            
            System.out.println("Digita la ficha de "+nom);
            ficha=lectuScanner.next();

            System.out.println("Digita el tipo de documento del aprendiz");
            tipo=lectuScanner.next();

            System.out.println("Digita el número de documento del aprendiz");
            docu=lectuScanner.next();

            System.out.println("Digita el número de telefono del aprendiz");
            tel=lectuScanner.next();

            System.out.println("Digita el correo electronico del Aprendiz");
            cor=lectuScanner.next();

            System.out.println("digite 1 para el auxilio de alimentacion o 2 para el auxilio de transporte");
            tra=lectuScanner.nextInt();
        }
       
        if (tra==1){

            System.out.println("¿con cuantas personas vives?");
            int perv=lectuScanner.nextInt();

            System.out.println("¿cuantas personas trabajan en tu casa?");
            int trab=lectuScanner.nextInt();

            System.out.println("¿cuantas comidas tienes en el dia?");
            int coda=lectuScanner.nextInt();

            System.out.println("¿cual es tu peso?");
            Double peso=lectuScanner.nextDouble();

            System.out.println("¿cuanto mides?");
            Double alt=lectuScanner.nextDouble();

            System.out.println("aprendiz "+nom+"ya estas registrado para el posible cupo de auxilio de alimentacion ");

        } else if (tra==2){

       System.out.println("¿cuantas personas trabajan en tu casa?");
        int trab=lectuScanner.nextInt();

        System.out.println("¿con cuantas personas vives?");
        int perv=lectuScanner.nextInt();

        System.out.println("¿cual es tu medio de transporte?");
        String trans=lectuScanner.nextLine();

        System.out.println("aprendiz "+nom+"ya estas registrado para el posible cuppo de auxilio de transporte ");

    }
        lectuScanner.close();
    }
}