package o20170306;

public class In2Recursion {
	
	private int  i;
	// 总结递归就是哪进(继续调用这个方法)哪出(return)这两步
	public void recursionMethod(){
	
		i = (int)(Math.random()*10+1);
		System.out.println("i == " + i);
		if (i == 3){
			return;
		}else {
			recursionMethod();
		}
		
	}
	
	public void forRecursionMethod(){
		
		i = (int)(Math.random()*10+1);
		System.out.println("i == " + i);
		
	}
	
	
	public static void main(String[] args) {
		In2Recursion rec = new In2Recursion();
		rec.recursionMethod();
		
		while(rec.i!=5) {
			rec.forRecursionMethod();
		}
	}
}
