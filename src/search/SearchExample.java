package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchExample {
	
	public static class Student {
		public String name;
		public double gradePointAverage;
		
		public Student (String name, double gradePointAverage) {
			this.name = name;
			this.gradePointAverage = gradePointAverage;
		}
	}
	
	private static final Comparator<Student> compGPA = (a,b) -> {
		if (a.gradePointAverage != b.gradePointAverage) {
			return Double.compare(b.gradePointAverage, a.gradePointAverage);
		}
		return a.name.compareTo(b.name);
	};
	
	static class Sortbygpa implements Comparator<Student> 
	{ 
	    public int compare(Student a, Student b) 
	    { 
	    	if (a.gradePointAverage != b.gradePointAverage) {
	           return Double.compare(b.gradePointAverage , a.gradePointAverage);
	    	}
	    	return a.name.compareTo(b.name);
	    } 
	} 
	
	public static boolean searchStudent(List<Student> students, Student target, Comparator<Student> compGPA) {
//		return Collections.binarySearch(students,  target, compGPA) >= 0;
		return Collections.binarySearch(students,  target, new Sortbygpa()) >= 0;

	}
	
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList();
		Student daniel = new Student("Daniel", 4.00);
		Student eliana = new Student("Eliana", 3.99);
		Student michaela = new Student("Michaela", 3.98);
		Student david = new Student("David", 3.97);
		Student avraham = new Student("Avraham", 3.97);
		students.add(daniel);
		students.add(eliana);
		students.add(michaela);
		students.add(david);
		students.add(avraham);
		
		Collections.sort(students, compGPA);
		
		students.forEach(x -> System.out.println(x.name));
		
		boolean found = searchStudent(students, david, compGPA );
		System.out.println(found);
	}

}
