package JavaGenerics.PersonalizedMealPlanGenerator;
//class keto Meal implements the properties of MealPlan
public class KetoMeal implements MealPlan{
    @Override
    //Method to print the keto meal details
    public void showMeal(){
        System.out.println("Keto Meal is : Peanut butter chicken curry, Pork souvlaki, Egg foo yung");
    }
}
