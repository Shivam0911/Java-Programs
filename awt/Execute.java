
class Item {

    private volatile int content;

    public void setContent(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }
}

class Producer implements Runnable {

    private Item item;

    Producer(Item item) {
        this.item = item;
    }

    public void run() {
        int i = 0;
        synchronized (item) {
            while (true) {
                ++i;
                if (i == 10) {
                    return;
                }
                System.out.println("Producing " + i);
                item.setContent(i);
                item.notify();
                try {
                    item.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Consumer implements Runnable {

    private Item item;

    Consumer(Item item) {
        this.item = item;
    }

    public void run() {
        synchronized (item) {
            while (true) {
                if (item.getContent() != 0) {
                    System.out.println("Consuming " + item.getContent());
                }
                item.notify();
                try {
                    if (item.getContent() == 9) {
                        return;
                    }
                    item.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Execute {

    public static void main(String arg[]) {
        Item item1 = new Item();
        new Thread( new Consumer(item1)).start();
        new Thread( new Producer(item1)).start();


    }      }
