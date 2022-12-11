package Algorithm_Study;
//과일장수 - (1)
import java.util.Arrays;

public class Ex21 {
	
    public static int solution(int k, int m, int[] score) {//k=최고점, m=개수, p=최저점, 한 상자 가격 = p*m
        int answer = 0;									   //	4		3		
        Arrays.sort(score); 
        // [1,1,2,2,2,2,4,4,4,4,4,4]
        //  0	  3		6	  9	   											
        for(int i=score.length-1; i>=0; i--) {		
        	if((score.length-i)%m==0) {			
        		answer += score[i] * m;
        	}
        }
        return answer;
    }



	public static void main(String[] args) {
		int k=4;
		int m=3;
		int[] score= {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		
		System.out.println(solution(k, m, score));
			
	}

}
