/**
 * 
 */
package main;

/**
 * @description:
 * @author: Admin
 * @time: 8:59:27 PM
 * @date: Apr 6, 2018
 */
public class main {
	public static void main(String[] args) {
		/*ThreadInJava inJava = new ThreadInJava();
		inJava.start();
		ThreadInJava2 inJava2 = new ThreadInJava2();
		inJava2.start();
		ThreadInJava3 inJava3 = new ThreadInJava3();
		inJava3.start();
		//ThreadInJava4 i
		Thread thread4= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});*/
		
		ThreadInJava inJava = new ThreadInJava();
		inJava.start();
		
		ThreadInJava inJava2 = new ThreadInJava();
		inJava2.start();
		
	}
}
