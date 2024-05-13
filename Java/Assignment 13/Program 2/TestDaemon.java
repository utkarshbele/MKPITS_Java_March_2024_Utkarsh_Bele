package assignment13;

public class TestDaemon extends Thread{
        public void run(){
            if(Thread.currentThread().isDaemon()){//checking for daemon thread
                System.out.println("Daemon thread works");
            }
            else{
                System.out.println("User thread work");
            }
        }
    }
