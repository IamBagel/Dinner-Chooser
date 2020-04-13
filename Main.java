import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Recipe> RECIPES = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcome to the Recipe choosing application.");
        Choice();

        while(true) {
            System.out.println("Would you like to go again: Y/N?");
            if(scanner.nextLine().equalsIgnoreCase("Y")) {
                Choice();
            }
            else{
                System.exit(0);
            }
        }
    }
    public static void AddRecipe() {

        String recipe_name;
        int number_ingredients;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please name the new recipe");
        recipe_name = scanner.nextLine();
        System.out.println("Please enter the number of ingredients");
        number_ingredients = scanner.nextInt();
        List<String> ingredient_list = new ArrayList<>();
        scanner.nextLine();//eat up the extra line

        for (int i = 0; i < number_ingredients; i++) {
            System.out.println("Enter ingredient " + (i + 1));
            ingredient_list.add(scanner.nextLine());
        }

        Recipe initial_recipe = new Recipe(recipe_name, number_ingredients, ingredient_list);
        RECIPES.add(initial_recipe);
    }
    public static void Choice(){
        System.out.println("What would you like to do?");
        System.out.println("Please select from the following options: ");
        System.out.println("1 - Add a recipe");
        System.out.println("2 - Choose a recipe for me!");
        System.out.println("3 - Print list of recipes");
        System.out.println("0 - Exit the system");
        Scanner scanner = new Scanner(System.in);
        int user_choice = scanner.nextInt();

        switch(user_choice){
            case 1:
                AddRecipe();
                break;
            case 2:
                ChooseRecipe();
                break;
            case 3:
                PrintList();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Error: Input not recognized. Please try again\n\n");
                break;
        }


    }

    private static void PrintList() {
        System.out.println("Here's a list of your current recipes");
        System.out.println(RECIPES);
    }

    private static void ChooseRecipe() {
        //TODO Implement this method
    }
}
