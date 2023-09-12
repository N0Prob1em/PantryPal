package backend.recipe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService service;


    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping
    public ResponseEntity<Recipe> getRecipe(@RequestParam String id){
        return ResponseEntity.ok(service.getRecipe(id));
    }


    /*@PostMapping
    public ResponseEntity<Recipe> save(Recipe recipe){
        try {
            Recipe created = service.saveRecipe(recipe)
        }
        return ResponseEntity.created(URI.create("/recipe/" +));
    }*/


}
