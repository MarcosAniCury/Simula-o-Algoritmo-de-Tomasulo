package Model;

import Constants.BufferInstruction.StateEnum;
import Controller.RegisterController;

public class BufferInstruction {
    private Instruction instruction;
    private StateEnum state;
    private String value;
    private int indexInstructionQueue;
    private Register registerDestination;

    public BufferInstruction(Instruction instruction, int indexInstructionQueue) throws Exception {
        this.instruction = instruction;
        this.state = StateEnum.STATE_ISSUE;
        this.value = "";
        this.indexInstructionQueue = indexInstructionQueue;
        this.registerDestination = RegisterController.findRegisterBasedInName(instruction.getOption1());
    }

    public Instruction getInstruction() {
        return this.instruction;
    }

    public int getIndexInstructionQueue() {
        return this.indexInstructionQueue;
    }

    public StateEnum getState() {
        return this.state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Register getRegisterDestination() {
        return this.registerDestination;
    }

    public String getValue() {
        return value;
    }
}
