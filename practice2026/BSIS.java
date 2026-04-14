package practice2026;

public class BSIS extends Student{
	private String program;
	
	BSIS(String fn, String ln, String id, String program) {
		super(fn, ln, id);
		this.program = program;
	}
	
	public void programming() {
		System.out.println("Hellow World;");
	}
	 	
	public void studying() {
		System.out.println("studying programming");
	}	

}
