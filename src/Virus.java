import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Virus {

    private int amount = ThreadLocalRandom.current().nextInt(1,6);
    private int currentVirusHorizontal = ThreadLocalRandom.current().nextInt(-1, 1 + 1);
    private int currentVirusVertical = ThreadLocalRandom.current().nextInt(-2, 3 + 1);

    public int getCurrentVirusHorizontal() {
        return currentVirusHorizontal;
    }

    public void setCurrentVirusHorizontal(int currentVirusHorizontal) {
        this.currentVirusHorizontal = currentVirusHorizontal;
    }

    public int getCurrentVirusVertical() {
        return currentVirusVertical;
    }

    public void setCurrentVirusVertical(int currentVirusVertical) {
        this.currentVirusVertical = currentVirusVertical;
    }

    public void virus(){
    }


    public void killVirus(){
        amount--;
        currentVirusHorizontal = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
        currentVirusVertical = ThreadLocalRandom.current().nextInt(-5, 5 + 1);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amout) {
        this.amount = amout;
    }



}
