import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //array
        String[] friendArray = {"Sonia","Daryce", "Anne", "Kristy", "Aline"};
        System.out.println(friendArray[4]);
        //array list to hold friend names
        ArrayList<String> friends = new ArrayList<>();// ArrayList don't have fixed size
        ArrayList<String> friends1 = new ArrayList<>(Arrays.asList("Arron", "Brice", "Corner", "Dice", "Eric", "Fiona"));
        // printing the output
        System.out.println(friendArray[4]);
        System.out.println(friends1.get(3));
        // the size of array and array list
        System.out.println(friendArray.length);
        System.out.println(friends1.size());

    }
}