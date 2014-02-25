import javax.swing.*;

public class StudentRec{
    public static void main(String args[]){
        // declare 3 variables name, id, score
        String studentName;
        String studentID;
        double finalScore;
        String grade;
        grade = "";

        //input the name
        String input;
        input = JOptionPane.showInputDialog(null, "Enter student name: ");
        studentName = input;

        //input the id
        input = JOptionPane.showInputDialog(null, "Enter studentID: ");
        studentID = input;

        //input the score
        input = JOptionPane.showInputDialog(null, "What is the final score?");
        finalScore = Double.parseDouble(input);

        //IF statement for display the grade
        if (finalScore >= 90){grade = "A+";}
        else if (finalScore >= 85){grade = "A";}
        else if (finalScore >= 80){grade = "B+";}
        else if (finalScore >= 75){grade = "B";}
        else if (finalScore >= 65){grade = "C+";}
        else if (finalScore >= 60){grade = "C";}
        else if (finalScore < 60){grade = "D";}
        else if (finalScore < 50){grade = "F";}

        //combine and display above 3 input;
        JOptionPane.showMessageDialog(null, "Please confirm the following information\n"
                                            + "\nName: " + studentName
                                            + "\nID: " + studentID 
                                            + "\nScore: " + finalScore
                                            + "\nGrade: " + grade);


    }
}
