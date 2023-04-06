package luv2code.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
		// ConstraintValidator.super.initialize(theCourseCode);
	}

	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		
		if (theCode != null)
			result = theCode.startsWith(coursePrefix);
		else{
			result = true;
			}
		
		return result;

	}
	
}
