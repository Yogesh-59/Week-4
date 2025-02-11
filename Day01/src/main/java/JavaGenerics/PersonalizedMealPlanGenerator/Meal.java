package JavaGenerics.PersonalizedMealPlanGenerator;


//A generic class Meal<T extends MealPlan> to handle different meal plans.
public class Meal<T extends MealPlan> {
    //Creating the instance of class
    public T mealName;
    //using constructor to initialize the instance
     Meal(T mealName){
         this.mealName=mealName;
     }
        //Method to generate the meal plans
         public void generateMealPlan(){
             mealName.showMeal();
         }

}
