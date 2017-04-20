package s14Thread;

public class A1Th1 implements Runnable {
	private A1BasicManage bm;
	private int len;
	private Object obj ;
	public A1Th1(A1BasicManage bm, int len){
		this.bm = bm;
		this.len = len;
		this.obj = new Object();
	}
	/**
	 * 这里证明线程一处被wait， 则整个都wait了
	 * 
	 */
	
	@Override
	public void run() {
		for(;len<30;){
			/**
			 * 总结必须将变化的变量放入快中，放入其他对象的化，有可能在被锁的期间，
			 * 其他线程读取的是变换前的值
			 * 
			 */
//			synchronized(obj){
//				bm.addI("字符串:"+len);
//			}
			synchronized(obj){
				bm.addI("字符串:"+len);
				len++;
			}
//			bm.addA(new Apple("苹果"+len, 22.2));
		}
	}
	
}
