

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter date of birth
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();

        // Convert input string to LocalDate
        LocalDate dob = LocalDate.parse(dobInput);

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between DOB and current date
        Period age = Period.between(dob, currentDate);

        // Print the result
        System.out.println("Your Age:");
        System.out.println(age.getYears() + " years");
        System.out.println(age.getMonths() + " months");
        System.out.println(age.getDays() + " days");

        scanner.close();
    }
}
