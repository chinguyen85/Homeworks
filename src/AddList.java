import java.util.Scanner;
import java.util.ArrayList;

public class AddList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String addItem;
        
        do {
            System.out.println("Add item (x = exit)");
            addItem = in.nextLine();
            if (!addItem.equalsIgnoreCase("x")) {
            	items.add(addItem);
            }
        } while (!addItem.equalsIgnoreCase("x"));
        for (String item : items) {
           System.out.println(item);
        }
    }
}