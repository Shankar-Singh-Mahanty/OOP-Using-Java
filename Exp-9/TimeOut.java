/* create two classes name as hii and hello and showing how exception can occur if we pass the timeout value,
and it displays 4 times hii and hello.   */

// Define two classes that implement Runnable interface
class Hii implements Runnable {
    // Override the run method to print "Hii" four times
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Hii");
            try {
                // Sleep for 1000 milliseconds
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception
                e.printStackTrace();
            }
        }
    }
}

class Hello implements Runnable {
    // Override the run method to print "Hello" four times
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello");
            try {
                // Sleep for 1000 milliseconds
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the exception
                e.printStackTrace();
            }
        }
    }
}

// Create a main class to test the code
public class TimeOut {
    public static void main(String[] args) {
        // Create two objects of Hii and Hello classes
        Hii hii = new Hii();
        Hello hello = new Hello();

        // Create two threads with the objects as targets
        Thread t1 = new Thread(hii);
        Thread t2 = new Thread(hello);

        // Start the threads
        t1.start();
        t2.start();
        t1.interrupt();
        t2.interrupt();

        // Wait for the threads to finish with a timeout of 2500 milliseconds
        try {
            t1.join(1500);
            t2.join(1500);
        } catch (InterruptedException e) {
            // Handle the exception by printing a message and breaking the loop
            System.out.println("Main thread interrupted");
            return;
        }

        // Print a message after the threads are done
        System.out.println("Main thread finished");
    }
}