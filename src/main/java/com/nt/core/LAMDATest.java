package com.nt.core;

interface Arithmetic{
	public int add(int x,int y);
}

public class LAMDATest {
	
	public static void main(String[] args) {
		  Arithmetic  ar1=(int a,int b)->{ int c=0;
		                                                               c=a+b;
		                                                               return c;
		                                                            };
		 System.out.println("result ::"+ar1.add(10, 20));
		   System.out.println("====================");
		            Arithmetic  ar2=(int a,int b)->{  return a+b;    };
                 System.out.println("result ::"+ar2.add(10, 20));
             System.out.println("====================");
		            Arithmetic  ar3=(int a,int b)->   a+b    ;
              System.out.println("result ::"+ar3.add(10, 20));
              System.out.println("====================");
	            Arithmetic  ar4=( a, b)->   a+b    ;
        System.out.println("result ::"+ar4.add(10, 20));
        System.out.println("====================");
        Arithmetic  ar5=( x, y)->   x+y    ;
       System.out.println("result ::"+ar5.add(10, 20));

              
       
	}

}
