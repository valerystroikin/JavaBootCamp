/**
 *
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int x = 1;
		int y = 20;
		while ( x < y) {
			System.out.println ( "The value of x is:=" + x++ );
		}




		// Table from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("*** Table of "+i + " ***");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "X" + j +" = " + i*j);
		}
		}
/*
		// Table from 11 to 20
		for (int i = 11; i <= 20; i++) {
		// complete code. write for loop for int i
			System.out.println("*** Table of "+i + " ***");
			// complete code. write nested for loop for int j
				System.out.println(i + "X" + i +" = " + i*j);
		}
		}
  */
        for (int i = 11; i <= 20; i++) {
            System.out.println("*** Table of "+i + " ***");
                for (int j = 11; j <= 20; j++) {
                    System.out.println(i + "X" + j +" = " + i*j);
        }
    }

	}

}
