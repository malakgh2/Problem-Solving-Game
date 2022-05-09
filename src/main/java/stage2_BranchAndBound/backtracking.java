/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stage2_BranchAndBound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class backtracking {
    
    static ArrayList<ArrayList<Integer> >
	    combinationSum(ArrayList<Integer> arr, int sum)
	    {
	        ArrayList<ArrayList<Integer> > ans
	            = new ArrayList<>();
	        ArrayList<Integer> temp = new ArrayList<>();
	 
	        // first do hashing since hashset does not always
	        // sort
	        //  removing the duplicates using HashSet and
	        // Sorting the arrayList
	 
	        Set<Integer> set = new HashSet<>(arr);
	        arr.clear();
	        arr.addAll(set);
	        Collections.sort(arr);
	 
	        findNumbers(ans, arr, sum, 0, temp);
	        return ans;
	    }
	 
	    static void   findNumbers(ArrayList<ArrayList<Integer> > ans,
	                ArrayList<Integer> arr, int sum, int index,
	                ArrayList<Integer> temp)
	    {
	 
	        if (sum == 0) {
	 
	            // Adding deep copy of list to ans
	 
	            ans.add(new ArrayList<>(temp));
	            return;
	        }
	 
	        for (int i = index; i < arr.size(); i++) {
	 
	            // checking that sum does not become negative
	 
	            if ((sum - arr.get(i)) >= 0) {
	 
	                // adding element which can contribute to
	                // sum
                        if(!temp.contains(arr.get(i)))
                        {
	                temp.add(arr.get(i));
	 
	                findNumbers(ans, arr, sum - arr.get(i), i,
	                            temp);
	 
	                // removing element from list (backtracking)
	                temp.remove(arr.get(i));
                        }
	            }
	        }
	    }
	 
	    // Driver Code
	 
    
}
