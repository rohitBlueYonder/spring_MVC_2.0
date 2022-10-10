package org.spring.mvc.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HeadTOHeadConstraintValidator implements ConstraintValidator<HeadToHead,String> {

    @Override
    public void initialize(HeadToHead headToHeadScore){}

    @Override
    public boolean isValid(String headToHeadScore, ConstraintValidatorContext constraintValidatorContext){
        if(headToHeadScore==null)
            return false;
        boolean result=headToHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
        return result;
    }
}
