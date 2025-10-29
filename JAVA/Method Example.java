
public class Method {
    static int logic(int a, int b){
        int c;
        if(a > b){
            c = a + b;
        }else {
            c = (a + b) * 5;
        }
        return c;
    }
    public static void main(String[] args) {
        int a1 = 40;
        int b1 = 30;
        int c1 = logic(a1, b1);
        System.out.println(c1);        
    }
}
