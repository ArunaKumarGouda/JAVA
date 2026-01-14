
class InnerPrivate_access_modifier {
    private int age;
    private String name;

    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
    
}

public class Private_access_modifier {

    public static void main(String[] args) {
        InnerPrivate_access_modifier p = new InnerPrivate_access_modifier();
        p.setAge(19);
        System.out.println("The age is : " + p.getAge());
        p.setName("Aruna");
        System.out.println("and the name is : " + p.getName());
        
    }
}