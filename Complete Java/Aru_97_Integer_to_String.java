public class Aru_97_Integer_to_String {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(n + " " + ((Object) n).getClass().getSimpleName());
        String s = String.valueOf(n);
        System.out.println(s + " " + s.getClass().getSimpleName());
    }
}
