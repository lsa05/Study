package Algorithm_Study;

public class Ex11 {

	
	
	    public static int solution(int[][] sizes) {
	        int answer = 0;
	        int w=0;
	        int h=0;
	        //대소비교 후, 큰수:가로, 작은 수:세로 / 가로 중 가장 큰 수 * 세로 중 가장 큰 수 -> 최적 넓이 
	       
	        for(int i=0; i<sizes.length; i++) { //  {{10,7},{12,3},{8,15},{14,7},{5,15}}
	        	if(sizes[i][0]>=sizes[i][1]){	//	{10,7},{12,3},{14,7}
	        		w=Math.max(sizes[i][0], w);	// w(가로)=14	
	        		h=Math.max(sizes[i][1], h);	// h(세로)=7
	        	}else { 						//  {8,15},{5,15}
	        		w=Math.max(sizes[i][1], w);	// w(가로)=15    ->max
	        		h=Math.max(sizes[i][0], h);	// h(세로)=8     ->max
	        		}        	
	        	}        	        
	        answer=w*h;	        
	        return answer;
	    }
	
	
	
	public static void main(String[] args) {
		int [][]sizes= {{10,7},{12,3},{8,15},{14,7},{5,15}};
		System.out.println(solution(sizes));

	}

}


// 다른 풀이 1
/*
class Solution {
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
*/

// 다른 풀이2
/*
 class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            int paramMax = Math.max(size[0], size[1]);
            int paramMin = Math.min(size[0], size[1]);

            if (paramMax > max) {
                max = paramMax;
            }

            if (paramMin > min) {
                min = paramMin;
            }
        }
        return max * min;
    }
}
*/

