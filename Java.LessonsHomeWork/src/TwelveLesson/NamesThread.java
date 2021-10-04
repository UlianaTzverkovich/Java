package TwelveLesson;


public class NamesThread extends Thread {
    private static final Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                object.notify();
                System.out.println("Name - " + getName());
                try {
                    object.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
