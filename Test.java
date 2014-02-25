class Test{
    public static void main(String[] arg){
        byte a,b;
        a=127;
        b=-128;
        System.out.println("a init= "+a);
        a+=1;
        System.out.println("127+1= "+a);
        System.out.println("b init= "+b);
        b-=1;
        System.out.println("-128-1= "+b);
        int pos;
        pos='Q';
        String by=Integer.toBinaryString(pos);
        String hex = Integer.toHexString(pos);
        System.out.println("Hex= " + hex);
        System.out.println(pos);
        System.out.println("binary= "+by);
    }
}
