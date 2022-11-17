package Algorithm_Study;
// 약수의 개수와 덧셈
/*
 *  두 정수 left와 right가 매개변수로 주어집니다. 
 *  left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
 *  약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 * 
 */

public class Ex06 {

	public static void main(String[] args) {
		// 약수가 홀수인 경우 = 제곱근을 갖는 경우, 따라서 제곱근 판별 한다.(1,4,9,16,25...)
		class Solution {
		    public int solution(int left, int right) {
		        int answer = 0;
		        
		        for(int i=left; i<=right; i++) {
		        	double a=(double)Math.sqrt(i); //i=16 -> a=4, i=10 -> a=3.xxx 
		        	if(a%1==0) { //제곱근을 나누었을 때 나머지가 0인지(정수인지) 확인  (9는 3, 10~15의 제곱근을 구하면 3.xxx가 나옴, 16은 4 )
		        		answer -=i;
		        	}else {
		        		answer +=i;
		        	}
		        }
		        return answer;
		    }
		}
		
	}

}
