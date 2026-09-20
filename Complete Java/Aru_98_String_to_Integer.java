public class Aru_98_String_to_Integer {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(s + " " + s.getClass().getSimpleName());
        int n = Integer.parseInt(s);
        System.out.println(n + " " + ((Object) n).getClass().getSimpleName());


        Integer a = 573;
        System.out.println(a + " " + a.getClass().getSimpleName());
    }
}
