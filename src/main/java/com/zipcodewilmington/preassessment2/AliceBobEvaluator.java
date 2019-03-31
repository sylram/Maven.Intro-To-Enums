package com.zipcodewilmington.preassessment2;



public class AliceBobEvaluator {

    String input;

    public AliceBobEvaluator(String input) {
        this.input = input;

    }

    public boolean isAlice() {

        return this.input.equalsIgnoreCase(AliceBobEnum.ALICE.name());


    }

    public boolean isBob() {
        return input.equalsIgnoreCase(AliceBobEnum.BOB.name());
    }

}
