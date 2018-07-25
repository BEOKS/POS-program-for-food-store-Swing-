import java.util.Scanner;

public class Solution {
    public static int solution(int n){
        if(n%2==1)  return 0;
        else{
            if(n==2)    return 3;
            else if(n==4)   return 11;
            else{
                int answer=11;
                while(n>=6){
                    answer=answer*3+2;
                    n-=2;
                }
                return  answer;
            }
        }
    }
    public static void main(String[] args){
        System.out.print(solution(8));
    }
}
