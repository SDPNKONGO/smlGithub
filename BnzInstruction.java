package sml;

/**
 * This class ....
 *
 * @author someone
 */

public class BnzInstruction extends Instruction {
    private int register;
    private String value;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String value) {
        super(label, "bnz");
        this.register = register;
        this.value = value;

    }

	@Override
	public void execute(Machine m) {

		int pc = 0;

		for (Instruction Ins1 : m.getProg()) {

			if (Ins1.label.equals(value)) {

				m.setPc(pc);
    
			}
			pc = pc + 1;
		}


	}

    @Override
    public String toString() {
        return super.toString() + " register " + register + " value is " + value;
    }
}
