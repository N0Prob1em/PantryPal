package backend.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController()
@CrossOrigin
public class RecipeController {

    private final RecipeService service;

    @Autowired
    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/recipe/{id}")
    public ResponseEntity<Recipe> getRecipe(@PathVariable String id){
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
