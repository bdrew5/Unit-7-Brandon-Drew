public class Lettuce extends Vegetables {
    public Lettuce(){
        super("Lettuce", "Leaves");
    }

    public String toString() {
        return super.toString();
    }

    public String getInstructions(){
        return "Instructions: \n" +
                "Lettuce is cool-season crop that grows well in the spring and fall in most regions. \n" +
                "Lettuce seedlings will even tolerate a light frost.\n" +
                "\n" +
                "Sow any time soils are above 40°F. Seeds germinate best at 55 to 65°F and will emerge \n" +
                "in only 7 to 10 days. Because lettuce grows quickly, plant a small amount at a time, \n" +
                "staggering your plantings to a continued harvest!";
    }
    public void setInstructions(){
        super.setInstructions( "Instructions: \n" +
                "Lettuce is cool-season crop that grows well in the spring and fall in most regions. \n" +
                "Lettuce seedlings will even tolerate a light frost.\n" +
                "\n" +
                "Sow any time soils are above 40°F. Seeds germinate best at 55 to 65°F and will emerge \n" +
                "in only 7 to 10 days. Because lettuce grows quickly, plant a small amount at a time, \n" +
                "staggering your plantings to a continued harvest!");
    }
    public String feed(){
        return "Don't Have to Feed Lettuce";
    }

    public String water(){
        return "Water Lettuce Four to Five Times a Week";
    }

    public String harvest(){
        return "Harvest Lettuce After 45 - 55 Days";
    }
}
