package JavaGenerics.PersonalizedMealPlanGenerator;
//class Vegan Meal implements the properties of MealPlan
public class VeganMeal implements MealPlan{
    @Override
    //Method to print the vegan meal details
    public void showMeal(){
        System.out.println("Vegan meal is: sweet potato, lentil dhal, matar paneer");
    }
}
