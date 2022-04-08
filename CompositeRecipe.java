import java.util.ArrayList;
import java.util.List;
  
public class CompositeRecipe implements ComponentRecipe
{
    private List<ComponentRecipe> recipeList = new ArrayList<ComponentRecipe>();

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