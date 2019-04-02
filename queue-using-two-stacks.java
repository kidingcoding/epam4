import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        int t=s.nextInt();
        while(t!=0){
            int n=s.nextInt();
            if(n==1){
                int d=s.nextInt();
                s1.push(d);
            }
            if(n==2){
                if(s2.empty())
                while(!s1.empty()){
                    s2.push((s1.pop()));
                }
                s2.pop();
                
            }
            if(n==3){
                if(s2.empty())
                while(!s1.empty()){
                    s2.push((s1.pop()));
                }
                System.out.println(s2.peek());
            }
        }
        t=t-1;
    }
}

