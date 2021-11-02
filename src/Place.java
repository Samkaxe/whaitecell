import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Place {
    int verticallocation;
    int horizontallocation;

    // Static variable reference of single_instance
    // of type Singleton
    private static Place single_instance = null;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Place()
    {
    }

    // Static method
    // Static method to create instance of Singleton class
    public static Place getInstance()
    {
        if (single_instance == null)
            single_instance = new Place();

        return single_instance;
    }



    public void curentlocation() {
        String shortcut = "current location";
        // jeppe idea to set arraylist called location
        // List<Location> location = new ---
        // to String override
        // for loop go through the array
        // location Start = new start ("stomach")
        // start.add(new Location(arm)
        if (verticallocation == -2 && horizontallocation == -1) {
            System.out.println(shortcut + " rightleg");
        }
        else if (verticallocation == -2 && horizontallocation == +1) {
            System.out.println(shortcut + " leftleg");
        } else if (verticallocation == 2 && horizontallocation == 1) {
        System.out.println(shortcut + " : left arm");
        } else if (verticallocation == 2 && horizontallocation == -1) {
            System.out.println(shortcut + " : right arm");
        }else if (verticallocation == -2) {
            System.out.println(shortcut + " legs");
        } else if (verticallocation == -1) {
            System.out.println(shortcut + ": vagina");
        } else if (verticallocation == 0 && horizontallocation == 0) {
            System.out.println(shortcut + " : Stomach");
        } else if (verticallocation == 1) {
            System.out.println(shortcut + " : longs");
        } else if (verticallocation == 2) {
            System.out.println(shortcut + " : heart");
        } else if (verticallocation == 3) {
            System.out.println(shortcut + " : brain ");
        } else {
            System.out.println("invalid location");
        }

    }

}
