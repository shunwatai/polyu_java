import java.util.*;

class GameLevel_switch{
    public static void main(String args[]){
        int lv;
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - Beginner");
        System.out.println("2 - Normal");
        System.out.println("3 - Advanced");
        System.out.println("4 - Expert");

        System.out.print("Your choice?");
        lv = input.nextInt();
        
        switch(lv){
        case 1:
            System.out.println("Beginner level is selected.");
            break;
        case 2:
            System.out.println("Normal level is selected.");
            break;
        case 3:
            System.out.println("Advanced level is selected.");
            break;
        case 4:
            System.out.println("Expert level is selected.");
            break;
        default:
            System.out.println("nvalid choice is selected.");
       
        }
        
    }
}