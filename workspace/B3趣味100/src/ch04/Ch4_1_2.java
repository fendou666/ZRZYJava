package ch04;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ch4_1_2
{
	public static void main(String[] args) 
	{// ���÷�����100���ڵ�����������������б� 
//		long time1=new Date().getTime();
		List<Integer> primes = getPrimes(100);
		System.out.println("100�����������£�");
		for (int i = 0; i < primes.size(); i++) 
		{   
            Integer prime = primes.get(i);   
//            System.out.printf("%8d", prime);   
            System.out.print(prime+" ");
            if (i % 10 == 9) 
            {   
                System.out.println();   
            }   
        } 
//		long time=new Date().getTime()-time1;
//		System.out.println("\n"+time+"毫秒");
    }   

    /**  
     * ��n���ڵ���������
     * @param n ��Χ  
     * @return n ���ڵ��������� 
     */  

    private static List<Integer> getPrimes(int n) 
    {   
        List<Integer> result = new ArrayList<Integer>();   
        result.add(2);   
        for (int i = 3; i <= n; i += 2) 
        {   
            if (!divisible(i, result)) 
            {   
                result.add(i);   
            }   
        }   
      return result;   
    }   
   /**  
     * �ж� n �Ƿ��ܱ�����
     * @param n      Ҫ�жϵ�����  
     * @param primes �����������б� 
     * @return ��� n �ܱ��� primes ���κ�һ���������򷵻�true 
     */  

    private static boolean divisible(int n, List<Integer> primes) 
    {   
        for (Integer prime : primes) 
        {   
            if (n % prime == 0) 
            {   
                return true;  
            }  
            if(prime>=Math.sqrt(n))
            	break;
        }   
        return false;   
    }   
} 