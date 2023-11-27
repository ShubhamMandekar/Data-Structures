import java.util.Scanner;

public class VowelReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = sc.next();
		System.out.println("Given String is :"+str);
		int i = 0;
		int j = str.length();
		char ci='#';
		char cj='#';
		
		while(j>0)
		{
			
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					i=i;
					ci=str.charAt(i);
					System.out.println("ci :"+ci);
					continue;
				}
				else if(str.charAt(i)!='a'||str.charAt(i)!='e'||str.charAt(i)!='i'||str.charAt(i)!='o'||str.charAt(i)!='u'){
					i++;
					continue;
				}
			
			
			
				else if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u')
				{
					j=j;
					cj=str.charAt(j);
					System.out.println("cj :"+cj);
					continue;
				}
				else if(str.charAt(j)!='a'||str.charAt(j)!='e'||str.charAt(j)!='i'||str.charAt(j)!='o'||str.charAt(j)!='u'){
					j--;
					continue;
				}
			
			
			
				else if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
						&& str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u')
				{
					char temp = ci;
					ci=cj;
					cj=temp;
					i++;
					j++;
					continue;
				}
					
			
		}
		
		System.out.println("After Swaping vowels string is \n"+str);

	}

}
