package me.yling.w3challenge.controllers;

import me.yling.w3challenge.models.Education;
import me.yling.w3challenge.models.Experience;
import me.yling.w3challenge.models.Person;
import me.yling.w3challenge.models.Skills;
import me.yling.w3challenge.repositories.EducationRepo;
import me.yling.w3challenge.repositories.ExperienceRepo;
import me.yling.w3challenge.repositories.PersonRepo;
import me.yling.w3challenge.repositories.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController
{
    @Autowired
    PersonRepo personRepo;
    @Autowired
    EducationRepo educationRepo;
    @Autowired
    ExperienceRepo experienceRepo;
    @Autowired
    SkillsRepo skillsRepo;

    //for user to input personal information
    @GetMapping("/")
    public String addPerson(Model model)
    {
        model.addAttribute("newPerson", new Person());
        model.addAttribute("addpersonmessage", "Welcome to Robo Resume!" +
                "Enter your name to start:");
        return "addperson";
    }

    //save inputted user info in database
    @PostMapping ("/addperson")
    public String postPerson(@ModelAttribute ("newPerson")Person person)
    {
        personRepo.save(person);
        return "result";
    }


    //create index page for edu, exp, skills
    @GetMapping("/index")
    public String showIndex(Model model)
    {
        model.addAttribute("indexmessage","Create your resume");
        return "index";
    }


    //for user to input their education info
    @GetMapping("/addedu")
    public String addEdu(Model model)
    {
        model.addAttribute("newEdu", new Education());
        model.addAttribute("addedumessage", "Add your education here");
        return "addedu";
    }

    //save edu info in database
    @PostMapping ("/addedu")
    public String postEdu(@ModelAttribute ("newEdu")Education education)
    {
        educationRepo.save(education);
        return "resultedu";
    }

    //for user to input their work experience info
    @GetMapping("/addexp")
    public String addExp(Model model)
    {
        model.addAttribute("newExp", new Experience());
        model.addAttribute("addexpmessage", "Add your work experience here");
        return "addexp";
    }

    //save work experience info in database
    @PostMapping ("/addexp")
    public String postExp(@ModelAttribute ("newExp")Experience experience)
    {
        experienceRepo.save(experience);
        return "resultexp";
    }


    //for user to input their skills info
    @GetMapping("/addski")
    public String addSki(Model model)
    {
        model.addAttribute("newSki", new Skills());
        model.addAttribute("addskimessage", "Add your skills here");
        return "addski";
    }

    //save skills info in database
    @PostMapping ("/addski")
    public String postSki(@ModelAttribute ("newSki")Skills skills)
    {
        skillsRepo.save(skills);
        return "resultski";
    }

    //retrieve all information from database and display them
    @GetMapping("/listresume")
    public String listPerson(Model model)
    {
        Iterable<Person> personList = personRepo.findAll();
        model.addAttribute("persons", personList);
        Iterable<Education> educationList = educationRepo.findAll();
        model.addAttribute("edus", educationList);
        Iterable<Experience> experienceList = experienceRepo.findAll();
        model.addAttribute("exps", experienceList);
        Iterable<Skills> skillsList = skillsRepo.findAll();
        model.addAttribute("skis", skillsList);
        return "listresume";
    }


}
