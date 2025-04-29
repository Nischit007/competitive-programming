public class Permutation {

    public static void permutation(String fullString, String emptyString) {
        if (fullString.isEmpty()) {
            System.out.println(emptyString);
            return;
        }

        char ch = fullString.charAt(0);
        String rest = fullString.substring(1);

        for (int i = 0; i <= emptyString.length(); i++) {
            String firstPart = emptyString.substring(0, i);
            String secondPart = emptyString.substring(i);
            permutation(rest, firstPart + ch + secondPart);
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
    }
}
