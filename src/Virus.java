import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Virus {

    Scanner option = new Scanner(System.in);

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
        System.out.println("4 : have sex with the virus :D ");
        System.out.println("______________________________");
        System.out.println();

    }
    public void choice(){
        int choose = option.nextInt();
        if(choose == 1 ){

        }
        if(choose == 2 ){

        }
        if(choose == 3 ){

        }
        if(choose == 4 ){

        }
        if(choose == 5 ){

        }

    }
}
