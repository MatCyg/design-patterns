package com.mc.command;

public class AlarmCommand implements Command, CommandFactory {
    private final String NAME = "alarm";

    @Override
    public void execute() {
        System.out.println("ALARM invoked. Please evacuate.");
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
