package streams;

public class Developer {
	private String name;
	private String role;
	private int experience;
	private boolean isJavaDeveloper;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
		
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}
	public void setExperience(int experience) {
		this.experience=experience;
		
	}
	public int getExperience() {
		return experience;
	}
	public void setIsJavaDeveloper(boolean isJavaDeveloper) {
		this.isJavaDeveloper=isJavaDeveloper;
	}
	public boolean getIsJavaDeveloper() {
		return isJavaDeveloper;
	}
	public Developer(String name,String role,int experience,boolean isJavaDeveloper) {
		this.name=name;
		this.role=role;
		this.experience=experience;
		this.isJavaDeveloper=isJavaDeveloper;
	}
	
	public String toString() {
		return "name= "+ name+", role= "+role+", experience= "+experience+", isJavaDeveloper= "+isJavaDeveloper;
	}
	
	

}
