import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("You are in a land full of dragons. In front of you, \n"
                + "you see two caves. In one cave, the dragon is friendly \n"
                + "and will share his treasure with you. The other dragon \n"
                + "is greedy and hungry and will eat you on sight. \n"
                + "Which cave will you go into? (1 or 2) \n");

        Scanner in = new Scanner(System.in);
        String input, output;
        while(true)
        {
            try
            {
                input = in.nextLine().trim();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                break;
            }
            output = getCave(input);
            if (output.equals("invalid"))
            {
                System.out.println("\nPlease select option 1 or 2 \n");
            }
            else
            {
                System.out.println(output);
                break;
            }
        }
        in.close();
    }

    public static String getCave(String value)
    {
        if (value.equals("1"))
        {
            return "\nYou approach the cave... \n"
                    + "It is dark and spooky... \n"
                    + "A large dragon jumps out in front of you! He opens his jaws and... \n"
                    + "Gobbles you down in one bite!";
        }
        else if (value.equals("2"))
        {
            return "\nFriendly dragon...";
        }
        return "invalid";
    }
}
