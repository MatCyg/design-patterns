package com.mc;

import com.mc.command.Command;

public class CommandExecutor {

    private static final CommandParser commandParser = new CommandParser();

    public static void main(String[] args) {
        final Command command = commandParser.parseArgs(args);
        command.execute();
    }

}
