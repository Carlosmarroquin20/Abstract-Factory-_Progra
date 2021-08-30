
package Abstract_Factory;

public class Villain implements Primary_Factory{

    @Override
    public Marvel getMarvel() {
        return new VillianMarvel("Venon");
    }

    @Override
    public DC_Comics getDC_Comics() {
        return new VillianDC("Darkseid");
    }
}