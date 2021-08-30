
package Abstract_Factory;

public abstract class Marvel  {
    private String Name;
    
    public Marvel(String Name){
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
