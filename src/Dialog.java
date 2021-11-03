public class Dialog {

    Place place = Place.getInstance();
    Virus virus;

    public Dialog(Virus virus) {
        this.virus = virus;
    }

    public void WorldIntroduction() {

            // add new way to print slowly
     String introdution = "Welcome to your buddy System .. \n You are a tiny cell ... " +
             "\n you can explore around \n do some tasks to help prove the System  ";

        char [] intro = introdution.toCharArray();

        for(int i = 0 ; i< intro.length ; i++){
            System.out.print(intro[i]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*
        System.out.println("_______________________________________________________");
        System.out.println("welcome to the buddy System");
        System.out.println("you are white cell .. ");
        System.out.println("your job to move around and kill foreign objects ");
        System.out.println("___________________________________________________________");
        */
        System.out.println("\n_______________________________________________________");

        System.out.println("select direction : ..  ");
        System.out.println("up , down , right , left");
        System.out.println("_______________________________________________________");


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

            System.out.println("you explore right:");
            place.horizontallocation--;
        }
        if (choice.equals("left")) {

            System.out.println("moving left:");
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
                System.out.println(" not my problem ");
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

             //              ***    info methods for each part of the buddy       ***
    public void stomachInfo(){

        System.out.println("The stomach is a muscular, hollow organ in the gastrointestinal tract of humans and many other animals" +
                "\n, including several invertebrates. The stomach has a dilated structure and functions as a vital digestive organ." +
                "\n In the digestive system the stomach is involved in the second phase of digestion, following chewing." +
                "\n It performs a chemical breakdown by means of enzymes and hydrochloric acid.\n" +
                "\nIn humans and many other animals, the stomach is located between the oesophagus and the small intestine." +
                "\n The stomach secretes digestive enzymes and gastric acid to aid in food digestion." +
                "\n The pyloric sphincter controls the passage of partially digested food (chyme) from the stomach into the duodenum," +
                "\n where peristalsis takes over to move this through the rest of intestines. ");
    }
    public void longsInfo(){
        System.out.println("The lungs are a pair of spongy, air-filled organs located on either side of the chest (thorax).\n" +
                " The trachea (windpipe) conducts inhaled air into the lungs through its tubular branches,\n" +
                " called bronchi. The bronchi then divide into smaller and smaller branches (bronchioles),\n" +
                " finally becoming microscopic.");
    }
    public void heartInfo(){
        System.out.println("The heart is a muscular organ in most animals, which pumps blood through the blood vessels of the circulatory system.\n" +
                " The pumped blood carries oxygen and nutrients to the body, while carrying metabolic waste such as carbon dioxide to the lungs.\n" +
                " In humans, the heart is approximately the size of a closed fist and is located between the lungs,\n" +
                " in the middle compartment of the chest");
    }
    public void brainInfo(){
        System.out.println("A brain is an organ that serves as the center of the nervous system in all vertebrate and most invertebrate animals." +
                "\n It is located in the head, usually close to the sensory organs for senses such as vision.\n" +
                " It is the most complex organ in a vertebrate's body.\n" +
                " In a human, the cerebral cortex contains approximately 14–16 billion neurons,\n" +
                " and the estimated number of neurons in the cerebellum is 55–70 billion.\n" +
                " Each neuron is connected by synapses to several thousand other neurons.\n" +
                " These neurons typically communicate with one another by means of long fibers called axons,\n" +
                " which carry trains of signal pulses called action potentials\n" +
                " to distant parts of the brain or body targeting specific recipient cells.");
    }
    public void vaginaInfo(){
         // brain cant function
        System.out.println(" under protection");
    }

}
