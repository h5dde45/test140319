package test;

public class Test {
    private static int x = 0;
    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            x = 10;
            while (!flag) ;
            System.out.println(x);
        }).start();

        Thread.sleep(111);
        x = 5;
        flag = true;
    }
}
