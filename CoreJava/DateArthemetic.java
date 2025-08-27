package CoreJava;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArthemetic {
    public static void main(String[] args) {
        dateArithmetic();
    }
    static void dateArithmetic() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter YYYY-MM-DD  ");
        String input = scanner.nextLine();
          LocalDate date = LocalDate.parse(input);
        LocalDate newdate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finaldate = newdate.minusWeeks(3);

        System.out.println(finaldate);

    }
}
