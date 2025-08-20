class Example{
    void display(){
int[] ages = new int[3];

        ages[0] = 45;
        ages[1] = 12;
        ages[2] = 56;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }
}

public class Arrays1 {

    public static void main(String[] args) {
        Example e = new Example();
        e.display();
    }
}
