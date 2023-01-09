import java.util.*;
import static java.lang.System.*;

public class displayer{

    //class fields:
    public static readScorecard scorecardNames = new readScorecard(1);
    static Scanner keyboard = new Scanner(in);
    //while loop fields:
    private static int askAgain = 0;
    private static int askAgain2 = 0;
    private static int areYouSure = 0;
    private static int askAreYouSure = 0;
    private static int playAgain = 0;
    private static int askPlayAgain = 0;
    //dice fields:
    private static int dice1;
    private static int dice2;
    private static int dice3;
    private static int dice4;
    private static int dice5;
    private static boolean rollOneAgain = true;
    private static boolean rollTwoAgain = true;
    private static boolean rollThreeAgain = true;
    private static boolean rollFourAgain = true;
    private static boolean rollFiveAgain = true;
    private static int rollTimes = 0;
    //upper section fields- player two:
    static boolean hasOnes = false;
    static boolean hasTwos = false;
    static boolean hasThrees = false;
    static boolean hasFours = false;
    static boolean hasFives = false;
    static boolean hasSixes = false;
    static int ones = 0;
    static int twos = 0;
    static int threes = 0;
    static int fours = 0;
    static int fives = 0;
    static int sixes = 0;
    public static int upperTotal1;
    //lower section fields- player one:
    static boolean hasDoneThreeOfAKind;
    static int threeOfAKind;
    static boolean hasDoneFourOfAKind;
    static int fourOfAKind;
    static boolean hasDoneFullHouse;
    static int fullHouse;
    static boolean hasDoneSmallStraight;
    static int smallStraight;
    static boolean hasDoneLargeStraight;
    static int largeStraight;
    static boolean hasDoneYahtzee;
    static int yahtzee;
    static boolean hasFullYahtzee = false;
    public static boolean hasBonus;
    static int yahtzeeBonus;
    static boolean hasYahtzeeBonus = false;
    static boolean hasChance;
    static int chance;
    public static int lowerTotal1;
    public static int grandTotal1;
    //upper section fields- player two:
    static boolean hasOnes2 = false;
    static boolean hasTwos2 = false;
    static boolean hasThrees2 = false;
    static boolean hasFours2 = false;
    static boolean hasFives2 = false;
    static boolean hasSixes2 = false;
    static int ones2 = 0;
    static int twos2 = 0;
    static int threes2 = 0;
    static int fours2 = 0;
    static int fives2 = 0;
    static int sixes2 = 0;
    public static int upperTotal2;
    //lower section fields- player two:
    static boolean hasDoneThreeOfAKind2;
    static int threeOfAKind2;
    static boolean hasDoneFourOfAKind2;
    static int fourOfAKind2;
    static boolean hasDoneFullHouse2;
    static int fullHouse2;
    static boolean hasDoneSmallStraight2;
    static int smallStraight2;
    static boolean hasDoneLargeStraight2;
    static int largeStraight2;
    static boolean hasDoneYahtzee2;
    static int yahtzee2;
    static int yahtzeeBonus2;
    static boolean hasYahtzeeBonus2;
    static boolean hasFullYahtzee2;
    public static boolean hasBonus2;
    static boolean hasChance2;
    static int chance2;
    public static int lowerTotal2;
    public static int grandTotal2;
    //other fields:
    public String scorecard;
    public static void main(String[] args) {

        out.println("Welcome to Java Yahtzee, by MSGuy01!");
        out.println("Have two players ready to play.");
        while (playAgain == 0) {
            clearEverything();
            scorecardNames.getNames();
            out.println("Welcome, " + scorecardNames.playerOneName + " and " + scorecardNames.playerTwoName + "!");
            out.print("View instructions? type 'yes' to read instructions: ");
            String viewInstructions = keyboard.next();
            if (viewInstructions.equals("yes")) {
                instructions instructions = new instructions();
                instructions.readInstructions();
                enterToContinue();
            }
            //change player names:
            for (int i = 0; i < 13; i++) {
                askAgain = 0;
                rollTimes = 0;
                rollOneAgain = true;
                rollTwoAgain = true;
                rollThreeAgain = true;
                rollFourAgain = true;
                rollFiveAgain = true;
                System.out.println(scorecardNames.playerOneName + "'s turn!");
                while (askAgain == 0) {
                    readScorecard printScorecard = new readScorecard(1);
                    if (rollTimes != 3) {
                        if (rollOneAgain) {
                            dice1 = new Random().nextInt(6) + 1;
                        }
                        if (rollTwoAgain) {
                            dice2 = new Random().nextInt(6) + 1;
                        }
                        if (rollThreeAgain) {
                            dice3 = new Random().nextInt(6) + 1;
                        }
                        if (rollFourAgain) {
                            dice4 = new Random().nextInt(6) + 1;
                        }
                        if (rollFiveAgain) {
                            dice5 = new Random().nextInt(6) + 1;
                        }
                        rollTimes++;
                    }
                    out.println("Your roll: ");
                    enterToContinue();
                    out.println("die one: " + dice1);
                    out.println("die two: " + dice2);
                    out.println("die three: " + dice3);
                    out.println("die four: " + dice4);
                    out.println("die five: " + dice5);
                    if (dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5) {
                        if (!hasDoneYahtzee) {
                            System.out.println("You got a YAHTZEE!");
                        }
                    /*else if (hasDoneYahtzee && ){
                        System.out.println("You got a YAHTZEE BONUS!! THAT'S 100 EXTRA POINTS!!! Type 'bonus' to claim the points.");
                    }*/
                    }
                    if (rollTimes != 3) {
                        out.print("Type in what you want to score. If you want to roll again, type 'again'. Type 'options' to see scoring options: ");
                    } else {
                        out.print("Type in what you want to score. Type 'options' to see scoring options: ");
                        //code options list
                    }
                    String scoreChoice = keyboard.next();
                    topSection setScoreTop = new topSection(1);
                    lowSection setScoreBottom = new lowSection(1);

                    //complete coding all the options, and second player options
                    //finish changing all variables from the lowSection class to the variables in this class
                    if (scoreChoice.equals("1")) {
                        setScoreTop.setOnes(dice1, dice2, dice3, dice4, dice5);
                        if (!hasOnes) {
                            out.println("You scored " + setScoreTop.getScore("1") + " on ones!");
                            ones = setScoreTop.getScore("1");
                            hasOnes = true;
                            askAgain = 0;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("2")) {
                        setScoreTop.setTwos(dice1, dice2, dice3, dice4, dice5);
                        if (!hasTwos) {
                            out.println("You scored " + setScoreTop.getScore("2") + " on twos!");
                            twos = setScoreTop.getScore("2");
                            hasTwos = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("3")) {
                        setScoreTop.setThrees(dice1, dice2, dice3, dice4, dice5);
                        if (!hasThrees) {
                            out.println("You scored " + setScoreTop.getScore("3") + " on threes!");
                            threes = setScoreTop.getScore("3");
                            hasThrees = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("4")) {
                        setScoreTop.setFours(dice1, dice2, dice3, dice4, dice5);
                        if (!hasFours) {
                            out.println("You scored " + setScoreTop.getScore("4") + " on fours!");
                            fours = setScoreTop.getScore("4");
                            hasFours = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("5")) {
                        setScoreTop.setFives(dice1, dice2, dice3, dice4, dice5);
                        if (!hasFives) {
                            out.println("You scored " + setScoreTop.getScore("5") + " on fives!");
                            fives = setScoreTop.getScore("5");
                            hasFives = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("6")) {
                        setScoreTop.setSixes(dice1, dice2, dice3, dice4, dice5);
                        if (!hasSixes) {
                            out.println("You scored " + setScoreTop.getScore("6") + " on sixes!");
                            sixes = setScoreTop.getScore("6");
                            hasSixes = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("three_of_a_kind")) {
                        setScoreBottom.setThree(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneThreeOfAKind) {
                            out.println("You scored " + setScoreBottom.getScore("three") + " on three of a kind!");
                            threeOfAKind = setScoreBottom.getScore("three");
                            hasDoneThreeOfAKind = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("four_of_a_kind")) {
                        setScoreBottom.setFour(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneFourOfAKind) {
                            out.println("You scored " + setScoreBottom.getScore("four") + " on four of a kind!");
                            fourOfAKind = setScoreBottom.getScore("four");
                            hasDoneFourOfAKind = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("full_house")) {
                        setScoreBottom.setFull(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneFullHouse) {
                            out.println("You scored " + setScoreBottom.getScore("full") + " on full house!");
                            fullHouse = setScoreBottom.getScore("full");
                            hasDoneFullHouse = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("small_straight")) {
                        setScoreBottom.setSmall(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneSmallStraight) {
                            out.println("You scored " + setScoreBottom.getScore("small") + " on small straight!");
                            smallStraight = setScoreBottom.getScore("small");
                            hasDoneSmallStraight = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("large_straight")) {
                        setScoreBottom.setLarge(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneLargeStraight) {
                            out.println("You scored " + setScoreBottom.getScore("large") + " on large straight!");
                            largeStraight = setScoreBottom.getScore("large");
                            hasDoneLargeStraight = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("yahtzee")) {
                        setScoreBottom.setYahtzee(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneYahtzee) {
                            if (setScoreBottom.getScore("yahtzee") == 50) {
                                out.println("You scored 50 on Yahtzee!");
                                hasDoneYahtzee = true;
                                hasFullYahtzee = true;
                                yahtzee = 50;
                                printScorecard.read();
                                askAgain = 1;
                            } else if (setScoreBottom.getScore("yahtzee") == 0) {
                                out.println("You scored 0 on Yahtzee.");
                                hasDoneYahtzee = true;
                                yahtzee = 0;
                                printScorecard.read();
                                askAgain = 1;
                            }
                        } else {
                            if (hasFullYahtzee) {
                                out.println("You added 100 points to your Yahtzee bonus!!");
                                hasYahtzeeBonus = true;
                                i--;
                                yahtzeeBonus = yahtzeeBonus + 100;
                                printScorecard.read();
                                askAgain = 1;
                            } else {
                                out.println("You already scored that!");
                                if (rollTimes < 3) {
                                    rollOneAgain = false;
                                    rollTwoAgain = false;
                                    rollThreeAgain = false;
                                    rollFourAgain = false;
                                    rollFiveAgain = false;
                                    rollTimes--;
                                }
                                askAgain = 0;
                            }
                        }
                    } else if (scoreChoice.equals("chance")) {
                        setScoreBottom.setChance(dice1, dice2, dice3, dice4, dice5);
                        if (!hasChance) {
                            out.println("You scored " + setScoreBottom.getScore("chance") + " on chance!");
                            chance = setScoreBottom.getScore("chance");
                            hasChance = true;
                            printScorecard.read();
                            askAgain = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain = 0;
                        }

                    } else if (scoreChoice.equals("again")) {
                        if (rollTimes < 3) {
                            rollAgain();
                        } else {
                            //tell player they can't roll again
                            System.out.println("You've used up all your rolls!");
                            askAgain = 0;
                        }
                    } else if (scoreChoice.equals("options")) {
                        System.out.println("Loading...");
                        options(1);
                        rollOneAgain = false;
                        rollTwoAgain = false;
                        rollThreeAgain = false;
                        rollFourAgain = false;
                        rollFiveAgain = false;
                        rollTimes--;
                        askAgain = 0;
                    }
                    else if(scoreChoice.equals("skip")) {
                        askAgain = 1;
                    }
                    else {
                        System.out.println("That is not a valid option!");
                        rollOneAgain = false;
                        rollTwoAgain = false;
                        rollThreeAgain = false;
                        rollFourAgain = false;
                        rollFiveAgain = false;
                        rollTimes--;
                        askAgain = 0;

                    }
                }
                //player 2:
                askAgain2 = 0;
                rollTimes = 0;
                rollOneAgain = true;
                rollTwoAgain = true;
                rollThreeAgain = true;
                rollFourAgain = true;
                rollFiveAgain = true;
                System.out.println(scorecardNames.playerTwoName + "'s turn!");
                while (askAgain2 == 0) {
                    readScorecard printScorecard = new readScorecard(2);
                    if (rollTimes != 3) {
                        if (rollOneAgain) {
                            dice1 = new Random().nextInt(6) + 1;
                        }
                        if (rollTwoAgain) {
                            dice2 = new Random().nextInt(6) + 1;
                        }
                        if (rollThreeAgain) {
                            dice3 = new Random().nextInt(6) + 1;
                        }
                        if (rollFourAgain) {
                            dice4 = new Random().nextInt(6) + 1;
                        }
                        if (rollFiveAgain) {
                            dice5 = new Random().nextInt(6) + 1;
                        }
                        rollTimes++;
                    }
                    out.println("Your roll: ");
                    enterToContinue();
                    out.println("die one: " + dice1);
                    out.println("die two: " + dice2);
                    out.println("die three: " + dice3);
                    out.println("die four: " + dice4);
                    out.println("die five: " + dice5);
                    if (dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5) {
                        if (!hasDoneYahtzee2) {
                            System.out.println("You got a YAHTZEE!");
                        }
                    /*else if (hasDoneYahtzee && ){
                        System.out.println("You got a YAHTZEE BONUS!! THAT'S 100 EXTRA POINTS!!! Type 'bonus' to claim the points.");
                    }*/
                    }
                    if (rollTimes != 3) {
                        out.print("Type in what you want to score. If you want to roll again, type 'again'. Type 'options' to see scoring options: ");
                    } else {
                        out.print("Type in what you want to score. Type 'options' to see scoring options: ");
                        //code options list
                    }
                    String scoreChoice = keyboard.next();
                    topSection setScoreTop = new topSection(2);
                    lowSection setScoreBottom = new lowSection(2);

                    //complete coding all the options, and second player options
                    //finish changing all variables from the lowSection class to the variables in this class
                    if (scoreChoice.equals("1")) {
                        setScoreTop.setOnes(dice1, dice2, dice3, dice4, dice5);
                        if (!hasOnes2) {
                            out.println("You scored " + setScoreTop.getScore("1") + " on ones!");
                            ones2 = setScoreTop.getScore("1");
                            hasOnes2 = true;
                            askAgain2 = 0;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("2")) {
                        setScoreTop.setTwos(dice1, dice2, dice3, dice4, dice5);
                        if (!hasTwos2) {
                            out.println("You scored " + setScoreTop.getScore("2") + " on twos!");
                            twos2 = setScoreTop.getScore("2");
                            hasTwos2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("3")) {
                        setScoreTop.setThrees(dice1, dice2, dice3, dice4, dice5);
                        if (!hasThrees2) {
                            out.println("You scored " + setScoreTop.getScore("3") + " on threes!");
                            threes2 = setScoreTop.getScore("3");
                            hasThrees2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("4")) {
                        setScoreTop.setFours(dice1, dice2, dice3, dice4, dice5);
                        if (!hasFours2) {
                            out.println("You scored " + setScoreTop.getScore("4") + " on fours!");
                            fours2 = setScoreTop.getScore("4");
                            hasFours2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("5")) {
                        setScoreTop.setFives(dice1, dice2, dice3, dice4, dice5);
                        if (!hasFives2) {
                            out.println("You scored " + setScoreTop.getScore("5") + " on fives!");
                            fives2 = setScoreTop.getScore("5");
                            hasFives2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("6")) {
                        setScoreTop.setSixes(dice1, dice2, dice3, dice4, dice5);
                        if (!hasSixes2) {
                            out.println("You scored " + setScoreTop.getScore("6") + " on sixes!");
                            sixes2 = setScoreTop.getScore("6");
                            hasSixes2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("three_of_a_kind")) {
                        setScoreBottom.setThree(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneThreeOfAKind2) {
                            out.println("You scored " + setScoreBottom.getScore("three") + " on three of a kind!");
                            threeOfAKind2 = setScoreBottom.getScore("three");
                            hasDoneThreeOfAKind2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("four_of_a_kind")) {
                        setScoreBottom.setFour(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneFourOfAKind2) {
                            out.println("You scored " + setScoreBottom.getScore("four") + " on four of a kind!");
                            fourOfAKind2 = setScoreBottom.getScore("four");
                            hasDoneFourOfAKind2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("full_house")) {
                        setScoreBottom.setFull(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneFullHouse2) {
                            out.println("You scored " + setScoreBottom.getScore("full") + " on full house!");
                            fullHouse2 = setScoreBottom.getScore("full");
                            hasDoneFullHouse2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("small_straight")) {
                        setScoreBottom.setSmall(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneSmallStraight2) {
                            out.println("You scored " + setScoreBottom.getScore("small") + " on small straight!");
                            smallStraight2 = setScoreBottom.getScore("small");
                            hasDoneSmallStraight2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("large_straight")) {
                        setScoreBottom.setLarge(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneLargeStraight2) {
                            out.println("You scored " + setScoreBottom.getScore("large") + " on large straight!");
                            largeStraight2 = setScoreBottom.getScore("large");
                            hasDoneLargeStraight2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("yahtzee")) {
                        setScoreBottom.setYahtzee(dice1, dice2, dice3, dice4, dice5);
                        if (!hasDoneYahtzee2) {
                            if (setScoreBottom.getScore("yahtzee") == 50) {
                                out.println("You scored 50 on Yahtzee!");
                                hasDoneYahtzee2 = true;
                                hasFullYahtzee2 = true;
                                yahtzee2 = 50;
                                printScorecard.read();
                                askAgain2 = 1;
                            } else if (setScoreBottom.getScore("yahtzee") == 0) {
                                out.println("You scored 0 on Yahtzee.");
                                hasDoneYahtzee2 = true;
                                yahtzee2 = 0;
                                printScorecard.read();
                                askAgain2 = 1;
                            }
                        } else {
                            if (hasFullYahtzee2) {
                                out.println("You added 100 points to your Yahtzee bonus!!");
                                hasYahtzeeBonus2 = true;
                                i--;
                                yahtzeeBonus2 = yahtzeeBonus2 + 100;
                                printScorecard.read();
                                askAgain2 = 1;
                            } else {
                                out.println("You already scored that!");
                                if (rollTimes < 3) {
                                    rollOneAgain = false;
                                    rollTwoAgain = false;
                                    rollThreeAgain = false;
                                    rollFourAgain = false;
                                    rollFiveAgain = false;
                                    rollTimes--;
                                }
                                askAgain2 = 0;
                            }
                        }
                    } else if (scoreChoice.equals("chance")) {
                        setScoreBottom.setChance(dice1, dice2, dice3, dice4, dice5);
                        if (!hasChance2) {
                            out.println("You scored " + setScoreBottom.getScore("chance") + " on chance!");
                            chance2 = setScoreBottom.getScore("chance");
                            hasChance2 = true;
                            printScorecard.read();
                            askAgain2 = 1;
                        } else {
                            out.println("You already scored that!");
                            if (rollTimes < 3) {
                                rollOneAgain = false;
                                rollTwoAgain = false;
                                rollThreeAgain = false;
                                rollFourAgain = false;
                                rollFiveAgain = false;
                                rollTimes--;
                            }
                            askAgain2 = 0;
                        }

                    } else if (scoreChoice.equals("again")) {
                        if (rollTimes < 3) {
                            rollAgain();
                        } else {
                            //tell player they can't roll again
                            System.out.println("You've used up all your rolls!");
                            askAgain2 = 0;
                        }
                    } else if (scoreChoice.equals("options")) {
                        System.out.println("Loading...");
                        options(2);
                        rollOneAgain = false;
                        rollTwoAgain = false;
                        rollThreeAgain = false;
                        rollFourAgain = false;
                        rollFiveAgain = false;
                        rollTimes--;
                        askAgain2 = 0;
                    } else {
                        System.out.println("That is not a valid option!");
                        rollOneAgain = false;
                        rollTwoAgain = false;
                        rollThreeAgain = false;
                        rollFourAgain = false;
                        rollFiveAgain = false;
                        rollTimes--;
                        askAgain2 = 0;

                    }
                }
            }
            System.out.println("***RESULTS***");
            enterToContinue();
            System.out.println(scorecardNames.playerOneName + " upper section total: " + upperTotal1);
            System.out.println(scorecardNames.playerTwoName + " upper section total: " + upperTotal2);
            System.out.println(scorecardNames.playerOneName + " lower section total: " + lowerTotal1);
            System.out.println(scorecardNames.playerTwoName + " lower section total: " + lowerTotal2);
            System.out.println(scorecardNames.playerOneName + " grand total: " + grandTotal1);
            System.out.println(scorecardNames.playerTwoName + " grand total: " + grandTotal2);
            System.out.println("And the winner is...");
            enterToContinue();
            if (grandTotal1 > grandTotal2) {
                System.out.println(scorecardNames.playerOneName + "!!! Congratulations!!!");
            } else if (grandTotal2 > grandTotal1) {
                System.out.println(scorecardNames.playerTwoName + "!!! Congratulations!!!");
            } else {
                System.out.println("No one! It's a tie!");
            }
            while (askPlayAgain == 0) {
                String playAgainChoice;
                out.print("Would you like to play again? ");
                playAgainChoice = keyboard.next();
                if (playAgainChoice.equals("yes")) {
                    out.println("Starting game over...");
                    playAgain = 0;
                    askPlayAgain = 1;
                }
                else if (playAgainChoice.equals("no")) {
                    out.println("Play again soon! Ending program...");
                    playAgain = 1;
                    askPlayAgain = 1;
                }
                else{
                    out.println("Please enter yes or no.");
                    askPlayAgain = 0;
                }
            }
        }
    }
    public static void rollAgain() {
        String rollAgain;
        areYouSure = 0;
        askAreYouSure = 0;
        while (areYouSure == 0) {
            askAreYouSure = 0;
            out.print("Roll die one again? type yes or no. If you don't type yes or no, it will roll again: ");
            rollAgain = keyboard.next();
            if (rollAgain.equals("no")) {
                rollOneAgain = false;
            } else {
                rollOneAgain = true;
            }
            out.print("Roll die two again? type yes or no: ");
            rollAgain = keyboard.next();
            if (rollAgain.equals("no")) {
                rollTwoAgain = false;
            } else {
                rollTwoAgain = true;
            }
            out.print("Roll die three again? type yes or no: ");
            rollAgain = keyboard.next();
            if (rollAgain.equals("no")) {
                rollThreeAgain = false;
            } else {
                rollThreeAgain = true;
            }
            out.print("Roll die four again? type yes or no: ");
            rollAgain = keyboard.next();
            if (rollAgain.equals("no")) {
                rollFourAgain = false;
            } else {
                rollFourAgain = true;
            }
            out.print("Roll die five again? type yes or no: ");
            rollAgain = keyboard.next();
            if (rollAgain.equals("no")) {
                rollFiveAgain = false;
            } else {
                rollFiveAgain = true;
            }
            while (askAreYouSure == 0) {
                out.print("Are you sure? ");
                rollAgain = keyboard.next();
                if (rollAgain.equals("no")) {
                    areYouSure = 0;
                    askAreYouSure = 1;
                } else if (rollAgain.equals("yes")) {
                    areYouSure = 1;
                    askAreYouSure = 1;
                } else {
                    out.println("Please type yes or no.");
                    askAreYouSure = 0;
                }
            }
        }
    }
    public static void options(int player) {
        System.out.println("OPTIONS:");
        enterToContinue();
        if (player == 1) {
            topSection showTop = new topSection(1);
            lowSection showBottom = new lowSection(1);
            if (!hasOnes) {
                showTop.setOnes(dice1, dice2, dice3, dice4, dice5);
                System.out.println("ONES: type '1'. Score " + showTop.getScore("1"));
            }
            if (!hasTwos) {
                showTop.setTwos(dice1, dice2, dice3, dice4, dice5);
                System.out.println("TWOS: type '2'. Score " + showTop.getScore("2"));
            }
            if (!hasThrees) {
                showTop.setThrees(dice1, dice2, dice3, dice4, dice5);
                System.out.println("THREES: type '3'. Score " + showTop.getScore("3"));
            }
            if (!hasFours) {
                showTop.setFours(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FOURS: type '4'. Score " + showTop.getScore("4"));
            }
            if (!hasFives) {
                showTop.setFives(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FIVES: type '5'. Score " + showTop.getScore("5"));
            }
            if (!hasSixes) {
                showTop.setSixes(dice1, dice2, dice3, dice4, dice5);
                System.out.println("SIXES: type '6'. Score " + showTop.getScore("6"));
            }
            if (!hasDoneThreeOfAKind) {
                showBottom.setThree(dice1, dice2, dice3, dice4, dice5);
                System.out.println("THREE OF A KIND: type 'three_of_a_kind'. Score " + showBottom.getScore("three"));
            }
            if (!hasDoneFourOfAKind) {
                showBottom.setFour(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FOUR OF A KIND: type 'four_of_a_kind'. Score " + showBottom.getScore("four"));
            }
            if (!hasDoneFullHouse) {
                showBottom.setFull(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FULL HOUSE: type 'full_house'. Score " + showBottom.getScore("full"));
            }
            if (!hasDoneSmallStraight) {
                showBottom.setSmall(dice1, dice2, dice3, dice4, dice5);
                System.out.println("SMALL STRAIGHT: type 'small_straight'. Score " + showBottom.getScore("small"));
            }
            if (!hasDoneLargeStraight) {
                showBottom.setLarge(dice1, dice2, dice3, dice4, dice5);
                System.out.println("LARGE STRAIGHT: type 'large_straight'. Score " + showBottom.getScore("large"));
            }
            if (!hasDoneYahtzee) {
                showBottom.setYahtzee(dice1, dice2, dice3, dice4, dice5);
                System.out.println("YAHTZEE: type 'yahtzee'. Score " + showBottom.getScore("yahtzee"));
            }
            if (!hasChance) {
                showBottom.setChance(dice1, dice2, dice3, dice4, dice5);
                System.out.println("CHANCE: type 'chance'. Score " + showBottom.getScore("chance"));
            }
        }
        else{
            topSection showTop = new topSection(2);
            lowSection showBottom = new lowSection(2);
            if (!hasOnes2) {
                showTop.setOnes(dice1, dice2, dice3, dice4, dice5);
                System.out.println("ONES: type '1'. Score " + showTop.getScore("1"));
            }
            if (!hasTwos2) {
                showTop.setTwos(dice1, dice2, dice3, dice4, dice5);
                System.out.println("TWOS: type '2'. Score " + showTop.getScore("2"));
            }
            if (!hasThrees2) {
                showTop.setThrees(dice1, dice2, dice3, dice4, dice5);
                System.out.println("THREES: type '3'. Score " + showTop.getScore("3"));
            }
            if (!hasFours2) {
                showTop.setFours(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FOURS: type '4'. Score " + showTop.getScore("4"));
            }
            if (!hasFives2) {
                showTop.setFives(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FIVES: type '5'. Score " + showTop.getScore("5"));
            }
            if (!hasSixes2) {
                showTop.setSixes(dice1, dice2, dice3, dice4, dice5);
                System.out.println("SIXES: type '6'. Score " + showTop.getScore("6"));
            }
            if (!hasDoneThreeOfAKind2) {
                showBottom.setThree(dice1, dice2, dice3, dice4, dice5);
                System.out.println("THREE OF A KIND: type 'three_of_a_kind'. Score " + showBottom.getScore("three"));
            }
            if (!hasDoneFourOfAKind2) {
                showBottom.setFour(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FOUR OF A KIND: type 'four_of_a_kind'. Score " + showBottom.getScore("four"));
            }
            if (!hasDoneFullHouse2) {
                showBottom.setFull(dice1, dice2, dice3, dice4, dice5);
                System.out.println("FULL HOUSE: type 'full_house'. Score " + showBottom.getScore("full"));
            }
            if (!hasDoneSmallStraight2) {
                showBottom.setSmall(dice1, dice2, dice3, dice4, dice5);
                System.out.println("SMALL STRAIGHT: type 'small_straight'. Score " + showBottom.getScore("small"));
            }
            if (!hasDoneLargeStraight2) {
                showBottom.setLarge(dice1, dice2, dice3, dice4, dice5);
                System.out.println("LARGE STRAIGHT: type 'large_straight'. Score " + showBottom.getScore("large"));
            }
            if (!hasDoneYahtzee2) {
                showBottom.setYahtzee(dice1, dice2, dice3, dice4, dice5);
                System.out.println("YAHTZEE: type 'yahtzee'. Score " + showBottom.getScore("yahtzee"));
            }
            if (!hasChance2) {
                showBottom.setChance(dice1, dice2, dice3, dice4, dice5);
                System.out.println("CHANCE: type 'chance'. Score " + showBottom.getScore("chance"));
            }
        }
        enterToContinue();
        //ask to play again
        //add more enter to continue things
        //maybe add scorecard readings at the end
    }
    public static void enterToContinue(){
        System.out.print("Press ENTER to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static void clearEverything() {
        hasOnes = false;
        hasTwos = false;
        hasThrees = false;
        hasFours = false;
        hasFives = false;
        hasSixes = false;
        hasDoneThreeOfAKind = false;
        hasDoneFourOfAKind = false;
        hasDoneFullHouse = false;
        hasDoneSmallStraight = false;
        hasDoneLargeStraight = false;
        hasDoneYahtzee = false;
        hasYahtzeeBonus = false;
        hasFullYahtzee = false;
        hasChance = false;
        hasBonus = false;
        hasOnes2 = false;
        hasTwos2 = false;
        hasThrees2 = false;
        hasFours2 = false;
        hasFives2 = false;
        hasSixes2 = false;
        hasDoneThreeOfAKind2 = false;
        hasDoneFourOfAKind2 = false;
        hasDoneFullHouse2 = false;
        hasDoneSmallStraight2 = false;
        hasDoneLargeStraight2 = false;
        hasDoneYahtzee2 = false;
        hasYahtzeeBonus2 = false;
        hasFullYahtzee2 = false;
        hasChance2 = false;
        hasBonus2 = false;
        askAgain = 0;
        askAgain2 = 0;
        areYouSure = 0;
        askAreYouSure = 0;
        askPlayAgain = 0;
        playAgain = 0;
        upperTotal1 = 0;
        upperTotal2 = 0;
        lowerTotal1 = 0;
        lowerTotal2 = 0;
        grandTotal1 = 0;
        grandTotal2 = 0;
    }

}

