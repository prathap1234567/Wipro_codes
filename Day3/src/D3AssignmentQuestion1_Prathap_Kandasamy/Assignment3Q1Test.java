package D3AssignmentQuestion1_Prathap_Kandasamy;
import java.util.*;
public class Assignment3Q1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        List<Assignment3Q1> list = new ArrayList<>();
		        Assignment3Q1 m1 = new Assignment3Q1(6);
		        Assignment3Q1 m2 = new Assignment3Q1(4);
		        Assignment3Q1 m3 = new Assignment3Q1(5);
		        list.add(m1);
		        list.add(m2);
		        list.add(m3);

		        for (Assignment3Q1 ans : list) {
		            System.out.print(ans.addmul()+" ");
		        }
		    }
		

	}


