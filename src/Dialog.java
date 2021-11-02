public class Dialog {

    Place place = Place.getInstance();
    Virus virus;

    public Dialog(Virus virus) {
        this.virus = virus;
    }

    public void WorldIntroduction() {
        System.out.println();
        System.out.println("_______________________________________________________");
        System.out.println("welcome to the buddy System");
        System.out.println("you are white cell .. ");
        System.out.println("your job to move around and kill foreign objects ");
        System.out.println("___________________________________________________________");

        System.out.println("select direction : ..  ");
        System.out.println("up , down , right , left");

    }

    public void VirusDetected(){
        System.out.println();
        System.out.println(virus.getAmount() + " virus detected .. :( ");
        System.out.println();
        System.out.println("___________________________");
        System.out.println("your job to kill the virus ");
        System.out.println(" 1 : kill virus O.o ");
        System.out.println(" 2 : be reasonable :) ");
        System.out.println(" 3 : leave the virus :( ");
        System.out.println("4 : have  virus :D ");
        System.out.println("5 : Exit ..");
        System.out.println("______________________________");
        System.out.println();
    }

    public void moving(String choice) {

        if (choice.equals("up")) {

            System.out.println("you move up the body :");
            place.verticallocation++;
        }
        if (choice.equals("down")) {

            System.out.println("you move a bit down :");
            place.verticallocation--;
        }
        if (choice.equals("right")) {

            System.out.println("you explore right :");
            place.horizontallocation--;
        }
        if (choice.equals("left")) {

            System.out.println("you decided that its a good idea to explore left :");
            place.horizontallocation++;
        }

    }

    public void VirusChoices(int choice){
            if (choice == 1) {
                virus.killVirus();
                System.out.println(virus.getAmount() + " Virus left ...  ");
                if(virus.getAmount() == 0){
                    System.out.println("horraaaaaaaay ... you element the danger ");
                }
            }

            if (choice == 2) {
                VirusDialogue();
            }

            if (choice == 3) {
                System.out.println(" not my probelem ");
            }

            if (choice == 4) {
                virus.setAmount(virus.getAmount() * 2);
                System.out.println(virus.getAmount());
            }
    }

    public void VirusDialogue() {
        System.out.println("1 : whats your purpose here ");
        System.out.println("<< virus >> : am not Virus i travel to the stomach to help digest the food ");
        System.out.println("              will you let me in peace , i mean no harm ....");
        System.out.println(" do you want to kill the virus : 1/3");
    }

    public void Continue() {
        System.out.println("___________________________________________________________");

        System.out.println("select direction : ..  ");
        System.out.println("up , down , right , left");
    }

}
