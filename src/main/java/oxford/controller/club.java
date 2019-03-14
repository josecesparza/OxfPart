package oxford.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import oxford.model.Club;
import oxford.repository.ClubRepostiory;

import javax.validation.Valid;

@Controller
public class club {
    @Autowired
    private ClubRepostiory clubRepostiory;

    @RequestMapping(value = "/add/club", method = RequestMethod.GET)
    public String club(Model model) {
        model.addAttribute("club", new Club());
        return "forms/form_Club";
    }

    @RequestMapping(value = "/add/club", method = RequestMethod.POST)
    public String clubSaving(@Valid Club club, BindingResult result) {
        if (result.hasErrors()) {
            return "forms/form_Club";
        }

        clubRepostiory.save(club);
        return "index";
    }
}
