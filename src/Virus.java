import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Virus {

    Scanner scanner = new Scanner(System.in);

    int amout = ThreadLocalRandom.current().nextInt(1,6);

    public void virus(){
        virusdetected();
        choice();
    }

    public void virusdetected(){
        System.out.println();
        System.out.println(amout + " virus detected .. :( ");
        System.out.println();
        System.out.println("___________________________");
        System.out.println("your job to kill the virus ");
        System.out.println(" 1 : kill virus O.o ");
        System.out.println(" 2 : be reasonable :) ");
        System.out.println(" 3 : leave the virus :( ");
        System.out.println("4 : have  virus :D ");
        System.out.println("______________________________");
        System.out.println();

    }
    public void choice(){
       while(amout != 0  ) {
           int choose = scanner.nextInt();
           if (choose == 1) {
               killVirus();
               System.out.println(amout);
           }

           if (choose == 2) {
               reasonable();
           }

           if (choose == 3) {
               System.out.println(" not my probelem ");

           }

           if (choose == 4) {
               amout = amout * 2;
               System.out.println(amout);
           }

       }

    }
    public void killVirus(){
        amout--;
        System.out.println(amout + " virus left");

    }
    public void reasonable(){
        System.out.println("1 : whats your purpose here ");
        System.out.println("<< virus >> : am not Virus i travel to the stomach to help digest the food ");
        System.out.println(" do you want to kill the virus : Y/N");

        String  input = scanner.next();

        if(input.toLowerCase().equals("y")){
           amout--;

        }else if(input.toLowerCase().equals("n")){

            System.out.println(" ok you shall procced :D");
        }

    }
}
