package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService service) {
        this.recipeService = service;
    }

    @RequestMapping({"/recipe/show/{id}"})
    public String getShowPage(@PathVariable String id, Model model){
        model.addAttribute("recipe", recipeService.findById(Long.parseLong(id)));
        return "recipe/show";
    }
}
