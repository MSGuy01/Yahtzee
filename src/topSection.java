public class topSection extends displayer{
    public int ones = 0;
    public int twos = 0;
    public int threes = 0;
    public int fours = 0;
    public int fives = 0;
    public int sixes = 0;
    private int player;
    public boolean hasBonus = false;
    public topSection(int player) {
        this.player = player;
    }
    public void setOnes(int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (dice1 == 1) {
            ones = ones + 1;
        }
        if (dice2 == 1) {
            ones = ones + 1;
        }
        if (dice3 == 1) {
            ones = ones + 1;
        }
        if (dice4 == 1) {
            ones = ones + 1;
        }
        if (dice5 == 1) {
            ones = ones + 1;
        }
    }
    public void setTwos(int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (dice1 == 2) {
            twos = twos + 2;
        }
        if (dice2 == 2) {
            twos = twos + 2;
        }
        if (dice3 == 2) {
            twos = twos + 2;
        }
        if (dice4 == 2) {
            twos = twos + 2;
        }
        if (dice5 == 2) {
            twos = twos +2;
        }
    }
    public void setThrees(int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (dice1 == 3) {
            threes = threes + 3;
        }
        if (dice2 == 3) {
            threes = threes + 3;
        }
        if (dice3 == 3) {
            threes = threes + 3;
        }
        if (dice4 == 3) {
            threes = threes + 3;
        }
        if (dice5 == 3) {
            threes = threes + 3;
        }
    }
    public void setFours(int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (dice1 == 4) {
            fours = fours + 4;
        }
        if (dice2 == 4) {
            fours = fours + 4;
        }
        if (dice3 == 4) {
            fours = fours + 4;
        }
        if (dice4 == 4) {
            fours = fours + 4;
        }
        if (dice5 == 4) {
            fours = fours + 4;
        }
    }
    public void setFives(int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (dice1 == 5) {
            fives = fives + 5;
        }
        if (dice2 == 5) {
            fives = fives + 5;
        }
        if (dice3 == 5) {
            fives = fives + 5;
        }
        if (dice4 == 5) {
            fives = fives + 5;
        }
        if (dice5 == 5) {
            fives = fives + 5;
        }
    }
    public void setSixes(int dice1, int dice2, int dice3, int dice4, int dice5) {
        if (dice1 == 6) {
            sixes = sixes + 6;
        }
        if (dice2 == 6) {
            sixes = sixes + 6;
        }
        if (dice3 == 6) {
            sixes = sixes + 6;
        }
        if (dice4 == 6) {
            sixes = sixes + 6;
        }
        if (dice5 == 6) {
            sixes = sixes + 6;
        }
    }
    public int getScore(String type) {
        if (type.equals("1")) {
            if (player == 1) {
                if (!hasOnes) {
                    //hasOnes = true;
                    return ones;
                } else {
                    return 100;
                }
            }
            else{
                if (!hasOnes2) {
                    //hasOnes = true;
                    return ones;
                } else {
                    return 100;
                }
            }
        }
        else if (type.equals("2")) {
            if (player == 1) {
                if (!hasTwos) {
                    //hasTwos = true;
                    return twos;
                } else {
                    return 100;
                }
            }
            else{
                if (!hasTwos2) {
                    //hasTwos = true;
                    return twos;
                } else {
                    return 100;
                }
            }
        }
        else if (type.equals("3")) {
            if (player == 1) {
                if (!hasThrees) {
                    //hasThrees = true;
                    return threes;
                } else {
                    return 100;
                }
            }
            else{
                if (!hasThrees2) {
                    //hasThrees = true;
                    return threes;
                } else {
                    return 100;
                }
            }
        }
        else if (type.equals("4")) {
            if (player == 1) {
                if (!hasFours) {
                    //hasFours = true;
                    return fours;
                } else {
                    return 100;
                }
            }
            else{
                if (!hasFours2) {
                    //hasFours = true;
                    return fours;
                } else {
                    return 100;
                }
            }
        }
        else if (type.equals("5")) {
            if (player == 1) {
                if (!hasFives) {
                    //hasFives = true;
                    return fives;
                } else {
                    return 100;
                }
            }
            else{
                if (!hasFives2) {
                    //hasFives = true;
                    return fives;
                } else {
                    return 100;
                }
            }
        }
        else if (type.equals("6")) {
            if (player == 1) {
                if (!hasSixes) {
                    //hasSixes = true;
                    return sixes;
                } else {
                    return 100;
                }
            }
            else{
                if (!hasSixes2) {
                    //hasSixes = true;
                    return sixes;
                } else {
                    return 100;
                }
            }
        }
        else{
            return 1;
        }
    }

}
