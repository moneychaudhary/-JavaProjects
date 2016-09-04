
public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                hello();
            }
        });
        thread.start();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Demo.hi();
            }
        });

    }
    public static void hello()
    {
        while (true)
            System.out.println("hello");
    }

    public static void hi()
    {
        while (true)
            System.out.println("hi");
    }
}
