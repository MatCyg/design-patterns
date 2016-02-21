package com.mc.command;

public class DecreaseCommand implements Command, CommandFactory {
    private static final String NAME = "decrease";
    private int value;

    @Override
    public void execute() {
        System.out.println("Decreasing production by " + value);
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
