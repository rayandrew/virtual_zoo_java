package animal.aves;

/**
 * Created by Aldrich on 3/25/2017.
 * @class BirdOfParadise is a type of aves
 */
public class BirdOfParadise extends Aves {
    //methods
    public BirdOfParadise(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Hiiiikkk!");
    }
}