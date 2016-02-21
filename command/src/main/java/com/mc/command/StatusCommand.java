package com.mc.command;

public class StatusCommand implements Command, CommandFactory {
    private static final String NAME = "status";

    public void execute() {
        System.out.println("Power plant status: OK");
    }

    public String getName() {
        return NAME;
    }

    public Command createCommand(String... args) {
        return this;
    }
}
