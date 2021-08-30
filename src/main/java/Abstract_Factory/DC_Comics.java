
package Abstract_Factory;

public abstract class DC_Comics {
    private String Name;
    
    public DC_Comics(String Name){
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
