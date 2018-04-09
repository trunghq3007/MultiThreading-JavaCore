/**
 * 
 */
package main;

/**
 * @description:
 * @author: Admin
 * @time: 8:52:28 PM
 * @date: Apr 6, 2018
 */
public class ThreadInJava extends Thread {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		super.run();

		System.out.println();
		for (int x = 1; x <= 50; x++) {
			System.out.println(x + " Thread name: " + Thread.currentThread().getName());
			
		}
	}

	

}
