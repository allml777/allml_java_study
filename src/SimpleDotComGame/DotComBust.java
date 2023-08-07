//package SimpleDotComGame;
//import java.lang.reflect.Array;
//import java.util.*;
//
//public class DotComBust {
//    //Declare object GameHelper;
//    private  GameHelper helper = new GameHelper();
//    //Declare object dotComsList;
//    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
//    //Declare object numOfGuesses = 0;
//    private int numOfGuesses = 0;
//
//    private void setUpGame(){
//        //Declare 3 object & add them to dotComList
//        DotCom one = new DotCom();
//        one.setName("Pets.com");
//        DotCom two = new DotCom();
//        two.setName("eToy.com");
//        DotCom three = new DotCom();
//        three.setName("Go2.com");
//        dotComsList.add(one);
//        dotComsList.add(two);
//        dotComsList.add(three);
//
//        System.out.println("Your goal is to sink three dot coms.");
//        System.out.println("Pets.com,eToy.com,Go2.com");
//        System.out.println("Try to sink them all in the fewest number of guesses");
//
//        for(DotCom dotComToSet : dotComsList){
//            ArrayList<String > newLocation = helper.placeDotCom(3);
//
//            dotComToSet.setLocalcells(newLocation);
//        }
//    }
//
//    private void startPlaying(){
//        while(!dotComsList.isEmpty()){
//            String userGuess = helper.GetUserInput("Enter a guess : ");
//            checkUserGuess(userGuess);
//        }
//        finishGame();
//    }
//
//    private void checkUserGuess(String userGuess){
//        numOfGuesses++;
//        String result = "miss";
//        for (DotCom dotComToTest : dotComsList){
//            result = dotComToTest.checkYourself(userGuess);
//            if (result.equals("hit")){
//                dotComsList.remove(dotComToTest);
//                break;
//            }
//        }
//        System.out.println(result);
//    }
//
//    private void finishGame(){
//        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
//        if (numOfGuesses<=18){
//            System.out.println("It only took you " + numOfGuesses + " guesses.");
//            System.out.println("You got out before your options sank.");
//        }else{
//            System.out.println("Took you long enough" + numOfGuesses + " guesses.");
//            System.out.println("Fish are dancinq with your options");
//        }
//    }
//
//    public static void main(String[] args){
//        DotComBust game = new DotComBust();
//        game.setUpGame();
//        game.startPlaying();
//    }
//}
