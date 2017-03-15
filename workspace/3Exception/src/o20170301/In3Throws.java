package o20170301;

public class In3Throws {
	
	public  void methodThrow(int a)  {
		
		try {
			if (a>60) {
				throw new Exception("数据大于60，不符合条件");
			}
		}catch (Exception e) {
			System.out.println("方法中的异常是：" + e);
		}
		
		
	}
	
	public  void methodThrows(int a) throws Exception  {
		
		if (a>60) {
			throw new Exception("数据大于60，不符合条件");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		In3Throws test = new In3Throws();
		test.methodThrow(100);
		// throws的结束必须要try catch 否则用 throws Exception 继续声明调用的方法名
		test.methodThrows(100);
		
	}
}
