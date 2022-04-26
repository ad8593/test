import java.util.ArrayList;
import java.util.List;
  
public class Composite implements Component
{
    private List<Component> recipeList = new ArrayList<Component>();

    public void showRecipeDetails() 
    {
        // for(Recipe emp:recipeList)
//         {
//             emp.showRecipeDetails();
//         }
    }
       
    public void addRecipe(Recipe emp)
    {
        recipeList.add(emp);
    }
       
    public void removeRecipe(Recipe emp)
    {
        recipeList.remove(emp);
    }
}


// The composite