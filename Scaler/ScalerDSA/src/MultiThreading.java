public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread t2= Thread.currentThread();
        mythread t1= new mythread();
        t1.t=t2;
        t1.start();


        for(int i=0;i<3;i++){
            t1.join();
            System.out.println("sinha");}
    }
}

class mythread extends Thread{
    Thread t;



    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

        for(int i=0;i<3;i++){
            try{
                t.join();
                System.out.println("sachin");

            }
            catch(Exception e){

            }



        }

    }
}

