/**
 * 
 */
package main;

/**
 * @description:  
 * @author: Admin
 * @time: 9:09:13 PM
 * @date: Apr 6, 2018
 */
public class ThreadInJava4 implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println();
		for (int x = 1; x <= 50; x++) {
			System.out.println(x + " Thread name: " + Thread.currentThread().getName());
		}
		
	}

}
