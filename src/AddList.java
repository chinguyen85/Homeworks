import java.util.Scanner;
public class AddList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int i = 0;
        String addItem;
        
        do {
            System.out.println("Add item (x = exit)");
            addItem = in.nextLine();
            i++;
            if (addItem.equalsIgnoreCase("x"))
            for (String item : items) {
                System.out.println(item)
            }
        } while (true);
        if (!addItem.equalsIgnoreCase("x")) {
            System.out.println("Add item (x = exit)");
        }
        }
    }
}