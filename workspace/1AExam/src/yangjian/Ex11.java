package yangjian;

public class Ex11 {
	
	public static void dleChar(String str1, String str2){
		StringBuffer sb = new StringBuffer();
		char str1Item;
		boolean diffSign = true;
		for (int i = 0; i < str1.length(); i++) {
			str1Item =  str1.charAt(i);
			diffSign = true;
            for(int j = 0; j < str2.length(); j++){
            	if(str1Item == str2.charAt(j)){
            		diffSign=false;
            	}
            }
            if(diffSign){
            	sb.append(str1Item);
            }
        }
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		dleChar("They are students.", "aeiou");
	}
}
