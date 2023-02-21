package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-21 10:18:11
 * @describe: 左旋字符串
 */
public class Offer58 {

    public static String reverseLeftWords(String s, int n) {

        char[] chars = s.toCharArray();
        int length = chars.length;
        char[] result = new char[length];

        for (int i = 0; i < length; i++) {
            if (i < n) {
                result[length - n + i] = chars[i];
            } else {
                result[i - n] = chars[i];
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("lrloseumgh", 6));
    }
}
