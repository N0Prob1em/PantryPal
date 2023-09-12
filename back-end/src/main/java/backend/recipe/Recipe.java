package backend.recipe;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Recipe {

    @Id
    String id;
    String name;
    String origin;
    String category;
    @Lob @Basic(fetch = LAZY)
    String instruction;
    String thumbnail;
    String tags;
    String ingredient1;
    String ingredient2;
    String ingredient3;
    String ingredient4;
    String ingredient5;
    String ingredient6;
    String ingredient7;
    String ingredient8;
    String ingredient9;
    String ingredient10;
    String ingredient11;
    String ingredient12;
    String ingredient13;
    String ingredient14;
    String ingredient15;
    String ingredient16;
    String ingredient17;
    String ingredient18;
    String ingredient19;
    String ingredient20;
    String measure1;
    String measure2;
    String measure3;
    String measure4;
    String measure5;
    String measure6;
    String measure7;
    String measure8;
    String measure9;
    String measure10;
    String measure11;
    String measure12;
    String measure13;
    String measure14;
    String measure15;
    String measure16;
    String measure17;
    String measure18;
    String measure19;
    String measure20;
    String source;

    public Recipe() {}

    public Recipe(RecipeDTO dto){
        id = dto.idMeal();
        name = dto.strMeal();
        origin = dto.strArea();
        category = dto.strCategory();
        instruction = dto.strInstructions();
        thumbnail = dto.strMealThumb();
        tags = dto.strTags();
        ingredient1 = dto.strIngredient1();
        ingredient2 = dto.strIngredient2();
        ingredient3 = dto.strIngredient3();
        ingredient4 = dto.strIngredient4();
        ingredient5 = dto.strIngredient5();
        ingredient6 = dto.strIngredient6();
        ingredient7 = dto.strIngredient7();
        ingredient8 = dto.strIngredient8();
        ingredient9 = dto.strIngredient9();
        ingredient10 = dto.strIngredient10();
        ingredient11 = dto.strIngredient11();
        ingredient12 = dto.strIngredient12();
        ingredient13 = dto.strIngredient13();
        ingredient14 = dto.strIngredient14();
        ingredient15 = dto.strIngredient15();
        ingredient16 = dto.strIngredient16();
        ingredient17 = dto.strIngredient17();
        ingredient18 = dto.strIngredient18();
        ingredient19 = dto.strIngredient19();
        ingredient20 = dto.strIngredient20();
        measure1 = dto.strMeasure1();
        measure2 = dto.strMeasure2();
        measure3 = dto.strMeasure3();
        measure4 = dto.strMeasure4();
        measure5 = dto.strMeasure5();
        measure6 = dto.strMeasure6();
        measure7 = dto.strMeasure7();
        measure8 = dto.strMeasure8();
        measure9 = dto.strMeasure9();
        measure10 = dto.strMeasure10();
        measure11 = dto.strMeasure11();
        measure12 = dto.strMeasure12();
        measure13 = dto.strMeasure13();
        measure14 = dto.strMeasure14();
        measure15 = dto.strMeasure15();
        measure16 = dto.strMeasure16();
        measure17 = dto.strMeasure17();
        measure18 = dto.strMeasure18();
        measure19 = dto.strMeasure19();
        measure20 = dto.strMeasure20();
        source = dto.strSource();
    }
}

