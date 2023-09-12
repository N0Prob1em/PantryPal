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


    public void saveAll(List<Recipe> recipeList){
        repository.saveAll(recipeList);
    }

    public List<Recipe> getAll() {
        return (List<Recipe>) repository.findAll();
    }

    public Recipe getRecipe(String id) {
        return repository.findById(id).orElseThrow();
    }

    public boolean checkData(String id) {
        return repository.existsById(id);
    }
}
