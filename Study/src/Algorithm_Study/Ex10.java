package Algorithm_Study;
// 예산
/*
 * S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다. 
 * 그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 
 * 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
 * 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다. 
 * 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
 * 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 
 * 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
 */
import java.util.Arrays;

public class Ex10 {
	
	    public static int solution(int[] d, int budget) {
	        int answer = 0;
	        int sum=0;
	        int count=0;
	        //오름차순 정렬 (가장 작은수부터 더해야 가장 많은 배열요소(부서)들을 더할 수 있어서..)
	        Arrays.sort(d);
	        
	        for(int i=0; i<d.length; i++) {
	        	sum+=d[i];
	        	if(sum<=budget) {
	        		count++;
	        	}else break;
	        }
	        
	        answer=count;
     
	        return answer;
	    }
	
	
	
	public static void main(String[] args) {
		int [] d= {1,3,2,5,4};
		int budget=9;
		System.out.println(solution(d,budget));

	}

}
