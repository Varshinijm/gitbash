package BrokenLinks;

public class displayOccuranceOfEachCharacter {

	public static void main(String args[])
	{
		String str="Programming";
		String st="";
		String[] s = str.split("");
		
		for(int i=0;i<s.length;i++)
		{
			char ch=s[i].charAt(0);
			int count=0;
			for(int j=0;j<s.length;j++)
			{
				if(ch==s[j].charAt(0))
				{
					count++;
				}
			}
			if(st.indexOf(ch)==-1)
				st=st+ch+":"+count+"\n";	
		}
		System.out.println(st);
	}
}
