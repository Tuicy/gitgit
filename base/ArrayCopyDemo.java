class ArrayCopyDemo
{
    public static void main(String[] args)
    {
        char[] copyFrom = {'d','e','c','a','f','f','e',
                           'i','n','a','t','e','d'};

        char[] copyTo = new char[7];

        /* System.arraycopy用于数组之间数据的高效复制
         * public static void arraycopy(Object src,int srcPos,
         *                              Object dest,int destPos,int length)
         * 两个Object参数分别指定数组和目标数组，三个int参数分别指定
         * 源数组的起始位置、目标数组的起始位置、待复制的元素个数
         */
        System.arraycopy(copyFrom,2,copyTo,0,7);
    }
}
