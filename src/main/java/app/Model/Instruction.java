package app.Model;

public class Instruction {
    //Logic
    public static final String XOR = "xor";
    public static final String OR = "or";
    public static final String AND = "and";

    //Aritimetic
    public static final String ADD = "add";
    public static final String SUB = "sub";
    
    //Mult
    public static final String MUL = "mul";
    public static final String DIV = "div";
    public static final String REM = "rem";

    //Detour
    public static final String BEQ = "beq";
    public static final String BNE = "bne";
    public static final String BLT = "blt";
    public static final String BGE = "bge";

    //Load - Store
    public static final String LB = "lb";
    public static final String LW = "lw";
    public static final String SB = "sb";
    public static final String SW = "sw";

    //Arrays
    public static final String[] LOGIC = {XOR, OR, AND};
    public static final String[] ARITIMETIC = {ADD, SUB};
    public static final String[] MULT = {MUL, DIV, REM};
    public static final String[] DETOUR = {BEQ, BNE, BLT, BGE};
    public static final String[] LOAD_STORE = {LB, LW, SB, SW};
}
