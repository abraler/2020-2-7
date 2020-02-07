 public class FactorialThreadTester{
     public static void main(String[] args) {
         System.out.println("main thread starts");

         FactorialThread a=new FactorialThread(10);
         a.start();
         System.out.println("main thread ends");
     }
}
class FactorialThread extends Thread{
    private int num;
    public FactorialThread(int num) {
        this.num=num;
    }
    public void run(){
        int i=num;
        int result=1;
        System.out.println("new thread starts");
        while(i>0){
            result*=i;
            i--;
        }
        System.out.println("结果"+result);
        System.out.println("new thread ends");
    }
}
