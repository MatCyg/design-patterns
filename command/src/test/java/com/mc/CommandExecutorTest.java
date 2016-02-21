package com.mc;

import org.junit.Test;

public class CommandExecutorTest {

    private void testWithArgs(String... args) {
        CommandExecutor.main(args);
    }

    @Test
    public void testStatus() throws Exception {
        testWithArgs("status");
    }
    @Test
    public void testIncrease() throws Exception {
        testWithArgs("increase", "10");
    }
    @Test
    public void testDecrease() throws Exception {
        testWithArgs("decrease", "20");
    }
    @Test
    public void testStop() throws Exception {
        testWithArgs("stop");
    }
    @Test
    public void testAlarm() throws Exception {
        testWithArgs("alarm");
    }

}
