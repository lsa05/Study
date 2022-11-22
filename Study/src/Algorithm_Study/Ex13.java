package Algorithm_Study;
//2016년 
/*
 2016년은 윤년입니다.
 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 */
public class Ex13 {
	
	 public String solution(int a, int b) {
	        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};        

	        int date = 0;
	        for (int i = 0; i < a - 1; i++) {
	            date += month[i];
	        }

	        date += b - 1;

	        return day[date % 7];
	    }
	 
	public static void main(String[] args) {
		
		   
		
	}

}
//다른풀이
/*
import java.time.*;
class Solution {
  public String solution(int a, int b) {
      return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
  }
}

LocalDate.of(2016, a, b) -> 날짜를 출력 2016-a-b
getDayOfWeek() -> 요일을 출력 SUNDAY, MONDAY, .... SATURDAY
substring(0,3) -> 인덱스 0~2까지 추출
*/
