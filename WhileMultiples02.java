import java.util.Scanner;

public class WhileMultiples02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple;
        int sum = 0;
        int counter = 0;
        
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();
        
        int i = 1;
        while (i <= 50) {
            if (i % multiple == 0) {
                sum += i;
                counter++;}
            i++;
        }

        double average = 0;
        if (counter != 0) {
            average = (double) sum / counter;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Counter: " + counter);
        System.out.println("Average: " + average);
    }
}
