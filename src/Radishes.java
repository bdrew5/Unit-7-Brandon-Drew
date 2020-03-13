public class Radishes extends Vegetables {
    public Radishes(){
        super("Radishes", "Root");
    }

    public String toString() {
        return super.toString();
    }

    public String getInstructions(){
        return "Instructions: \n" +
                "Directly sow seeds outdoors ½ to 1 inch deep and 1 inch apart in rows 12 inches \n" +
                "apart. Plant another round of seeds every 10 days or so—while weather is still cool—\n" +
                "for a continuous harvest of radishes in the late spring and early summer. Plan on a \n" +
                "fall planting.";
    }
    public void setInstructions(){
        super.setInstructions( "Instructions: \n" +
                "Directly sow seeds outdoors ½ to 1 inch deep and 1 inch apart in rows 12 inches \n" +
                "apart. Plant another round of seeds every 10 days or so—while weather is still cool—\n" +
                "for a continuous harvest of radishes in the late spring and early summer. Plan on a \n" +
                "fall planting.");
    }
    public String feed(){
        return "Don't Have to Feed Radishes";
    }

    public String water(){
        return "Water Radishes Three Times a Week";
    }

    public String harvest(){
        return "Harvest Radishes After Three Weeks";
    }
}
