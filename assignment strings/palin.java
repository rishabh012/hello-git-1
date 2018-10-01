import java.util.*;
public class palindrome
	{
		public static boolean Palin(String str)
		{
			int l = str.length()-1;
			char c[]= str.toCharArray();
			int flag=0;
			for(int i = 0;i < str.length()/2;i++){
			if(c[i]!=c[l--])
			{
				flag = 1;
				break;
			}
		}
		if(flag == 0)
		{
			return true;
		else  {
			return false;
	}
	public static void main(String[] ar){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean b = palin(str);
		System.out.println(b+"");
		
	}
}