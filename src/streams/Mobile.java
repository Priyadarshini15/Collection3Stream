package streams;

public class Mobile {
	private String brand;
	private String processor;
	private int ram;
	private String model;
	private boolean isAndroid;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}
	public void setIsAndroid(boolean isAndroid) {
		this.isAndroid = isAndroid;
	}
	public Mobile(String brand,String processor,int ram,String model,boolean isAndroid) {
		this.brand=brand;
		this.processor=processor;
		this.ram=ram;
		this.model=model;
		this.isAndroid=isAndroid;
	}
	public String toString() {
		return"Brand= "+brand+", Processor= "+processor+", Ram= "+ram+", Model= "+model+", IsAndroid= "+isAndroid;
	}

}
