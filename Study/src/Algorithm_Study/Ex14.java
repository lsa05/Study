package Algorithm_Study;
//실패율
import java.util.*;
/*
class Solution {
	class Fail{
		int stage;
		double rate;
		
		Fail(int stage, double rate){	//생성자
			this.stage=stage;
			this.rate=rate;
		}	
	}
	
	Comparator<Fail>comp=new Comparator<Fail>() {	//Comparator 객체 생성
		public int compare(Fail a, Fail b) { 		//compare()메소드
			if(a.rate<b.rate)	
				return 1;
			else if(a.rate>b.rate)
				return -1;
			else {									//실패율이 같은 경우
				if(a.stage>b.stage)					//스테이지 번호가 작은것이 앞에 오도록
					return 1;
				else if(a.stage<b.stage)
					return -1;
				else
					return 0;
			}
		}
	};
	
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; 				//배열 answer 크기는 스테이지 개수와 같음
        List<Fail> fails=new ArrayList<Fail>(); //Fail타입으로 fails라는 리스트 선언
        int total= stages.length; 				//전체 사용자 수 = stage 배열의 크기와 같음
        
        //각 스테이지에 도달한 사용자 수 구하기
        int[]users=new int[N+1];
        for(int s:stages)		
        	users[s-1]++;						//1번스테이지에 도달한 사용자의 수는 user[0]에 저장됨
       
        //실패율
        for(int i=0; i<N; ++i) {
        	if(users[i]==0)
        		fails.add(new Fail(i+1,0));		//users[s-1]에서 1을 뺐으니까 stage번호를 다시 제대로하기 위해 1을 더해줌 		
        	else {
        		fails.add(new Fail(i+1, (double)users[i]/total));
        		total -=users[i]; 				//전체 사용자수에서 현재 스테이지에 머물고있는 사용자 수를 빼줌
        	}
        }
        
        Collections.sort(fails, comp); //실패율이 큰 순서대로 정렬
        for(int i=0; i<N; ++i)
        	answer[i]=fails.get(i).stage;
        	return answer;
    }
}
*/
public class Ex14 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
