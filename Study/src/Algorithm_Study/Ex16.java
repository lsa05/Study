package Algorithm_Study;
class Solution3 {
    public int solution(String dartResult) {
    	int answer = 0;
    	
    	// dartResult 한문자씩 쪼개기
    	String[] dart = dartResult.split("");
//    	char[]dart=dartResult.toCharArray();
    	
    	
    	//점수를 담을 배열
    	int[] score = new int[3];	
    	
    	int game = -1;
    	
    	for(int i=0; i<dartResult.length();i++) {
    		//점수 0~9
    		if(dart[i].matches("[0-9]")) {//String배열의 경우 dart[i]>"0" && dart[i]<"9"는 왜 안되나?, dart[i]=="0"은 되는데..
    			game++;
    			score[game]=Integer.parseInt(dart[i]); //게임회차마다 점수배열에 획득한 점수i를 저장
    			//점수가 10점인 경우
    			if(dart[i+1].matches("[0-9]")){ //i번째가 0~9, 연달아서 i+1번째가 0~9 -> 즉, 두자리 수 일 경우
    				score[game]*=10;			//해당 게임 회차의 점수에 10점을 곱해줌(두 자리수는 10점뿐이므로)
    				i++;
    			}
    			
    		}
    		
    		//
            switch(dart[i]) {
	            case "S" : score[game]=(int)Math.pow(score[game], 1); break;
	            case "D" : score[game]=(int)Math.pow(score[game], 2); break;
	            case "T" : score[game]=(int)Math.pow(score[game], 3); break;
	            case "*" : score[game]*=2;
	            	if(game-1 >=0) score[game-1]*= 2; break;
	            case "#" : score[game]*=-1;
	            	
            }
    	}
    	
        for(int total : score) {
        	answer += total;
        } 
        return answer;
    }
}
//matches() : 대상 문자열과 패턴이 일치할 경우 true 반환합니다.
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
