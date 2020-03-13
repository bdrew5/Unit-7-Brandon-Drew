public abstract class Vegetables implements Growable {
    private String name;
    private String type;
    private String instructions;

    public Vegetables(String name, String type){
        this.name = name;
        this.type = type;
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
    public abstract String getInstructions();

    protected void setInstructions(String instructions){
        this.instructions= instructions;
    }

    public String getType() {
        return type;
    }
    public String feed()
    public String water()
    public String harvest()
}