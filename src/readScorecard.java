import java.util.Scanner;
public class readScorecard extends displayer {
    private int player;
    public String playerOneName;
    public String playerTwoName;
    private topSection getScore = new topSection(player);
    Scanner keyboard = new Scanner(System.in);
    public readScorecard(int player) {
        this.player = player;
    }
    public void getNames() {
        System.out.print("What is player one's name? Type it here: ");
        playerOneName = keyboard.next();
        System.out.print("What is player two's name? Type it here: ");
        playerTwoName = keyboard.next();
    }
    public void read() {
        //add lower section things
        if (player == 1) {
            System.out.println("***" + scorecardNames.playerOneName + "'S SCORECARD***");
            enterToContinue();
            System.out.println("UPPER SECTION:");
            if (hasOnes) {
                System.out.println("ONES: " + ones);
            }
            else{
                System.out.println("ONES: --");
            }
            if (hasTwos) {
                System.out.println("TWOS: " + twos);
            }
            else{
                System.out.println("TWOS: --");
            }
            if (hasThrees) {
                System.out.println("THREES: " + threes);
            }
            else{
                System.out.println("THREES: --");
            }
            if (hasFours) {
                System.out.println("FOURS: " + fours);
            }
            else{
                System.out.println("FOURS: --");
            }
            if (hasFives) {
                System.out.println("FIVES: " + fives);
            }
            else{
                System.out.println("FIVES: --");
            }
            if (hasSixes) {
                System.out.println("SIXES: " + sixes);
            }
            else{
                System.out.println("SIXES: --");
            }
            int upperTotal = ones + twos + threes + fours + fives + sixes;
            if (upperTotal >= 63) {
                hasBonus = true;
                System.out.println("BONUS: 35");
                upperTotal+=35;
            }
            else{
                hasBonus = false;
                System.out.println("BONUS: --");
            }
            upperTotal1 = upperTotal;
            System.out.println("UPPER SECTION TOTAL: " + upperTotal);
            System.out.println("LOWER SECTION:");
            if (hasDoneThreeOfAKind) {
                System.out.println("THREE OF A KIND: " + threeOfAKind);
            }
            else{
                System.out.println("THREE OF A KIND: --");
            }
            if (hasDoneFourOfAKind) {
                System.out.println("FOUR OF A KIND: " + fourOfAKind);
            }
            else {
                System.out.println("FOUR OF A KIND: --");
            }
            if (hasDoneFullHouse) {
                System.out.println("FULL HOUSE: " + fullHouse);
            }
            else {
                System.out.println("FULL HOUSE: --");
            }
            if (hasDoneSmallStraight) {
                System.out.println("SMALL STRAIGHT: " + smallStraight);
            }
            else {
                System.out.println("SMALL STRAIGHT: --");
            }
            if (hasDoneLargeStraight) {
                System.out.println("LARGE STRAIGHT: " + largeStraight);
            }
            else {
                System.out.println("LARGE STRAIGHT: --");
            }
            if (hasDoneYahtzee) {
                if (hasFullYahtzee) {
                    System.out.println("YAHTZEE: 50");
                }
                else{
                    System.out.println("YAHTZEE: 0");
                }
            }
            else{
                System.out.println("YAHTZEE: --");
            }
            if (hasChance) {
                System.out.println("CHANCE: " + chance);
            }
            else {
                System.out.println("CHANCE: --");
            }
            if (hasYahtzeeBonus) {
                System.out.println("YAHTZEE BONUS: " + yahtzeeBonus);
            }
            else{
                System.out.println("YAHTZEE BONUS: --");
            }
            int lowerTotal = threeOfAKind + fourOfAKind + fullHouse + smallStraight + largeStraight + yahtzee + chance + yahtzeeBonus;
            System.out.println("LOWER SECTION TOTAL: " + lowerTotal);
            lowerTotal1 = lowerTotal;
            //add other scores once you've coded them:
            int grandTotal = upperTotal + lowerTotal;
            grandTotal1 = grandTotal;
            System.out.println("GRAND TOTAL: " + grandTotal);





        }
        else if (player == 2) {
            System.out.println("***" + scorecardNames.playerTwoName + "'S SCORECARD***");
            enterToContinue();
            System.out.println("UPPER SECTION:");
            if (hasOnes2) {
                System.out.println("ONES: " + ones2);
            }
            else{
                System.out.println("ONES: --");
            }
            if (hasTwos2) {
                System.out.println("TWOS: " + twos2);
            }
            else{
                System.out.println("TWOS: --");
            }
            if (hasThrees2) {
                System.out.println("THREES: " + threes2);
            }
            else{
                System.out.println("THREES: --");
            }
            if (hasFours2) {
                System.out.println("FOURS: " + fours2);
            }
            else{
                System.out.println("FOURS: --");
            }
            if (hasFives2) {
                System.out.println("FIVES: " + fives2);
            }
            else{
                System.out.println("FIVES: --");
            }
            if (hasSixes2) {
                System.out.println("SIXES: " + sixes2);
            }
            else{
                System.out.println("SIXES: --");
            }
            int upperTotal = ones2 + twos2 + threes2 + fours2 + fives2 + sixes2;
            if (upperTotal >= 63) {
                hasBonus2 = true;
                System.out.println("BONUS: 35");
                upperTotal+=35;
            }
            else{
                hasBonus2 = false;
                System.out.println("BONUS: --");
            }
            upperTotal2 = upperTotal;
            System.out.println("UPPER SECTION TOTAL: " + upperTotal);
            System.out.println("LOWER SECTION:");
            if (hasDoneThreeOfAKind2) {
                System.out.println("THREE OF A KIND: " + threeOfAKind2);
            }
            else{
                System.out.println("THREE OF A KIND: --");
            }
            if (hasDoneFourOfAKind2) {
                System.out.println("FOUR OF A KIND: " + fourOfAKind2);
            }
            else {
                System.out.println("FOUR OF A KIND: --");
            }
            if (hasDoneFullHouse2) {
                System.out.println("FULL HOUSE: " + fullHouse2);
            }
            else {
                System.out.println("FULL HOUSE: --");
            }
            if (hasDoneSmallStraight2) {
                System.out.println("SMALL STRAIGHT: " + smallStraight2);
            }
            else {
                System.out.println("SMALL STRAIGHT: --");
            }
            if (hasDoneLargeStraight2) {
                System.out.println("LARGE STRAIGHT: " + largeStraight2);
            }
            else {
                System.out.println("LARGE STRAIGHT: --");
            }
            if (hasDoneYahtzee2) {
                if (hasFullYahtzee2) {
                    System.out.println("YAHTZEE: 50");
                }
                else{
                    System.out.println("YAHTZEE: 0");
                }
            }
            else{
                System.out.println("YAHTZEE: --");
            }
            if (hasChance2) {
                System.out.println("CHANCE: " + chance2);
            }
            else {
                System.out.println("CHANCE: --");
            }
            if (hasYahtzeeBonus2) {
                System.out.println("YAHTZEE BONUS: " + yahtzeeBonus2);
            }
            else{
                System.out.println("YAHTZEE BONUS: --");
            }
            int lowerTotal = threeOfAKind2 + fourOfAKind2 + fullHouse2 + smallStraight2 + largeStraight2 + yahtzee2 + chance2 + yahtzeeBonus2;
            System.out.println("LOWER SECTION TOTAL: " + lowerTotal);
            lowerTotal2 = lowerTotal;
            //add other scores once you've coded them:
            int grandTotal = upperTotal + lowerTotal;
            grandTotal2 = grandTotal;
            System.out.println("GRAND TOTAL: " + grandTotal);
        }
        enterToContinue();

    }
}
