/**
 *
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class AddWholeNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			total = total + i;
		}

		System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);

		total = 0;
        for (int i = 51; i <= 100; i++) {
		// complete the code. write for loop for i
		total = total + i;
		}
		System.out.println("Addition of Whole Numbers from 51 to 100 = " + total);


	}

}
