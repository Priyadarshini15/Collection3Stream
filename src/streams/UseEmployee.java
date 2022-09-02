package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee("Priya",23,20000,false);
		Employee e2=new Employee("Naga",26,10000,false);
		Employee e3=new Employee("Ram",23,35890,true);
		Employee e4=new Employee("Jeffrey",35,46000,true);
		Employee e5=new Employee("Ravi",27,56789,true);
		
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		/*List<Employee>maleEmployees=employees.stream().filter(x->x.isMale()==true).collect(Collectors.toList());
		maleEmployees.forEach(y->System.out.println(y));*/
		
		/*List<Integer> ages=employees.stream().map(a->a.getAge()).collect(Collectors.toList());
		for(Integer n:ages) {
			System.out.println(n);
		}*/
		
		employees.stream().filter(p->p.getSalary()>25000).map(p->p.getName()).forEach(h->System.out.println(h));
		
		/*List<String>names=employees.stream().filter(p->p.getSalary()>25000).map(p->p.getName()).collect(Collectors.toList());
		  for(String s: names) {
			  System.out.println(s);*/
		 // }
		  
		 long a = employees.stream().filter(p->p.getSalary()>25000).map(p->p.getName()).count();
		 System.out.println(a);
		 
		
   }
	
}

	


