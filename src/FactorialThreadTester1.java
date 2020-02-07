public class FactorialThreadTester1 {
    public static void main(String[] args) {
        System.out.println("main thread starts");

        FactorialThread1 a = new FactorialThread1(10);
        new Thread(a).start();
        System.out.println("main thread ends");
    }
}
class FactorialThread1 implements Runnable{
    private int num;

    public FactorialThread1(int num) {
        this.num = num;
    }
    public void run(){
        int i=num;
        int result=1;
        System.out.println("new thread begin");
        while(i>0){
            result*=i;
            i--;
        }
        System.out.println("结果"+result);
        System.out.println("new thread ends");
    }
}
