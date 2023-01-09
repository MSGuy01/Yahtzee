public class lowSection extends displayer {
    private int player;
    public int threeOfAKind;
    public int fourOfAKind;
    public boolean hasThreeOfAKind = false;
    public boolean hasFourOfAKind = false;
    public boolean hasFullHouse = false;
    public boolean hasSmallStraight = false;
    public boolean hasLargeStraight = false;
    public boolean hasYahtzee = false;
    public int chance;

    public lowSection(int player) {
        this.player = player;
    }
    public void setThree(int dice1, int dice2, int dice3, int dice4, int dice5) {
        //134, 135, 145, 245
        //three of a kind:
        if ((dice1 == dice3 && dice1 == dice4) || (dice1 == dice3 && dice1 == dice5) || (dice1 == dice4 && dice1 == dice5) || (dice2 == dice4 && dice2 == dice5) || (dice1 == dice2 && dice1 == dice3) || (dice1 == dice2 && dice1 == dice4) || (dice1 == dice2 && dice1 == dice5) || (dice2 == dice3 && dice2 == dice4) || (dice2 == dice3 && dice2 == dice5) || (dice3 == dice4 && dice3 == dice5)) {
            threeOfAKind = dice1 + dice2 + dice3 + dice4 + dice5;
            hasThreeOfAKind = true;
        } else {
            hasThreeOfAKind = false;
        }
    }
    public void setFour(int dice1, int dice2, int dice3, int dice4, int dice5) {
        //1234, 1345, 1245, 1235, 2345
        //four of a kind:
        if ((dice1 == dice2 && dice1 == dice3 && dice1 == dice4) || (dice1 == dice3 && dice1 == dice4 && dice1 == dice5) || (dice1 == dice2 && dice1 == dice4 && dice1 == dice5) || (dice1 == dice2 && dice1 == dice3 && dice1 == dice5) || (dice2 == dice3 && dice2 == dice4 && dice2 == dice5)) {
            fourOfAKind = dice1 + dice2 + dice3 + dice4 + dice5;
            hasFourOfAKind = true;
        } else {
            hasFourOfAKind = false;
        }
    }
    public void setFull(int dice1, int dice2, int dice3, int dice4, int dice5) {

        // 134 & 25, 135 & 24, 145 & 23, 245 & 13
        //full house:
        if ((dice1 == dice3 && dice1 == dice4 && dice1 != dice2 && dice2 == dice5) || (dice1 == dice3 && dice1 == dice5 && dice1 != dice2 && dice2 == dice4) || (dice1 == dice4 && dice1 == dice5 && dice1 != dice2 && dice2 == dice3) || (dice2 == dice4 && dice2 == dice5 && dice2 != dice1 && dice1 == dice3) || (dice1 == dice2 && dice1 == dice3 && dice1 != dice4 && dice4 == dice5) || (dice1 == dice2 && dice1 == dice4 && dice1 != dice3 && dice3 == dice5) || (dice1 == dice2 && dice1 == dice5 && dice1 != dice3 && dice3 == dice4) || (dice2 == dice3 && dice2 == dice4 && dice2 != dice1 && dice1 == dice5) || (dice2 == dice3 && dice2 == dice5 && dice2 != dice1 && dice1 == dice4) || (dice3 == dice4 && dice3 == dice5 && dice3 != dice1 && dice1 == dice2)) {
            hasFullHouse = true;
        } else {
            hasFullHouse = false;
        }
    }
    public void setSmall(int dice1, int dice2, int dice3, int dice4, int dice5) {
        //small straight:
        if ((dice1 == 1 || dice2 == 1 || dice3 == 1 || dice4 == 1 || dice5 == 1) && (dice1 == 2 || dice2 == 2 || dice3 == 2 || dice4 == 2 || dice5 == 2) && (dice1 == 3 || dice2 == 3 || dice3 == 3 || dice4 == 3 || dice5 == 3) && (dice1 == 4 || dice2 == 4 || dice3 == 4 || dice4 == 4 || dice5 == 4)) {
            hasSmallStraight = true;
        } else if ((dice1 == 2 || dice2 == 2 || dice3 == 2 || dice4 == 2 || dice5 == 2) && (dice1 == 3 || dice2 == 3 || dice3 == 3 || dice4 == 3 || dice5 == 3) && (dice1 == 4 || dice2 == 4 || dice3 == 4 || dice4 == 4 || dice5 == 4) && (dice1 == 5 || dice2 == 5 || dice3 == 5 || dice4 == 5 || dice5 == 5)) {
            hasSmallStraight = true;
        } else if ((dice1 == 3 || dice2 == 3 || dice3 == 3 || dice4 == 3 || dice5 == 3) && (dice1 == 4 || dice2 == 4 || dice3 == 4 || dice4 == 4 || dice5 == 4) && (dice1 == 5 || dice2 == 5 || dice3 == 5 || dice4 == 5 || dice5 == 5) && (dice1 == 6 || dice2 == 6 || dice3 == 6 || dice4 == 6 || dice5 == 6)) {
            hasSmallStraight = true;
        } else {
            hasSmallStraight = false;
        }
    }
    public void setLarge(int dice1, int dice2, int dice3, int dice4, int dice5) {
        //large straight:
        if ((dice1 == 1 || dice2 == 1 || dice3 == 1 || dice4 == 1 || dice5 == 1) && (dice1 == 2 || dice2 == 2 || dice3 == 2 || dice4 == 2 || dice5 == 2) && (dice1 == 3 || dice2 == 3 || dice3 == 3 || dice4 == 3 || dice5 == 3) && (dice1 == 4 || dice2 == 4 || dice3 == 4 || dice4 == 4 || dice5 == 4) && (dice1 == 5 || dice2 == 5 || dice3 == 5 || dice4 == 5 || dice5 == 5)) {
            hasLargeStraight = true;
        } else if ((dice1 == 6 || dice2 == 6 || dice3 == 6 || dice4 == 6 || dice5 == 6) && (dice1 == 2 || dice2 == 2 || dice3 == 2 || dice4 == 2 || dice5 == 2) && (dice1 == 3 || dice2 == 3 || dice3 == 3 || dice4 == 3 || dice5 == 3) && (dice1 == 4 || dice2 == 4 || dice3 == 4 || dice4 == 4 || dice5 == 4) && (dice1 == 5 || dice2 == 5 || dice3 == 5 || dice4 == 5 || dice5 == 5)) {
            hasLargeStraight = true;
        } else {
            hasLargeStraight = false;
        }
    }
    public void setYahtzee(int dice1, int dice2, int dice3, int dice4, int dice5) {
        //yahtzee:
        if (dice1 == dice2 && dice1 == dice3 && dice1 == dice4 && dice1 == dice5) {
            hasYahtzee = true;
        }
        else{
            hasYahtzee = false;
        }
    }
    public void setChance(int dice1, int dice2, int dice3, int dice4, int dice5) {

        chance = dice1 + dice2 + dice3 + dice4 + dice5;
    }
    public int getScore(String type) {
        if (type.equals("three")) {
            if (player == 1) {
                if (!hasDoneThreeOfAKind) {
                    if (hasThreeOfAKind) {
                        return threeOfAKind;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
            else{
                if (!hasDoneThreeOfAKind2) {
                    if (hasThreeOfAKind) {
                        return threeOfAKind;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
        }
        else if (type.equals("four")) {
            if (player == 1) {
                if (!hasDoneFourOfAKind) {
                    if (hasFourOfAKind) {
                        return fourOfAKind;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
            else{
                if (!hasDoneFourOfAKind2) {
                    if (hasFourOfAKind) {
                        return fourOfAKind;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
        }
        else if (type.equals("full")) {
            if (player == 1) {
                if (!hasDoneFullHouse) {
                    if (hasFullHouse) {
                        return 25;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
            else{
                if (!hasDoneFullHouse2) {
                    if (hasFullHouse) {
                        return 25;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
        }
        else if (type.equals("small")) {
            if (player == 1) {
                if (!hasDoneSmallStraight) {
                    if (hasSmallStraight) {
                        return 30;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
            else{
                if (!hasDoneSmallStraight2) {
                    if (hasSmallStraight) {
                        return 30;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
        }
        else if (type.equals("large")) {
            if (player == 1) {
                if (!hasDoneLargeStraight) {
                    if (hasLargeStraight) {
                        return 40;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
            else{
                if (!hasDoneLargeStraight2) {
                    if (hasLargeStraight) {
                        return 40;
                    } else {
                        return 0;
                    }
                } else {
                    return 1000;
                }
            }
        }
        else if (type.equals("yahtzee")) {
            if (player == 1) {
                if (!hasDoneYahtzee) {
                    if (hasYahtzee) {
                        return 50;
                    } else {
                        return 0;
                    }
                } else {
                    if (hasYahtzee) {
                        return 100;
                    } else {
                        return 0;
                    }
                }
            }
            else{
                if (!hasDoneYahtzee2) {
                    if (hasYahtzee) {
                        return 50;
                    } else {
                        return 0;
                    }
                } else {
                    if (hasYahtzee) {
                        return 100;
                    } else {
                        return 0;
                    }
                }
            }
        }
        else if (type.equals("chance")) {
            if (player == 1) {
                if (!hasChance) {
                    return chance;
                } else {
                    return 1000;
                }
            }
            else{
                if (!hasChance2) {
                    return chance;
                } else {
                    return 1000;
                }
            }
        }
        else{
            return 1000;
        }
    }
}
