package com.neha;

public interface Telephone {
    void powerOn();
    void dial(String Number);
    void answer();
    boolean callPhone(String Number);
    boolean isRinging();
}
