package Algorithm_Study;
//체육복
/*
점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

제한사항
전체 학생의 수는 2명 이상 30명 이하입니다.
체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 */
import java.util.Arrays;

public class Ex17 {

    public static int solution(int n, int[] lost, int[] reserve) {
    				//전체 학생수 //잃어버린 사람 배열 //여벌 가지고 온 배열
    	
    	//ex ) n=5 -> lost [1,3], reserve[1,2] -> [1,2,3,4,5] 	//잃어버린사람 = 여벌가지고온 사람 
    	//ex)  n=5 -> lost [2,4]  reserve[3]  -> [1,2,3,5] or [1,2,4,5]
    	//정렬 해줘야 함(13,18번 test 실패)
 
        Arrays.sort(lost);
        Arrays.sort(reserve);
    	
        int answer = 0; //수업듣을 수 있는 사람 수
        int borrow = 0;	//체육복 빌린 사람 수
        
        //여벌 옷 가지고 온 사람이 도난 당한 경우
        for(int i=0; i<lost.length; i++) { 	//[1,3]
        	for(int j=0; j<reserve.length; j++) { //[1,2]
        		if(lost[i]==reserve[j]) {	//잃어버린 사람 = 여벌가지고온 사람
        			lost[i]=reserve[j]=-5;	// 다음 for문에서 빌려주거나 빌릴수 없도록
        			borrow++; //자기 체육복  자기가 입어서 수업 들을 수 있음
        			break;	
        		}	
        	}
        }
        //앞 뒤 잃어버린 사람 빌려주는 경우
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1) { //도난당한 사람 앞 뒤에 여유분이 있을 때
        			lost[i]=reserve[j]=-5;	 //앞에 빌려주고 뒤에 또 빌려주면 안되니까 해당값을 -5로 만들어서 lost[i]의 값과 같은경우가 없도록.. lost[i]가 -5이면 reserve[j]는 -4나 -6이 되어야....
        			borrow++;
        			break; //한번 빌려주면 for문 나가도록
        		}
        	}
        	

        }
        return answer = n-lost.length + borrow; //(수업들을 수 있는 최대 인원 = 전체인원 - 도난당한 사람 수 + 빌린사람 수  )
        // 5-2+2=5  
        // 5-2+1=4
    }
    
    
public static void main(String[] args) {	
	int n=5;
	int [] lost= {4,2};
	int [] reserve= {3,5};
	System.out.println(solution(n, lost, reserve));
}


	
}
/*
import java.util.HashSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashSet<Integer> resSet = new HashSet<>();
        HashSet<Integer> loSet = new HashSet<>();

        for(int i: reserve) {
            resSet.add(i);
        }

        for(int i: lost) {
            if(resSet.contains(i)) {
                resSet.remove(i);
            }
            else {
                loSet.add(i);
            }
        }

        for(int i: resSet) {
            if(loSet.contains(i-1)) {
                loSet.remove(i - 1);
            }
            else if(loSet.contains(i+1)) {
                loSet.remove(i + 1);
            }
        }   

        answer = n - loSet.size();

        return answer;
    }
}
*/