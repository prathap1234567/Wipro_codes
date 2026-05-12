package D3AssignmentQuestion2_Prathap_Kandasamy;

import java.util.*;
public class AssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        ArrayList<Integer> list = new ArrayList<>();
		        list.add(1);
		        list.add(2);
		        list.add(2);
		        list.add(4);
		        list.add(3);
		        list.add(3);
		        list.add(3);
		        list.add(4);
		        
		        Set<Integer> set = new HashSet<>(list);
		        for (int n : set) {
		            int count = 0;
		            for (int m : list) {
		                if (n == m) {
		                    count++;
		                }
		            }

		            System.out.print(n + "->" + count + " ");
		        }
		    }
		

	}


