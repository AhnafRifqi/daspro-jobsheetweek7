import java.util.Scanner;

public class ForMultiples02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple;
        int sum = 0;
        int counter = 0;
      
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if(i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }


        System.out.printf("There are %d number that are multiple of &d in range 1 to 50.\n", counter, multiple); 
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
    }
}
