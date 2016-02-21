package com.mc.command;

public class IncreaseCommand implements Command, CommandFactory {
    public static final String NAME = "increase";
    private int value;

    @Override
    public void execute() {
        System.out.println("Increasing production by " + value);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Command createCommand(String... args) {
        value = Integer.valueOf(args[1]);
        return this;
    }
}
