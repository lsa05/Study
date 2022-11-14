package Algorithm_Study;
/* 서울에서 김서방 찾기
 * 
 *String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, 
 *"김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
 *seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 */
public class Ex01 {

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] arr= {"Kim","Lee","Park"};
		System.out.println(s.solution(arr));
	}

}

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")){ //if문이 true일 때 실행문 작동
        		answer = "김서방은 " + i + "에 있다";
        				break;
        	}
        }
        return answer;
    }
}

/*
 * equals() 
 * 매개변수로 받은 문자열과 String 인스턴스의 문자열을 비교한다. 일치하면 true 반환
 * 
 */
