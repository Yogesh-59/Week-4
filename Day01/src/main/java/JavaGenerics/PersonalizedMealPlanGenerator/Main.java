package JavaGenerics.PersonalizedMealPlanGenerator;

public class Main {
    public static void main(String[] args) {
        //Make the generic class object and pass the class vegetarian Meal
        Meal<VegetarianMeal> vegetarian=new Meal<>(new VegetarianMeal());
        vegetarian.generateMealPlan();

        //Make the generic class object and pass the class vegan Meal
        Meal<VeganMeal> vegan=new Meal<>(new VeganMeal());
        vegan.generateMealPlan();

        //Make the generic class object and pass the class Keto Meal
        Meal<KetoMeal> keto=new Meal<>(new KetoMeal());
        keto.generateMealPlan();

        //Make the generic class object and pass the class High Protein Meal
        Meal<HighProteinMeal> highProteinMeal=new Meal<>(new HighProteinMeal());
        highProteinMeal.generateMealPlan();
    }
}
