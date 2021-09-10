package september.six;

/**
 * @author ：Eas
 * @date ：Created in 2021/9/6 006 15:58
 * @description：
 *
 *  * 线程通信的应用：经典例题：生产者/消费者问题
 *  *
 *  * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 *  * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员
 *  * 会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品
 *  * 了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 *  可能出现的问题：
 *  1.生产者比消费者快，消费者会漏掉一些数据没有取到
 *  2.消费者比生产者快，消费者会取到相同的数据
 *  *
 *  * 分析：
 *  * 1. 是否是多线程问题？是，生产者线程，消费者线程
 *  * 2. 是否有共享数据？是，店员（或产品） (线程安全问题)
 *  * 3. 如何解决线程的安全问题？同步机制,有三种方法
 *  * 4. 是否涉及线程的通信？是
 *  *
 * @modified By：
 * @version: $
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Productor clerk1 = new Productor(clerk);
        Consumer clerk2 = new Consumer(clerk);

        Thread t1 = new Thread(clerk1);
        Thread t2 = new Thread(clerk2);

        t1.setName("生产者1");
        t2.setName("消费者1");

        t1.start();
        t2.start();


    }
}


class Clerk{
    private int productCount = 0;
//生产产品
    public synchronized void produceProduct(){
        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"开始生产第"+productCount+"个");

            notify();

        }else {
//            wait();
            try {
                wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    //消费产品
    public synchronized void consumerProduct(){
        if(productCount>0){
            System.out.println(Thread.currentThread().getName()+"开始消费第"+productCount+"个");
            productCount--;

            notify();

        }else {
            //等待
            try {
                wait(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}


class Productor implements Runnable{

    private Clerk clerk;


    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    public Productor() {
    }

    @Override
    public void run() {
        System.out.println("生产者生产"+Thread.currentThread().getName());
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }


}

class Consumer implements Runnable{

    private Clerk clerk;

    public Consumer() {
    }

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费"+Thread.currentThread().getName());
        while (true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumerProduct();
        }
    }
}