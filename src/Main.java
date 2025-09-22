import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        String[] names = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};
        for(int i = 1; i<=10; i++){
            MyThread mt = new MyThread(names[i-1], ran.nextInt(1, 5), ran.nextInt(5, 11));
            System.out.println("\nПоток \""+mt.name+"\" №"+i);
            mt.run();
        }
    }
}