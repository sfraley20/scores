import java.util.Scanner;

public class Scores{
public static void main (String args[]){
    int min, max, sum;
    double avg;
    int score;
    int counter;
    counter = 0;
    sum = 0;
    min= 0;
    max = 0;
    avg = 0;
    Scanner keybd = new Scanner(System.in);
    System.out.println("Enter a test score. Type -1 to quit.");
    score = keybd.nextInt();
    keybd.nextLine();
    min = score;
    max =score;
    while (score != -1) {
        if (score < min ){
            min= score;
        }
        if (score > max ){
            max= score;
        }
        counter++;
        sum = sum + score;
        System.out.println(sum);
        System.out.println("please enter another score!");
        score = keybd.nextInt();


    }

    if (counter > 0) {
        avg = sum / counter;
    }


    System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg + "Sum: " + sum);
}
}
