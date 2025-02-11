package JavaGenerics.PersonalizedMealPlanGenerator;
//class vegetarian Meal implements the properties of MealPlan
public class VegetarianMeal implements MealPlan{
    @Override
    //Method to print the vegetarian meal details
    public void showMeal(){
        System.out.println("Vegetarian meal is: Fruits, vegetables, Milk");
    }
}
