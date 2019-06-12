package com.company;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;


    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+ phoneNumber+"on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging=true;
            System.out.println("Ring Ring");
        }else {
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
