package threads;

/**
 * first main thread is started and then it creates another thread (Thread 1) and started it.
 * Thread 1 sleep for 2 seconds
 * main thread waits for thread1 to complete
 * Main thread calls join method on Thread 1.
 * Thread 1 completes works
 * main thread joins Thread-1 
 * @author meha
 *
 */

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + " is started");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName() + " is started");
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName() + " is completed");

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t1.join();
		System.out.println(Thread.currentThread().getName() + " is completed");

	}

}
