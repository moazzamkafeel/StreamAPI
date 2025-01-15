package DSA.StringQuestions;
//Q-796
public class StringRotationCheck {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty()) {
            return false;
        }
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isRotation(s1, s2)); // Output: true
    }
}
