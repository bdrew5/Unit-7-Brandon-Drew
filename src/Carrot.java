public class Carrot extends Vegetables {
    public Carrot(){
        super("Carrot", "Root");
    }

    public String toString() {
        return super.toString();
    }

    public String getInstructions(){
        return "Instructions: \n" +
                "Carrots are easy to grow as long as they are planted in loose, sandy soil during the \n" +
                "cooler periods of the growing season—spring and fall (carrots can tolerate \n" +
                "frost). Depending on the variety and local growing conditions, carrots may take \n" +
                "anywhere from 2 to 4 months to mature. ";
    }
    public void setInstructions(){
        super.setInstructions( "Instructions: \n" +
                "Carrots are easy to grow as long as they are planted in loose, sandy soil during the \n" +
                "cooler periods of the growing season—spring and fall (carrots can tolerate \n" +
                "frost). Depending on the variety and local growing conditions, carrots may take \n" +
                "anywhere from 2 to 4 months to mature. ");
    }
    public String feed(){
        return "Don't Have to Feed Carrots";
    }

    public String water(){
        return "Water Carrots Three a Week";
    }

    public String harvest(){
        return "Harvest Carrots After Three Weeks 50 - 75 Days";
    }
}
