package org.spring.mvc.Controller;

import org.spring.mvc.Model.Athlete;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/athlete")
public class AthleteController {

    @RequestMapping("/showAthleteForm")
    public String showAthlete(Model model){
        model.addAttribute("athlete",new Athlete());
        return "athlete-form";
    }

    @RequestMapping("/showAthleteDetails")
    public String showAthlete(@Valid @ModelAttribute("athlete")Athlete myAthlete, BindingResult result){
        System.out.println(myAthlete);
        if(result.hasErrors()){
//            System.out.println(result);
            return "athlete-form";
        }
        return "athlete-details";
    }

    @InitBinder
    public void inItBinder(WebDataBinder binder){
        StringTrimmerEditor editor=new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,editor);
    }//InitBinder is mapped to BindingResult in showAthleteDetails Method


}
