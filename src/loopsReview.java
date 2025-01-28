package src;
import java.util.Scanner;
// homework calculate average and display to user.
// Then provide a letter grade based on ten point scale
public class loopsReview {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        double count = 0;
        while(grade >= 0){
            System.out.println("Please input a grade from 0 to 110 (-1 to terminate)");
            grade = input.nextDouble();
            if (grade > 110){
                System.out.println("Invalid!  Must be between 0 and 110");
            }
            else {
                sum += grade;
                count++;
            }
            System.out.println("Count is " + count + " Sum is " + sum);
        }
    }
}
