class Car{
    int id;
    String name;
    float number;
}

public class Call_by_Value1 {
 
    public static void main(String[] args) {
        Car c = new Car();
        c.id = 19;
        c.name = "Aruna";
        c.number = 2.6f;

        System.out.println(c.id);
        System.out.println(c.name);
        System.out.println(c.number);

         Car b;
         b = c;
        System.out.println(b.id);
        System.out.println(b.name);
        System.out.println(b.number);
    }
 }
