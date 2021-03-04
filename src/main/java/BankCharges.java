import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the number of checks written this month");
    int checks = keyboard.nextInt();
    calculateCharge(checks);
  }
  public static void calculateCharge(int numOfChecks) {
      double charge = 10.00;
    if (numOfChecks < 20) {
      charge = charge + (numOfChecks * .10);
    } else if (numOfChecks >= 20 && numOfChecks <= 39) {
      charge = charge + (numOfChecks * .08);
    } else if (numOfChecks >= 40 && numOfChecks <= 59) {
      charge = charge + (numOfChecks * .06);
    } else if (numOfChecks >= 60) {
      charge = charge + (numOfChecks * .04);
    }
  System.out.println("Your bank charge for this month is $" + charge);
  }
}
