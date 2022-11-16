package Algorithm_Study;
//가운데 글자 가져오기

//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
//단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
public class Ex05 {

	public static void main(String[] args) {
		class Solution {
		    public String solution(String s) {
		        String answer = "";
		        //substring(int begin,int end)이용 (begin<= x <end) 
		        
		        if(s.length()%2==0) { //짝수  	6자리일경우 2번지이상 4번지미만 = 2,3번지		
		        	answer=s.substring(s.length()/2-1, s.length()/2+1);
		        }else { //홀수		5자리일경우 2번지이상 3번지미만 = 2번지	
		        	answer=s.substring(s.length()/2, s.length()/2+1);
		        }
		        
		        return answer;
		    }
		}
	}

}
