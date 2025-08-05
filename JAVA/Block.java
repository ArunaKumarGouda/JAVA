class Block{

    void display(){
        int a = 230;
        System.out.println(a);

        int c = 708384;

        System.out.println(c);

        for (int i = 0; i < 5; i++)
        {
            int b = 20;
            System.out.println(b);
        }
        for (int j = 0; j <= 20; j++)
        {
            int b= 30;
            System.out.println(b);
        }
    }
    public static void main(String[] args){
        Block b = new Block();
        b.display();
    }
}
