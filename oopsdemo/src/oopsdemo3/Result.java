package oopsdemo3;

public class Result extends Candidate implements Exam {

	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		
	}

	@Override
	public void percent_cal() {
		
		int total=(mark1+mark2);
        float percent=total*100/200;
        System.out.println ("Percentage: "+percent+"%");
        
	}

}
