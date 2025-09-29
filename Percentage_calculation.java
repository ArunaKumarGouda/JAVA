import java.util.Scanner;

class Percentage_calculation{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter subject 1 :");
int a = sc.nextInt();
System.out.println("The subject 1 mark is :" + a);

System.out.println("Enter subject 2 :");
int b = sc.nextInt();
System.out.println("The subject 2 mark is :" + b);

System.out.println("Enter subject 3 :");
int c = sc.nextInt();
System.out.println("The subject 3 mark is :" + c);

System.out.println("Enter subject 4 :");
int d = sc.nextInt();
System.out.println("The subject 4 mark is :" + d);

System.out.println("Enter subject 5 :");
int e = sc.nextInt();
System.out.println("The subject 5 mark is :" + e);

System.out.println("Enter subject 6 :");
int f = sc.nextInt();
System.out.println("The subject 6 mark is :" + f);

int sum = a + b + c + d + e + f;
System.out.println("Total marks is :" + sum);

float percentage = 100 * sum / 600f;
System.out.println("The percentage of total marks is :" + percentage);

sc.close();
 }
}
