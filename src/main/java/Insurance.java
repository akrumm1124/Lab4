import java.util.Scanner;
public class Insurance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your age, so that your insurance rate can be calculated.");
    int age = keyboard.nextInt();
    calculateInsurance(age);
    }
    public static void calculateInsurance (int age) {
        int insurancePrice = (age * 5) + 300;
        System.out.println("Since you are " + age + " years old, your insurance will cost $" + insurancePrice + " per year.");
    }
}
