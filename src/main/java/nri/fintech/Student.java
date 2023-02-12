package nri.fintech;

public class Student {
	
	private String Name;
	private int  engMarks;
	private int hindiMarks;
	private int MathsMarks;
	
	public void avgmarks() {
		int total=engMarks+hindiMarks+MathsMarks;
		int avg=(engMarks+hindiMarks+MathsMarks)/3;
		System.out.println("Average Marks are: "+avg);
	}
	
	public void showMarks() {
		System.out.println("Marks of english are: "+engMarks);
		System.out.println("Marks of Maths are: "+MathsMarks);
		System.out.println("Marks of hindiMarks are: "+hindiMarks);

	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	public int getMathsMarks() {
		return MathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		MathsMarks = mathsMarks;
	}
	

}
