import static java.lang.System.*;
public class instructions extends displayer{
    public static void readInstructions() {
        out.println("Here are the instructions for Yahtzee:");
        out.println("On your turn, you will roll five dice.");
        out.println("You can either place a score down, or roll again. You can roll up to three times in total.");
        out.println("At the end of your last roll, you must score, but you don't have to roll all three times.");
        out.println("When rolling again, you can put aside some dice, based on what you want to score.");
        out.println("The upper section contains scores based on dice numbers. For example, for twos, you have to get as many twos as you can, then add together all your twos at the end. If you had four twos, you would score eight on twos.");
        out.println("After you have scored all the upper section score slots, if you have an upper section total of 63 or higher, you get a 35 point bonus.");
        out.println("The lower section has many different types of scores.");
        out.println("Chance is adding together all your dice after you have finished your rolls.");
        out.println("Four of a kind is getting four of one kind of dice, like four fives, then adding together all your dice.");
        out.println("Three of a kind is the same, but you just have to match three dice.");
        out.println("Full house is where you get three of one kind of dice and two of another kind. You always score 25 if you get this.");
        out.println("Small straight is getting four dice in order, such as one dice with 1, another with 2, another with 3, and another with 4. You always score 30 on this.");
        out.println("Large straight is the same as small straight, but you have to get five dice in order. Always score 40 for this.");
        out.println("Yahtzee is the ultimate score: five dice of the same kind. If you get this, score 50.");
        out.println("If you get another yahtzee in a game, you can get a yahtzee bonus, which adds 100 points to your total.");
        out.println("All of these scores can be completed in any order.");
        out.println("If, at the end of your turn, you cannot score anything, you have to take a 0 on something. For example, if you have only a yahtzee left to score, and do not get it, just type yahtzee, and the computer will score 0 on it.");
        out.println("Once everybody has scored the required score slots, whoever has the most points added together wins!");
    }
}
