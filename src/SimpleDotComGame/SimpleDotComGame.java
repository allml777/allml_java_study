//package SimpleDotComGame;
//
//public class SimpleDotComGame {
//    public static void main(String[] args){
//        int numOfGuesses = 0;
//        GameHelper helper = new GameHelper();
//
//        SimpleDotCom theDotCom = new SimpleDotCom();
//        int randomNum = (int) (Math.random() * 5);
//
//        int[] locations = {randomNum,randomNum+1,randomNum+2};
//        theDotCom.setLocaltionCells(locations);
//        boolean isAlive = true;
//
//        while (isAlive){
//            String guess = helper.GetUserInput("enter a number: ");
//            String result = theDotCom.checkYourself(guess);
//            numOfGuesses++;
//            if (result.equals("kill")){
//                isAlive = false;
//                System.out.println("You took " + numOfGuesses + " guesses");
//            }
//        }
//    }
//}
