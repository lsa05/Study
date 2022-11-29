package Algorithm_Study;


import java.util.Arrays;
import java.util.HashMap;

// 완주하지 못한 선수
/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 */


class Solution4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (String runner : participant) {
        	map.put(runner, map.getOrDefault(runner, 0) + 1); //getOrDefault(runner, 0) : runner라는 key를 찾으면 해당 value값을 반환 그렇지 않으면 디폴트값 0을 반환 
              //put(key,      value) : 지정된 key와 value값을 Hashmap에 저장
        }
        for (String runner : completion) {
        	map.put(runner, map.get(runner) - 1);	//completion의 명단이 HashMap에 key 값에 존재하면 value에 -1 해 줍니다.
        }										 	//완주자들의 value를 -1씩 넣음
        											//동일한 key가 있을 시 value가 0 (참가자=완주자)

        for (String key : map.keySet()) { //keySet() : key값(참가자)을 반환
            if (map.get(key) != 0) { //key의 value값이 0이 아닌사람 = 완주하지 못한 사람
            	return key;
            }
        }
        return answer;
        
    }
}

/* map.getOrDefault(runner, 0)를 쓰는 이유 
	HashMap의 경우 동일 key값을 추가할 경우 value값이 덮어쓰기가 됨
	따라서 기존 key값의 value를 계속사용하고 싶을 경우, 즉 동명이인이 생길 경우 사용
	
	map에 put할 때, map(getOrDefault(runner, 0)을 사용하여 이미 map에 있는 참가자인지 확인
	- 등록되지 않은 참가자라면 default값이 0이 반환, 최종적으로 map.put(runner, 1)이 실행
	- 이미 등록된 참가라(동명이인 존재)라면 해당 참가자key에 해당하는 value값 1이 리턴, 최종적으로 map.put(runner, 2)이 실행 
 
*/

//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        ArrayList<String> part = new ArrayList<String>(Arrays.asList(participant));     //ArrayList를 사용하기위한 participant의 인수를 가진 part선언
//        ArrayList<String> comp = new ArrayList<String>(Arrays.asList(completion));
//        
//        part.removeAll(comp); //차집합 구하기-ArrayList.removeAll(Collection<?> c)은 인자로 Collection을 받음. 이 Collection이 포함하고 있는 객체를 리스트에서 삭제
//  
//        for(String a : part)	//배열요소를 a에 저장하여	
//        	answer=a;			//a 출력
//        return answer;
//    }
//}

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
