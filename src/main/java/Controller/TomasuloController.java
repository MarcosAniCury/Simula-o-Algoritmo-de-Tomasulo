package Controller;

import Model.Instruction;
import Model.InstructionQueue;
import Model.ReorderBuffer;
import Utils.Arquive;

public class TomasuloController {
    public void runTomasulo() {
        try {
            Arquive arquive = new Arquive("comands.txt");
            InstructionQueue instructionQueue = new InstructionQueue();
            ReorderBuffer reorderBuffer = new ReorderBuffer();

            for (int i = 0; i < 1; i++) {
                Instruction instructionArquive = arquive.get();
                int indexInstructionQueue = instructionQueue.add(instructionArquive);
                reorderBuffer.add(instructionArquive, indexInstructionQueue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
