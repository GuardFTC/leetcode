package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-23 15:23:56
 * @describe: 第一个只出现一次的字符
 */
public class Offer50 {

    /**
     * 返回第一个只出现一次的字符
     *
     * @param s 参数字符串
     * @return 第一个只出现一次的字符
     */
    public static char firstUniqChar(String s) {

        //1.定义初始下标
        int index = s.length();

        //2.循环26个小写英文字母
        for (int i = 'a'; i <= 'z'; i++) {

            //3.获取字母在字符串中首次出现的下标
            int start = s.indexOf(i);

            //4.不为-1,代表字符串中包含该字符
            if (-1 != start) {

                //5.如果首次出现的下标等于最后一次出现的下标，进行下标比较，取更小的即可
                int end = s.lastIndexOf(i);
                if (start == end && end < index) {
                    index = end;
                }
            }
        }

        //6.进行判定，如果未进行过处理返回' '
        return index == s.length() ? ' ' : s.charAt(index);
    }
}
