package animal.Amphibi;

import animal.Animal;

/**
 * Created by Aldrich on 3/25/2017.
 * @class Amphibi is a type of animal
 */
abstract class Amphibi extends Animal {
    //methods
    public Amphibi(String inputName, float inputWeight, boolean isTamed, int x, int y, String inputFoodType){
        super(inputName,inputWeight,isTamed,x,y,inputFoodType);
    }

    //TODO make some private data members
}