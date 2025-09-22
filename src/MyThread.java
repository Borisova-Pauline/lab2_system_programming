public class MyThread implements Runnable{
    Thread thread;
    String name;
    int from;
    int to;
    public MyThread(String name, int from, int to){
        this.name = name;
        if(from<to){
            this.from=from;
            this.to=to;
        }else{
            this.from=1;
            this.to=5;
        }
        thread = new Thread(this, name);
        System.out.println(thread);
        //thread.start();
    }

    @Override
    public void run(){
        System.out.println("Поток запущен");
        for(int i = this.from; i<=this.to; i++){
            try{
                System.out.println(i);
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println("Поток прерван");
            }
        }
        System.out.println("Поток завершён");
    }
}
