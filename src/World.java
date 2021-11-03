import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class World {


    Scanner scanner = new Scanner(System.in);
    Place place = Place.getInstance();
    Virus virus = new Virus();
    Dialog dialog = new Dialog(virus);

    public World() {
        dialog.WorldIntroduction();

        while (true) {
            moving();
            place.curentlocation();
            virusdetected();
        }

    }


    public void virusdetected(){

        System.out.println(virus.getCurrentVirusVertical());
      //  System.out.println(virus.getCurrentVirusHorizontal());
                                     //  && place.horizontallocation == virus.getCurrentVirusHorizontal()
        if(place.verticallocation == virus.getCurrentVirusVertical()) {
            dialog.VirusDetected();
            int choice = Integer.parseInt(scanner.next());
            dialog.VirusChoices(choice);
            if(choice != 2 ){
                place.curentlocation();
                dialog.Continue();
            }
        }

    }


    public void moving() {

        String moving = scanner.next();
        dialog.moving(moving);
        System.out.println(place.horizontallocation);
        System.out.println(place.verticallocation);
    }
}
