public class Loadaa{
    //public static int a = 111;	// 调用静态块
    //public static final int a = 111;  //未调用静态块
    //public static final Integer a = 111;  // 调用静态块
    //public static final Object a = null;  //调用静态块
    //public static final String a = "a"; // 未调用静态块
    //public static final String a = "abdfc"; // 未调用静态块
    static {
        System.out.println("我是静态块");
    }
    
}