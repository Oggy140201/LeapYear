import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        System.out.println((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "Là năm nhuận" : "Không là năm nhuận");
    }
    }