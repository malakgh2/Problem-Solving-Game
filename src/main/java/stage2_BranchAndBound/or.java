/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stage2_BranchAndBound;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class or {
    static int max(int a, int b) 
    { 
          return (a > b) ? a : b; 
    }
  

    static int Urneor(int W, ArrayList<Integer> wt,  int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
  
        for (i = 0; i <= n; i++) 
        {
            for (w = 0; w <= W; w++) 
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt.get(i-1) <= w)
                    K[i][w]
                        = max(wt.get(i-1)+ K[i - 1][w - wt.get(i - 1)],
                         K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
  
        return K[n][W];
    }
    
     public static int max(ArrayList<Integer> T)
    {
        int max = 0;
        for (int x:T) {
            if(x>max)
                max=x;
        }
        
        return max;
    }
    
}
