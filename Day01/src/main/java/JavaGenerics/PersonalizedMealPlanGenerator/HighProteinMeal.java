package JavaGenerics.PersonalizedMealPlanGenerator;
//class High Protein Meal implements the properties of MealPlan
public class HighProteinMeal implements MealPlan{
    @Override
    //Method to print the High protein meal details
    public void showMeal(){
        System.out.println("High Protein meal is : Paneer, Fish, Beef");
    }
}
