import java.util.*;

class Bmi{
    public static void main(String args[]){
        int weight,height;
        double bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        weight = input.nextInt();
        System.out.print("Enter your height in cm: ");
        height = input.nextInt();

        bmi = weight / ((height/100) * (height/100));
        System.out.println("Your bmi is: " + bmi);
    }
}
