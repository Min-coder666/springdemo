package com.min;

import com.min.bean.Song;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;


public class SongValidationTest {

    public static void main(String[] args) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        Validator validator1 = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast", "true").
                        buildValidatorFactory().getValidator();
        Song song = new Song("","");
        Set<ConstraintViolation<Song>> set = validator.validate(song);
        set.forEach(
                p-> System.out.println(p.getPropertyPath()+"\t"+p.getMessage())
        );

    }
}
