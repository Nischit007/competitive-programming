public class Question {

    public static String commonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String str : strs) {
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    } 

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flw"};
        System.out.println(commonPrefix(str));
    }
}
