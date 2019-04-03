

import java.util.*;

import javax.swing.*;

import javax.swing.Timer;

/**
 * This program demonstrates the use of lambda expression.
 */

public class LambdaTest
{
    public static void main(String[] args)
    {
        // 定义一个字符串数组
        String[] planets =new String[] {"Mercury","Venus","Earth","Mars",
            "Jupiter","Saturn","Uranus","Neptune"};
        // Arrays.toString将数组内容用字符串的形式打印出来
        System.out.println("===========================================");
        System.out.println("toString原始显示");
        System.out.println(Arrays.toString(planets));
        System.out.println("===   ====   === === ==== === === === ==");
        System.out.println("Sorted in dictionary order:");
        // 将数组排列一下
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        // for(int i= planets.length-1;i>=0;i--)
        // {
        //     System.out.println(planets[i]);
        // }
        // System.out.println(planets);
        System.out.println("===   ====   === === ==== === === === ==");
        System.out.println("Sorted by length？:");
        Arrays.sort(planets,(first,second) -> first.length() + second.length());
        System.out.println(Arrays.toString(planets));
        System.out.println("Arrays.sort(planets,(first,second) -> first.length() + second.length());");
        System.out.println("==========================================");
        System.out.println("Sorted by length:");
        Arrays.sort(planets,(first,second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
        System.out.println("Arrays.sort(planets,(first,second) -> first.length() - second.length());");
        System.out.println("==========================================");
        System.out.println("=== ==== ==== ===== =====");
        Timer t = new Timer(1000,event ->
             System.out.println("The time is " + new Date()));
        t.start();
        // keep program runing util user selects "OK"
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);

    }
}
