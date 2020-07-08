package Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//Comparator short syntax
/*PriorityQueue<Student> pq = new PriorityQueue<(
    Comparator.comparing(Student::getCgpa).reversed()
    .thenComparing(Student::getFname)
    .thenComparing(Student::getToken)
    );*/

public class Priorities{
	
public List<Student> getStudents(List<String> events){
	PriorityQueue<Student> pq=new PriorityQueue<Student>(new Checker());
	ArrayList<Student> alist=new ArrayList<Student>();
	for(int i=0;i<events.size();i++)
	{
		if(events.get(i).contains("ENTER"))	  
		{   
			String[] e=events.get(i).split(" ");
			Student st=new Student(Integer.valueOf(e[3]),e[1],Double.valueOf(e[2]));
			pq.add(st);
		}
		else if(events.get(i).contains("SERVED"))
		{
			pq.poll();
		}
	}
     Student first=pq.poll();
     if(first==null) {
    	 return alist;
     }
     else
     {
    	 while(first!=null)
    	 {
    		 alist.add(first);
    		 first=pq.poll();
    	 }
     }
     return alist;
}

public class Checker implements Comparator<Student>{

@Override
public int compare(Student s1, Student s2) {
	double epsilon=0.001;
	if(Math.abs(s1.getCGPA()-s2.getCGPA())>epsilon)
	{
		return (s1.getCGPA()>s2.getCGPA()) ?-1 : +1;
	}
	else if(!s1.getName().equals(s2.getName()))
	{
		return s1.getName().compareTo(s2.getName());
	}
	else
	{
		return s1.getID()-s2.getID();
	}		
	
}

}
}
