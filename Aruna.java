public class Aruna{
        int id;
        String name;
        String department;
        void display()
        {
        System.out.println("The id is :" + id);
        System.out.println("The name is :" + name);
        System.out.println("The department is :" + department);
        }
        public static void main(String[] args){
            Aruna s = new Aruna();
            s.id = 20;
            s.name = "Aruna Kumar Gouda";
            s.department = "Computer Science Engineering";
            s.display();
        }
}
