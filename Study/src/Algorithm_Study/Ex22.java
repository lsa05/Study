package Algorithm_Study;
//과일장수 - (2)

import java.util.Arrays;

class Solution7 {
    public int solution(int k, int m, int[] score) { 
    	//k=최고점, m=개수, p=최저점,			 한 상자 가격=p*m  result=p*m*상자수
        int answer = 0;
        							
        Arrays.sort(score);			
        
        int apple = score.length;	
        int extra = apple % m;		   
       
        
        for (int i=extra; i<apple; i=i+m) {
		    answer += score[i]*m;
		}
        return answer;
    }
}


public class Ex22 {

	public static void main(String[] args) {
		
	}

}
