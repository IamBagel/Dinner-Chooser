import java.util.List;

public class Recipe {
    String recipe_name;
    int number_ingredients;
    List<String> ingredient_list;

    public Recipe(String recipe_name, int number_ingredients, List<String> ingredient_list) {
        this.recipe_name = recipe_name;
        this.number_ingredients = number_ingredients;
        this.ingredient_list = ingredient_list;
    }

    @Override
    public String toString() {
        return  recipe_name + ':' +
                " number of ingredients=" + number_ingredients +
                " ingredient list=" + ingredient_list +
                '}';
    }
}
