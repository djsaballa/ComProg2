package practice2026;

public class ACT extends Student{
	private String program;
	
	ACT(String fn, String ln, String id, String program) {
		super(fn, ln, id);
		this.program = program;
	}
	
	public void studying() {
		System.out.println("studying computer hardware");
	}

	public void studying(int count) {
		for(int i = count; i > 0; i--) {
			System.out.println(i);
		}
	}
}
