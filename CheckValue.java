import java.util.*;

class CheckValue{
    public static void main(String args[]){
        int num1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num1 = input.nextInt();
        
        if(num1%2 == 0){System.out.println("Even.");}
        else if(num1%2 == 1){System.out.println("Odd.");}
    }
}