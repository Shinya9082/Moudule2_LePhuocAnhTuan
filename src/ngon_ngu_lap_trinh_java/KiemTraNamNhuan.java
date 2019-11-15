package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check");
        int year= input.nextInt();
        if(year%4==0&& year%100!=0 || year%400==0)
            System.out.print("Is leap year");
        else
            System.out.print("Isn't leap year");
    }
}
