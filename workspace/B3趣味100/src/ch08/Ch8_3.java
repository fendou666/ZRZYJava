package ch08;
public class Ch8_3 
{
	public static void main(String[] args) 
	{
		int i;//被除数
		int j;//除数
		int l;//商
		
		/*1. 被除数的范围是10000到99999*/
		for(i=10000;i<=99999;i++) 
			/*1.除数的范围是10到99*/
			for(j=10;j<=99;j++) 
				/*1. 可以整除&& 2.商l在100到999之间且十位数字为7*/
				if(i%j==0&&(l=i/j)>100&&l<=999&&l%100>=70&&l%100<80)
					/*3.商的第一位与除数的积为三位数，且后两位为77*/
					if(j*(l/100)>100&&j*(l/100)%100==77)
						/*4. 被除数的第三位一定为4*/
						if(i%1000-i%100==400)
							/*5. 7乘以除数的积为一个三位数，且第二位为7*/
							if(j*7>100&&j*7%100>=70&&j*7%100<80) 
								/*6. 商的最后一位不能为0，且与除数的积为一个二位数*/
								if(l%10!=0&&(j*(l%10))<100&&j*(l%10)>10) 
									System.out.printf("%d/%d=%d ",i,j,l);
		
	} 

}


