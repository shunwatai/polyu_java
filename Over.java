class Over{
    public static void main(String args[]){
        System.out.println("Test overflow.");

        byte b;

        b = 127;
        System.out.println("b = " + b);
        b += 1;
        System.out.println("b + 1 = " + b);

        b = 127;
        System.out.println("b = " + b);
        b += 2;
        System.out.println("b + 2 = " + b);

        b = -127;
        System.out.println("b = " + b);
        b -= 1;
        System.out.println("b - 1 = " + b);

        b = -127;
        System.out.println("b = " + b);
        b -= 2;
        System.out.println("b - 2 = " + b);

        b = -127;
        System.out.println("b = " + b);
        b -= 3;
        System.out.println("b - 3 = " + b);
    }
}
