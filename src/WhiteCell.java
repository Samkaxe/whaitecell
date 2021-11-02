import java.util.Scanner;

public class WhiteCell {


    Scanner scanner = new Scanner(System.in);
    Place place = new Place();
    Virus virus = new Virus();

    public void whitecell(){

        WorldIntroduction();
        while (true){
           moving();
           place.curentlocation();
           virus.virus();

       }

    }
    public void moving(){

        String moving = scanner.next();
        if(moving.equals("up")){

            System.out.println("you move to the next location :");
            place.verticallocation++ ;
            System.out.println(place.verticallocation);
        }
        if(moving.equals("down")){

            System.out.println("you move to the privous location :");
            place.verticallocation-- ;
            System.out.println(place.verticallocation);
        }
        if(moving.equals("right")){

            System.out.println("you move right to the location :");
            place.horizontallocation--;
            System.out.println(place.verticallocation);
        }
        if(moving.equals("left")){

            System.out.println("you move left to the location :");
            place.horizontallocation++;
            System.out.println(place.verticallocation);
        }

    }
    public void WorldIntroduction(){
        System.out.println();
        System.out.println("_______________________________________________________");
        System.out.println("welcome to the buddy System");
        System.out.println("you are white cell .. ");
        System.out.println("your job to move around and kill foreign objects ");
        System.out.println("___________________________________________________________");

        System.out.println("select direction : ..  ");
        System.out.println("up , down , right , left");

    }
}
