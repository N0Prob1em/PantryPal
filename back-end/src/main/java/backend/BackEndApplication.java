package backend;

import backend.recipe.Recipe;
import backend.recipe.RecipeDTO;
import backend.recipe.RecipeService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RecipeService service){
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<RecipeDTO>> typeReference = new TypeReference<>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/recipes.json");
			try {
				if (service.checkData("52768")){
					List<RecipeDTO> recipeDTOS = mapper.readValue(inputStream, typeReference);

					List<Recipe> recipes = new ArrayList<>();
					for (RecipeDTO dto : recipeDTOS) {
						recipes.add(new Recipe(dto));
					}

					service.saveAll(recipes);
					System.out.println("Database seeded with json file");
				}
			} catch (IOException e) {
				System.out.println("Unable to seed database " + e.getMessage());
			}
		};
	}
}
