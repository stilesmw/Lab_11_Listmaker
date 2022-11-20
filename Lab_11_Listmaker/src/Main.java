import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        final String menu = "A - add D - delete P - print Q - quit";
        boolean done = true;
        String cmd = "";

        do
        {
            displayList();

            cmd = SafeInput.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            switch(cmd)
            {
                case "A":
                    System.out.println("what would you like to add to the list");
                    list.add(console.nextLine());
                    break;
                case "D":
                    System.out.println("what would you like to delete from the list");
                    list.remove(console.nextLine());
                    break;
                case"P":
                    System.out.println(list);
                    break;
                case "Q":
                    System.exit(0);
                    break;
            }

            System.out.println("cmd is " + cmd);


        }while(done);


    }

    private static void displayList()
    {
        System.out.println("-----------------------------------------------------------");
        if(list.size() != 0)
        {
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%3d%35s", i + 1, list.get(i));
            }
            System.out.println("");
        }
        else
            System.out.println("                   list is empty                 ");
        System.out.println("-----------------------------------------------------------");
    }
}