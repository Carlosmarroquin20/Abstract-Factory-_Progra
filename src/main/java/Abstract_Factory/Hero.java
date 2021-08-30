
package Abstract_Factory;

public class Hero implements Primary_Factory {

    @Override
    public Marvel getMarvel() {
        return new HeroMarvel("Capitan America");
    }

    @Override
    public DC_Comics getDC_Comics() {
        return new HeroDC("Flash");
    }
}