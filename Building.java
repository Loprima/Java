package Name;

public class Building implements NameAble {
    private String name;
    private String architect;

    Building (String name, String architect){
        this.name = name;
        this.architect = architect;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArchitect(){return architect; }
    public void setArchitect(String architect) { this.architect = architect; }

}
