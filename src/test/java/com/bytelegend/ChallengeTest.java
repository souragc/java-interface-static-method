package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;

public class ChallengeTest {
    @Test
    public void test() {
        Assertions.assertTrue(
                Math.abs(Challenge.currentTimeSecond() - Instant.now().getEpochSecond()) < 2);
    }
}
