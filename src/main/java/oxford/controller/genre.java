package oxford.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import oxford.model.Genre;
import oxford.repository.GenreRepository;

import javax.validation.Valid;

@Controller
public class genre {

    @Autowired
    private GenreRepository genreRepository;

    @RequestMapping(value = "/add/genre", method = RequestMethod.GET)
    private  String genre (Model model){
        model.addAttribute("genre",new Genre());
        return "forms/form_Genre";

    }


    @RequestMapping(value = "/add/genre", method = RequestMethod.POST)
    private String genreSaving (@Valid Genre genre, BindingResult result){
        if (result.hasErrors()){
            return "forms/form_Genre";
        }
        genreRepository.save(genre);
        return "index";

    }
}
