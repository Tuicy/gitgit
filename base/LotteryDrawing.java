import java.util.*;

/** This program demonstrates array manipulation.
* 产生一个抽彩游戏中的随机数值组合
* 要想选择这样一个随机的数值集合，就要考虑将数值1，2，3...,n存入数组numbers中；
* 再用第二个数组存放抽取出来的数值
* Math.random方法将返回一个0到1之间（包含0、不包含1）的随即浮点数
* 用n乘以这个浮点数,就可以得到从0到n - 1之间的一个随机数
*/
public class LotteryDrawing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // 你随机取多少个数
        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        // 确定随机取值范围
        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();
        // fill an array with numbers 1 2 3 ...n
        int[] numbers = new int[n];
        for (int i = 0;i < numbers.length;i++)
            numbers[i] = i + 1;

        // draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0;i < result.length;i++)
        {
            // make a random index between 0 and n - 1
            int r = (int)(Math.random()*n);

            // 下面两个步骤最重要，他实现了不重复取值
            /** 以下两步保证随机取数不重复
            *   搜索“洗牌问题”
            *   数列每次下标可以随机成一样，
            *   由于每次取完数以后，将这个下标对应的数被他倒数第二个数覆盖；
            *   所以虽然索引不变，但是索引对应的内容已发生改变
            */

            // pick the element at the random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination.It'll make you rich!");
        for (int r :result)
            System.out.println(r);
    }
}
