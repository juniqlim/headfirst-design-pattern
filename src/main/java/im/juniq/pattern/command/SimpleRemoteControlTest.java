package im.juniq.pattern.command;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setSlot(lightOnCommand);
        remote.buttonWasPressed();
        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}