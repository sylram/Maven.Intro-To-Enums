package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {

    ALICE,
    BOB;

    public String getCatchPhrase() {
        String result = "Hey, my name is ";
        if(isAlice()) {
            result += ALICE+"!";
        }
        else result+= BOB+"!";
        return result;
    }

    public boolean isAlice() {
        return this.equals(ALICE);
    }

    public boolean isBob() {
        return this.equals(BOB);
    }
}
