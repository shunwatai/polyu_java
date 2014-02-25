import java.util.*;

class GameLevel{
    public static void main(String args[]){
        int lv;
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - Beginner");
        System.out.println("2 - Normal");
        System.out.println("3 - Advanced");
        System.out.println("4 - Expert");

        System.out.print("Your choice?");
        lv = input.nextInt();

        if(lv == 1){System.out.println("Beginner level is selected.");}
        else if(lv == 2){System.out.println("Normal level is selected.");}
        else if(lv == 3){System.out.println("Advanced level is selected.");}
        else if(lv == 4){System.out.println("Expert level is selected.");}
        else{System.out.println("nvalid choice is selected.");}
        
    }
}