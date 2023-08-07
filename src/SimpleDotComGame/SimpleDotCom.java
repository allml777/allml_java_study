package SimpleDotComGame;

public class SimpleDotCom {
    int [] localtionCells;       //建立一个数组
    int numofHits = 0;
    public void setLocaltionCells(int[] locs){
        localtionCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);//把传入是string类转为int赋值给guess
        String result = "miss";
        for(int cell:localtionCells){
            if (guess == cell){
                result =  "hit";
                numofHits++;
                break;
            }
        }

        if (numofHits == localtionCells.length){
            result = "kill";
        }

        System.out.println(result);
            return result;
    }
}
