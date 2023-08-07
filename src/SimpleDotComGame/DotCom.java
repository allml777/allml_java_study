package SimpleDotComGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> localtionCells;
    private String name;
    int numofHits = 0;

    public void setLocalcells(ArrayList<String > loc){
        localtionCells = loc;
    }
    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = localtionCells.indexOf(userInput);

        if (index >= 0){
            localtionCells.remove(index);

            if (localtionCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " + name + " :(");
            }else {
                result = "hit";
            }
        }
        return result;
    }
}
