/*ID: 21CE131
Name: Rishi Shah
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Given 2 strings, a and b, return the number of the positions where they 
contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, 
since the "xx", "aa", and "az" substrings appear in the same place in both 
strings.*/

public class Part1_5 {

	public static int stringMatch(String a,String b) {
		int count=0;
		//getting the lenght of the smallest string for termination condition in loop.
		int length=Math.min(a.length(),b.length());
		for(int i=0; i<length-1 ;i++) {
			//storing two letters at the same position in both the string in another sub-strings. 
			String asub=a.substring(i,i+2);
			String bsub=b.substring(i,i+2);
			//comparing the sub strings.
			if(asub.equals(bsub)) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		//test cases from the question.
		String x="xxcaazz";
		String y="xxbaaz";

		System.out.println(stringMatch(x,y));

		String x1="abc";
		String y1="abc";

		System.out.println(stringMatch(x1,y1));

		String x2="abc";
		String y2="axc";

		System.out.println(stringMatch(x2,y2));
	}

}
