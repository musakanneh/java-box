package com.javabox.oop;

public class UIControl {

    private boolean isEnabled = true;

    // generic method to render control objects
    // what if we make this abstract?
    public void render() {}

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
