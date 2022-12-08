package Algorithm_Study;
//과일장수 - (2)

import java.util.Arrays;

class Solution7 {
    public int solution(int k, int m, int[] score) { 
    	//k=최고점, m=개수, p=가장 낮은 점수, 한 상자 가격
        int answer = 0;
         
        Arrays.sort(score);			//[4,4,4,4,4,4,2,2,2,2,1,1]          [3,3,2,2,1,1,1]
        
        int apple = score.length;	// 사과갯수				-> apple=12    =7
        int extra = apple % m;		// 남은 사과갯수 			-> extra=0     =3       
       
        // [0] [3] [6] [9]                                    [0]
        //  112 222 444 444   1*3 + 2*3 + 4*3 +4*3 = 33        3322 111
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
