

/**
 * @author fubibo
 * @create 2021-02-23 16:17
 */
/**
   静态内部类实现单例模式
 */
public class Q2 {
    private static class Sing{
        private static Q2 instance=new Q2();
    }

    public static Q2 getInstance(){
        return Sing.instance;
    }

    private Q2(){

    }
}
