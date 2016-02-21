package com.mc.command;

public class StopCommand implements Command, CommandFactory {
    private static final String NAME = "stop";

    @Override
    public void execute() {
        System.out.println("Stop invoked. All generators will stop production.");
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Command createCommand(String... args) {
        return this;
    }
}
