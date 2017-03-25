package animal.Amphibi;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Salamander is a type of Amphibi
 */
public class Salamander extends Amphibi {
    //methods
    public Salamander(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    public float getTotalFood() {
        return (float) (super.getWeight() * 0.15);
    }
    public void interact(){
        System.out.println("Shhhh!");
    }
}