import java.util.*;
import java.io.Console;

/* This program demonstrates console input. */

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // get first InputTest
        System.out.print("What is your name?");
        String name = in.nextLine();

        // get second input
        System.out.print("How old are you?");
        int age = in.nextInt();

        // display output on console
        System.out.println("Hello, " + name + ". Next year,you'll be " + (age + 1));

        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: "); // 输入密码，且输入时不可见
    }
}
