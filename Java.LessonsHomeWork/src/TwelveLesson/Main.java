package TwelveLesson;

import java.util.ArrayList;
import java.util.List;


public class Main {
        public static void main(String[] args) throws InterruptedException {
                firstAndSecond();
                third();
                fourth();
        }


        public static void firstAndSecond() {
                for (int i = 0; i < 10; i++) {
                        Thread thread = new Thread() {
                                @Override
                                public void run() {

                                        System.out.println(getName() + " : " + getState());
                                        for (int j = 0; j < 10; j++) {
                                                System.out.println(j);
                                        }
                                }
                        };
                        System.out.println(thread.getName() + " : " + thread.getState());
                        thread.start();
                        System.out.println(thread.getName() + " : " + thread.getState());
                }
        }

        private static void third() throws InterruptedException {
                Counter counter = new Counter();
                List<Thread> threadList = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                        Thread thread = new Thread(() -> {
                                for (int j = 0; j < 1000; j++) {
                                        synchronized (counter) {
                                                counter.increment();
                                        }
                                }
                        });
                        thread.start();
                        threadList.add(thread);
                }

                for (Thread thread : threadList) {
                        thread.join();
                }


                System.out.println(counter.getCount());
        }


        public static void fourth() {
                NamesThread thread_1 = new NamesThread();
                thread_1.start();

                NamesThread thread_2 = new NamesThread();
                thread_2.start();
        }
}
