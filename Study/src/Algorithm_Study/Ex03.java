package Algorithm_Study;
//나누어 떨어지는 숫자 배열

/*
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
*/
import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int[] arr, int divisor) {
		        
		        int count = 0;
		        int number = 0;
		        
		        for(int i = 0; i < arr.length; i++){
		            if(arr[i] % divisor == 0){
		                count++;
		            }
		        }
		        
		        if(count == 0){
		            int[] answer = {-1};
		            return answer;
		        }
		        
		        int[] answer = new int[count];
		        
		        for(int i = 0; i < arr.length; i++){
		            if(arr[i] % divisor == 0){
		                answer[number] = arr[i];
		                number++;
		            }
		        }
		        
		        Arrays.sort(answer);
		        return answer;
		        
		    }
		}
	}

}
