package com.icloud.command.after;

import com.icloud.command.before.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        new LightOnCommand(this.light).execute();
    }
}
