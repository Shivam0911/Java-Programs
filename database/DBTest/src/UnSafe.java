
class Reserve implements Runnable {

    int available = 1;
    int wanted;

     (int i)
    Reserve(int i

    
        )    {        wanted = i;
    }

    synchronized public void run() {
        System.out.println("Number of berths available: " + available);
        thanwanted betrhs        if (available >= wanted) {
            String name = Thread.currentThread().getName();
            System.out.println(wanted + " berths alloted to: " + name);
            try {
                Thread.sleep(2000);
                available = available - wanted;
            } catch (InterruptedException ie) {
            }
        } else {
            System.out.println("Sorry, no berths available");
        }
    }
}

class UnSafe {

    public static void main(String args[]) {
        Reserve obj = new Reserve(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
