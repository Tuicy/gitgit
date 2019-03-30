
import java.util.Scanner;


public class LotteryDrawingM
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("你取值范围的最大值")
        n = in.nextInt();

        Sytem.out.println("你想要随机取几个数");
        k = in.nextInt();



        int[] numbers = new int[n];
        for (i = 0;i<result.length;i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for (i=0;i<result.length;i++)
            {
                int r = (int)(Math.random()*n);

                /** 以下两步保证随机取数不重复
                *   搜索“洗牌问题”
                *   数列每次下标可以随机成一样，
                *   由于每次取完数以后，将这个下标对应的数被他倒数第二个数覆盖；
                *   所以虽然索引不变，但是索引对应的内容已发生改变
                */
                result[i] = number[r];

                numbers[r] = numbers[n -1];
                n--;

            }
    }
    Array.sort(result);
    System.out.println("Bet the following combination.It'll make you rich!");
    for (int r : result)
        System.out.println(r);
}
