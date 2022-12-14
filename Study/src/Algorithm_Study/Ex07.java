package Algorithm_Study;
// 문자열 다루기 기본
/*
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 * 
 */
//문자열 다루기 기본
public class Ex07 {
	
	public static boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4 || s.length()==6) {
        	
        	for(int i=0; i<s.length();i++) {
	        	char c = s.charAt(i);
	        	if(c>='0'&&c<='9') { //이거는 왜 a234가 틀렸다고 나올까요...
	        		answer = true;
	        	}else {
	        		answer = false;
                    break; //break걸지 않으면 a234에서 a=false찍고 다시 for문 돌아서 2,3,4차례대로 true찍어서 틀린결과 출력함
	        	}
        	}
        }else answer=false;
      return answer;
    }
	
	
	//테스트
	public static void main(String[] args) {
		String str1 = "a234";
		String str2 = "1234";
		System.out.println(solution(str1));
		
	}

}





//class Solution {
//public boolean solution(String s) {
//    boolean answer = true;
//    
//    if(s.length()==4 || s.length()==6) {
//    	
//    	for(int i=0; i<s.length();i++) {
//        	char c = s.charAt(i);
//        	if(c<'0' || c>'9') { // 숫자에''안쓰면 에러.. 
//        		answer = false;
//        		break;
//        	}
//    	}
//    }else answer=false;
//    
//    return answer;
//}
//}