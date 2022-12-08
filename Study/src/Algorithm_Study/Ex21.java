package Algorithm_Study;
//과일장수 - (1)
import java.util.Arrays;

class Solution6 {
    public int solution(int k, int m, int[] score) { //k=최고점, m=개수, p=가장 낮은 점수, 한 상자 가격 = p*m
        int answer = 0;
        Arrays.sort(score); //[4,4,4,4,4,4,2,2,2,2,1,1]
        // m=3 -> 444/ 444/ 222/ 211
        //										0   3   6   9
        for(int i=score.length-1; i>=0; i--) {//112 222 444 444   1*3 + 2*3 + 4*3 +4*3 = 33
        	if((score.length-i)%m==0) {
        		answer = score[i] * m;
        	}
        }
        return answer;
    }
}


public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
