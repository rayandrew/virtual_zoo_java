package ensure.animal.amphibi;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Caecilia is a type of amphibi
 */
public class Caecilia extends Amphibi {
    //methods
    public Caecilia(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
    }

    public double getTotalFood() {
        return (double) (super.getWeight() * 0.01);
    }
    public void interact(){
        System.out.println("Kroakk!");
    }
}
