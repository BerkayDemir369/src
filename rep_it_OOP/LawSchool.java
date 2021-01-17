package rep_it_OOP;

public class LawSchool extends EducationalInstitution {

	
	@Override
	public String graduationRequirements() {

		return super.graduationRequirements()+ " and passing the bar";

	}

	public LawSchool() {
		// this.duration=3;
		super(3);

	}

}
