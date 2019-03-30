import java.util.*;
/**
  * 解决洗牌问题
  */
public class LotteryDrawingF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("你想要几个数");
        int k = in.nextInt();
        System.out.println("你想要取值的最大范围?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0;i < numbers.length;i++)
            numbers[i] = i;

        int[] results = new int[k];
        for (int i = 0;i < results.length;i++)
        {
            int r = (int)(Math.random()*n);

            results [i] = numbers[r];

            numbers[r] = numbers[n -1];

            n--;
        }
        Arrays.sort(results);
        System.out.println("你得到的随机数是");
        for(int i : results)
            System.out.println(i);
    }

}
