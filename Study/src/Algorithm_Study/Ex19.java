package Algorithm_Study;
//크레인 인형뽑기 게임
import java.util.Stack;
class Solution5{


    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();   
        
        for (int x : moves) {    //    1       5       3       5       1       2      1      4 
                                 //[i][j]
            int j = x - 1;       //[0][0], [0][4], [0][2], [0][4], [0][0], [0][1] [0][0] [0][3] 
            
            for (int i = 0; i < board.length; i++) {
                // 인형을 뽑을 경우
                if (board[i][j] > 0) {
                    // 뽑은 인형이 있고, 마지막 인형과 방금 뽑은 인형이 동일할 경우
                    if (!stack.isEmpty() && stack.peek() == board[i][j]) {
                        stack.pop();	//인형을 꺼낸다.
                        
                        answer += 2;	//꺼낼때 2개씩 제거
                    }
                    
                    // 아닐 경우
                    else
                    {
                        stack.push(board[i][j]);
                    }
                    
                    board[i][j] = 0;
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}

/*
j=x-1인 이유
int [][] board=[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
    [i][j]       [0][0]      [0][1]          [0][2]      [0][3]      [0][4]

moves=               1           2               3           4           5
             j=0->moves=1  j=1->moves=2

*/
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
