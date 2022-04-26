public class AllTheFood
{
    public GFoodMenu getGFoodMenu()
    {
        GoodFood v = new GoodFood();
        GFoodMenu vegMenu = (GFoodMenu)v.getMenus();
        return vegMenu;
    }
      
    public Both getVegNonMenu()
    {
        MediumFood v = new MediumFood();
        Both bothMenu = (Both)v.getMenus();
        return bothMenu;
    }    
}