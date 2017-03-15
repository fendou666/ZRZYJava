package o20170308ThreadComu;

public class Producter implements Runnable {
	private Info info=null;

	public Producter(Info info) {
		this.info = info;
	}
	@Override
	public void run() {
		boolean flag=false;
		for (int i = 0; i < 10; i++) {
			if(flag){
				this.info.set("华为", "手机"+i);
				flag=false;
			}else{
				this.info.set("三星", "笔记本"+i);
				flag=true;
			}
		}
		
	}

}
