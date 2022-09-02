package streams;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseDeveloper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1=new Developer("Priya","Backend Developer",3,true);
		Developer d2=new Developer("Ravi","Frontend Developer",2,true);
		Developer d3=new Developer("Deepak","Tester",3,false);
		Developer d4=new Developer("Ram","Frontend Developer",5,true);
		Developer d5=new Developer("Pavi","HR",2,false);
		
		HashMap<String ,Developer> details=new HashMap<>();
		details.put(d1.getName(), d1);
		details.put(d2.getName(), d2);
		details.put(d3.getName(), d3);
		details.put(d4.getName(), d4);
		details.put(d5.getName(), d5);
		
		/*List<String> name=details.values().stream().filter(x->x.getIsJavaDeveloper()==true).map(x->x.getName()).collect(Collectors.toList());
		for(String s: name) {
			System.out.println(s);
		}*/
		
		/*List<String> name=details.keySet().stream().filter(x->details.get(x).getIsJavaDeveloper()==true).map(x->details.get(x).getName()).collect(Collectors.toList());
		for(String s: name) {
			System.out.println(s);
		}*/
		
		Map<String,Developer> names=details.values().stream().filter(x->x.getRole().equals("Frontend Developer")).collect(Collectors.toMap(i->i.getName(),j->j));
		for(Developer d:names.values()) {
			System.out.println(d);
		}
		

	}

}
