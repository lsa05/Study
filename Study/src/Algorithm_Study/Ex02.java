package Algorithm_Study;
//없는 숫자 더하기

/*
 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
 numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 */

public class Ex02 {
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;
	        
	        for(int i=0; i<=9; i++) {
	        	for(int j=0; j<numbers.length;j++) {
	        		if(i==numbers[j]) {
	        			answer+=i;
	        		}       		
	        	}
	        }
	        return 45-answer;  //0~9합 = 45
	    }
	}

	public static void main(String[] args) {
		

	}

}

/*
 class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {  //for(타입변수명:배열or컬렉션){반복할문장}
            sum -= i;
        }
        return sum;
    }
}
*/

/*
class Solution{
	public int solution(int[] numbers) {
		int answer=0;
		for(int i=0;i<=9;i++) {
			for(int j : numbers) {
				if(i==j) break;
				else if(j==numbers[numbers.length-1]) {
					answer+=i;
				}
			}
		}
		return answer;
	}
}
*/



