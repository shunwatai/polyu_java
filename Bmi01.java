import java.util.*;

class Bmi01{
    public static void main(String args[]){
        int weight,height;
        double bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        weight = input.nextInt();
        System.out.print("Enter your height in cm: ");
        height = input.nextInt();

        bmi = weight / ((height/100.0) * (height/100.0));
        System.out.println("Your bmi is: " + bmi);

        if(bmi>=20 && bmi<=25){System.out.println("Norm");}
        else if(bmi<20){System.out.println("Thin");}
        else if(bmi>25){System.out.println("Fat");}
    }
}
