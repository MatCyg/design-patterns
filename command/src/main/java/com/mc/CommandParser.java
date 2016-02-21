package com.mc;

import com.google.common.collect.Lists;
import com.mc.command.*;

import java.util.List;

public class CommandParser {

    private final int COMMAND_NAME_POSITION = 0;
    private static final List<CommandFactory> commands =
            Lists.newArrayList(
                    new AlarmCommand(),
                    new DecreaseCommand(),
                    new IncreaseCommand(),
                    new StatusCommand(),
                    new StopCommand());

    Command parseArgs(String[] args) {
        final String commandName = args[COMMAND_NAME_POSITION];
        return findCommand(commandName).createCommand(args);
    }

    private CommandFactory findCommand(String commandName) {
        return commands.stream().filter(c -> c.getName().equals(commandName)).findFirst().get();
    }
}
