package com.bytelegend;

public interface Challenge {
    /** Gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z. */
    long currentTimeSecond() {
        return System.currentTimeMillis() / 1000;
    }

    static void main(String[] args) {
        System.out.println(Challenge.currentTimeSecond());
    }
}
