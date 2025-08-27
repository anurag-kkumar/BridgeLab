package CoreJava.Extras;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("date: YYYY-MM-DD  ");
        String str = scanner.nextLine();
        datechanges(str);
    }

    static void datechanges(String str) {
        
        LocalDate    date = LocalDate.parse(str);
        LocalDate newdate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = newdate.minusWeeks(3);
        System.out.println(finalDate);
    }
}
