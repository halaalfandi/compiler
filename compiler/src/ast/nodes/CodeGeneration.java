package ast.nodes;

public class CodeGeneration {
    Language program;

    public CodeGeneration(Language program) {
        this.program = program;
    }

    public Language getProgram() {
        return program;
    }

    public void setProgram(Language program) {
        this.program = program;
    }


}
