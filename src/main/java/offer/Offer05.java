package offer;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2023-02-21 10:02:41
 * @describe: 替换空格
 */
public class Offer05 {

    public static String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char item : s.toCharArray()) {
            if (item == 32) {
                builder.append("%20");
            } else {
                builder.append(item);
            }
        }
        return builder.toString();
    }
}
