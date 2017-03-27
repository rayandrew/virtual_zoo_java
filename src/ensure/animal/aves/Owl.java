package ensure.animal.aves;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Owl is a type of aves
 */
public class Owl extends Aves {
    //methods
    public Owl(String inputName, double inputWeight, boolean isTamed, int x, int y, String inputFoodType, String inputHabitat){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType,inputHabitat);
        symbol = 'o';
    }

    public void interact(){
        System.out.println("Kukrukk!");
    }
}