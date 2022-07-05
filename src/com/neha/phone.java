package com.neha;

public class phone implements Telephone {
    private String myNumber;
    private boolean isRinging;
    public phone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always on!");
    }

    @Override
    public void dial(String Number) {
        System.out.println("Now ringing " +Number+" on desk phone.");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
            isRinging=false;
        }
        else System.out.println("Not ringing");
    }

    @Override
    public boolean callPhone(String Number) {
        if (Number==myNumber){
            isRinging=true;
            System.out.println("Phone ringing");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

