package javahomework;
public class sheep extends Animal{
	public String name;
	private String head;
	private String foot;
	public sheep(String name){
		this.name=name;
		super.name=name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((sheep)obj).name))
			return true;
		else return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
