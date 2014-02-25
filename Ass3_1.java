class Ass3_1{
	
	public static void main (String args[]) {
        ////// question 2a
        //int x,y,z,a,b,c,d;
		//x = 1;
		//y = 2;
		//z = 7;
		//a = 3;
		//b = 4;
		//c = 5;
		//d = 6;
		
		//if (a < b)           //if 1 < 2
		    //if (c > d)       //if 5 > 6
				//x = y;       //1 = 2
		//else x = z;          //else 1 = 7
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(d+"\n");

        ////// question 2b
		//if (a < b){             //if 1 < 2
			//if (c > d)          //if 5 > 6
				//x = y; }        //1 = 2
		//else x = z;             //else 1 = 7
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(z);
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		//System.out.println(d);

        //// question 3
		//int x,y,z;
		//x=0;
		//y=2;
		//z=1;
		//if ((x <= 0) && (y < z))
			//System.out.println("x is not positive");
		//System.out.println("y and z");
		//if (z == 1)
			//System.out.println("z is 1");
		////y and z
		////z is 1
		
		//// question 4
		//int x,y;
		//x=7;
		//y=9;
		//if (x==1){
			//if (y==2)
				//System.out.println(x);
			//else
				//System.out.println(y);}
		//System.out.println(x+y);
		////16

        //// question 6
		double pay;
		int ranking;
		ranking = 4;
		pay = 2.0;
		switch (ranking) {
			case 4.55:
				pay = pay * 0.2;
				break;
			case 5.55:
				pay = pay * 0.15;
				break;
			default:
				pay = pay * 0.05;
			}
        System.out.println(pay);

	}
}
