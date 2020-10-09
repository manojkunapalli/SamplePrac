import java.util.Scanner;

public class sequence {
    public static void main(String[] args){
        System.out.println("welcome to the program");
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        System.out.println("Given input is "+t);

        // check even or odd
        if(t%2 == 0){
            System.out.println(t+" is even number");
        } else {
            System.out.println(t+" is odd number ");
        }
    }
}
