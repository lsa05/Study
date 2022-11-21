package Algorithm_Study;

public class Ex12 {
	
	    public static int solution(String s) {
 
	        String [] abc= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	        
	        for(int i=0; i<10;i++) {
	        	s=s.replaceAll(abc[i], i+""); //i+"" 대신 Integer.toString(i), String.valueOf(i)도 가능
	        }

	        return Integer.parseInt(s);
	    }
	

	
	public static void main(String[] args) {
		String s= "one4seveneight";
		System.out.println(solution(s));
	}

}


//다른풀이1
/*
 class Solution {
    public int solution(String s) {

        String[] arrNumStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0 ; i<arrNumStr.length ; i++) {
            s = s.replace(arrNumStr[i], String.valueOf(i));
        }

        return Integer.parseInt(s);

    }
}
 */
//다른풀이2
/*
class Solution {
	public int solution(String s) {

	String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
	String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
	    for (int i = 0 ; i <10 ; i++){
	        s = s.replace(word[i] , num[i]);
	    }
	    return Integer.parseInt(s);
	}
}
*/