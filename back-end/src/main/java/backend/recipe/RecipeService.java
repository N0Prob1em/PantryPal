package backend.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository repository;
    @Autowired
    public RecipeService(RecipeRepository repository) {
        this.repository = repository;
    }


    public List<Recipe> saveAll(List<Recipe> recipeList){
        return (List<Recipe>) repository.saveAll(recipeList);
    }

    public List<Recipe> getAll() {
        return (List<Recipe>) repository.findAll();
    }
}
