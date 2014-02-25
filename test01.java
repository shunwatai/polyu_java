class test01{
    public static void main (String arg[]){
        System.out.println("This is for practice differnent types of variables\n");
        double firstNum,secondNum,thirdNum;
        
        firstNum=2.2;
        secondNum=9.1;
        thirdNum=7.3;
                
        double sum=secondNum+firstNum;
        double sub=secondNum-firstNum;
        double times=secondNum*firstNum;
        double div=secondNum*firstNum/thirdNum;
        System.out.println( "SUM=2.2+9.1="+sum);
        System.out.println( "SUB=9.1-2.2="+sub);
        System.out.println( "TIMES=2.2x9.1="+times);
        System.out.println( "DIV=9.1x2.2/7.3="+div);
        
        String firstName,lastName;
        firstName="sam";
        lastName="tai";
        char ini1='S';
        char ini2='W';
        System.out.println("My name is "+firstName+lastName);
        System.out.println("My initial is "+ini1+"."+ini2+"."+lastName);
    }
}
