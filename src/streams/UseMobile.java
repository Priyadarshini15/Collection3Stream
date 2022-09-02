package streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class UseMobile {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile("Redmi","Snapdragon",128,"MI",true);
		Mobile m2= new Mobile("Oppo","Qualcomm",64,"AI",true);
		Mobile m3= new Mobile("Samsung","Intel",8,"AXC6",false);
		Mobile m4= new Mobile("Asus","Qualcomm",4,"RDF4",false);
		Mobile m5 =new Mobile("Vivo","Snapdragon",128,"DR54",true);
		
		ArrayList<Mobile> mobiles=new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
		mobiles.add(m5);
		
		/*Map<String,Mobile> m=mobiles.stream().collect(Collectors.toMap(i->i.getModel(), j->j));
		for(Mobile s:m.values()) {
			System.out.println(s);
		}*/
		
        mobiles.stream().filter(i->i.getBrand().contains("a")).filter(i->i.getRam()>4).map(i->i.getProcessor()).forEach(j->System.out.println(j));
                    
	}

}
