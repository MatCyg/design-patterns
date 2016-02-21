package com.mc.command;

public interface CommandFactory {
    String getName();

    Command createCommand(String... args);
}
