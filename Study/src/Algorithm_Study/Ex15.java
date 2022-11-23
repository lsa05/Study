package Algorithm_Study;
//실패율2
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; //answer배열 크기는 스테이지 개수와 같음
        int user = stages.length;	//stages배열 길이는 사용자 수와 같음 
        double[] rate = new double[N]; 
        int fail = 0;
        
        for(int n=0; n < N; n++) {
            for(int i=0; i < stages.length; i++) {
                if (stages[i] == 0) continue;
                else if (stages[i] <= n+1) {
                    stages[i] = 0;
                    fail++;
                }
            }
            if (fail == 0 | user == 0) rate[n] = 0;
            else rate[n] = (double) fail / user;
            answer[n] = n+1;
            user = user - fail;
            fail = 0;
        }
        
        // 실패율에 따라 스테이지 정렬
        for(int i=0; i < rate.length; i++) {
            for(int j=i; j < rate.length; j++) {
                if (rate[i] < rate[j]) {
                    double tmp = rate[i];
                    rate[i] = rate[j];
                    rate[j] = tmp;
                    int tmp1 = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp1;
                // 실패율이 동일할 경우 낮은 스테이지를 앞쪽으로 이동
                } else if(rate[i] == rate[j]) {
                    if (answer[i] > answer[j]) {
                        int tmp1 = answer[i];
                        answer[i] = answer[j];
                        answer[j] = tmp1;
                    }
                }
            }
        }
        return answer;
    }
}
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
