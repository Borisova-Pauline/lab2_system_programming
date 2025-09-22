public class Main {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("first", 1, 5);
        mt1.run();
        MyThread mt2 = new MyThread("second", 3, 6);
        mt2.run();
        MyThread mt3 = new MyThread("third", 45, 50);
        mt3.run();
        MyThread mt4 = new MyThread("fourth", 35, 37);
        mt4.run();
        MyThread mt5 = new MyThread("fifth", 1, 7);
        mt5.run();
        MyThread mt6 = new MyThread("sixth", 4, 12);
        mt6.run();
        MyThread mt7 = new MyThread("seventh", 65, 70);
        mt7.run();
        MyThread mt8 = new MyThread("eighth", 53, 59);
        mt8.run();
        MyThread mt9 = new MyThread("ninth", 70, 74);
        mt9.run();
        MyThread mt10 = new MyThread("tenth", 23, 28);
        mt10.run();
    }
}