package lamdasort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting2 {
	
	public void sorting2(){
		List<Sorting> employees = new ArrayList<>();
		employees.add(new Sorting("harsha", "Ande", "24", "6000"));
		employees.add(new Sorting("Anvesh", "Ambadi", "23", "5900"));
		employees.add(new Sorting("Jeevan", "Sandra", "25", "6200"));
		
	//	ArrayList<Sorting> employees2 = (ArrayList<Sorting>) employees.clone();
		
	//	Collections.sort(employees, new Comparator<Sorting>(){
		Comparator<Sorting> e1 = new Comparator<Sorting>(){
			
			public int compare(Sorting s1, Sorting s2){
			    return s1.firstName.compareTo(s2.firstName);
			  }
		};	
		Collections.sort(employees, e1);
		System.out.println(employees);
		
		
		Comparator<Sorting> e2 = (Sorting s1, Sorting s2) -> s1.firstName.compareTo(s2.firstName);
		Collections.sort(employees, e2);
		System.out.println(employees);
		
		Comparator<Sorting> e3 = (Sorting s1, Sorting s2) -> s1.lastName.compareTo(s2.lastName);
		Collections.sort(employees, e3);
		System.out.println(employees);
		
		Comparator<Sorting> e4 = (Sorting s1, Sorting s2) -> s1.age.compareTo(s2.age);
		Collections.sort(employees, e4);
		System.out.println(employees);
		Comparator<Sorting> e5 = (Sorting s1, Sorting s2) -> s1.salary.compareTo(s2.salary);
		Collections.sort(employees, e5);
		System.out.println(employees); 
		}
	
}
