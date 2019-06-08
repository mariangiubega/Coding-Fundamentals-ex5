import java.time.Year;
import java.util.Scanner;

public class AnBisect {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int an = input.nextInt();
        if ((an%4==0 && an%100!= 0) || an%400==0){
                System.out.println("An bisect");
        }else {
                System.out.println("Nu este bisect!");
            }

        System.out.println(Year.isLeap(an));
    }

}