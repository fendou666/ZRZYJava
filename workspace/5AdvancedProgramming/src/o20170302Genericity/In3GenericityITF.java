package o20170302Genericity;

// [访问权限修饰符] [static] [final] <类型参数列表> 返回值类型 方法名([形式参数列表])
// 所以类型参数列表要除过类自己定义的字母，或者是接口定义的字母, 类型参数列表代表方法中可以使用的类型(所以如果方法中需要的参数类型都放入<>中)

public interface In3GenericityITF<T> {
	
	// 不可以这样定义，这样会，将接口的泛型隐藏
	
//	public <T> T getT();
//	public <T> void setT(T t);
	
	public  T getT();
	public  void setT(T t);
	
}
