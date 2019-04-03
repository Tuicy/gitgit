package enums;

import java.util.*;

/**
 * This program demonstrates enumerated types.
 */

 public class EnumTest
 {
     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a size: (SMALL,MEdIUM,LARGE,EXTRA_LARGE)");
         String input = in.next().toUpperCase();
         Size size = ENum.valueOf(Size.class,input);
         System.out.println("abbreviation=" + size.getAbbreviation());
         if (size == Size.EXTRA_LARGE)
             System.out.println("GOOD job--you paid attention to the _.");
     }
}

enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private Size(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }

    private String abbreviation;
}
