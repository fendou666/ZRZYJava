package yangjian;

public class Ex1EmailCheck {

	public int checkEmail(String email){
		int  rec = 0;
		// 判断只有一个@符号
		if(email.indexOf('@') != email.lastIndexOf('@')||
				// 空格判断
				email.indexOf(' ')!=-1 ||
				// 长度判断
				(email.length()-email.lastIndexOf(".com"))==4){
			
			rec = 0;
		}
		
		return rec;
	}
	
}
