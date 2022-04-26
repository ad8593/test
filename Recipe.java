class Recipe implements Component {

    private String name;
    private String flname;
    private int flcount;
      
    public Recipe(String name, String flname, int flcount)
    {
        this.name = name;
        this.flname = flname;
        this.flcount = flcount;
    }
      
    public void showRecipeDetails() 
    {
        // take from the file and display 
    }
}

// The Leaf