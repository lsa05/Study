package Algorithm_Study;

public class Ex20 {

public static String solution(String X, String Y) {
        
	String answer = "";

    StringBuffer sb = new StringBuffer();

    int[] arrX = new int[10]; 				// [0 0 0 0 0 0 0 0 0 0]
    int[] arrY = new int[10];

    String XX[] = X.split("");
    String YY[] = Y.split("");

    for(String num : XX) { 					// 1 2 3 2 1
        arrX[Integer.parseInt(num)] ++ ;	//arrX[1]++;
    }    									//arrX[2]++;
        									//arrX[3]++;
        									//arrX[2]++;
        									//arrX[1]++; arrX = [0 2 2 1 0 0 0 0 0 0]       
    
    for(String num : YY) {					// 4 2 5 3 1
        arrY[Integer.parseInt(num)] ++ ;	// 			 arrY = [0 1 1 1 1 1 0 0 0 0]
    }
   
    for(int i = 9; i >= 0; i --) {	// 9~0
        int min = Math.min(arrX[i], arrY[i]);	//i=3 -> arrX[3]=1  arrY[3]=1 -> min=1 ... i=2, i=1 일때 두번째 for문 돌게됨
      
        for(int j=0; j<min; j++) {	// j=0

            sb.append(i);	    
        }
        
    }	

    answer = sb.toString();				

    if(answer.equals("")) {				
        return "-1";
    }

    if(answer.startsWith("0")) {		
        return "0";
    }

    return answer;

}          
	public static void main(String[] args) {
		 String X="5525";
		 String Y="1255";
		 System.out.println(solution(X,Y));
	}	    
}
