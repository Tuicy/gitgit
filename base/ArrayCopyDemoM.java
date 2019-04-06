
public class ArrayCopyDemoM
{
    public static void main(String[] args)
    {
        char[] arrayFrom = new char[10];
        char[] arrayTo = new char[5];

        char[] arrayFrom = {'a','b','s','t','r','a','c','t','a','f'};

        System.arraycopy(copyFrom,2,copyTo,0,5);
        System.out.println(new String(copyTo));
    }
}
