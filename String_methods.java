public class String_methods {

 public static void main(String[] args){

        String s = " Aruna Kumar Gouda ";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println("While using trim :" + s.trim());
        System.out.println(s.substring(7,12));
        System.out.println(s.replace('A','M'));
        System.out.println(s.startsWith(" Ar"));
        System.out.println(s.endsWith("Gouda "));
        System.out.println(s.charAt(4));
       System.out.println(s.indexOf("a",11));
        System.out.println(s.lastIndexOf("r"));
        System.out.println(s.equals(" Aruna Kumar Gouda "));
        System.out.println(s.equalsIgnoreCase(" arUna kumaR gOuda "));
        System.out.println("Aruna\tKumar\nGouda");

        String value = s.toLowerCase();
        System.out.println(value);

        String str = new String("Mantu Kumar");
        System.out.println(str);
        
    }
}
