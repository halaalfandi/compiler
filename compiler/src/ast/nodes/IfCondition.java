package ast.nodes;

public class IfCondition extends InsideController
{
    String first,second,operation;


    public IfCondition()
    {
        this.name="if";
    }

    public  IfCondition(IfCondition ifCondition)
    {
        this.first=new String(ifCondition.first);
        this.second=new String(ifCondition.second);
        this.operation=new String(ifCondition.operation);
        this.name=new String(ifCondition.name);
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public void generateInside(String path) {

    }

    @Override
    public String toString() {
        return "IfCondition{" + "first='" + first + '\'' + ", second='" + second + '\'' + ", operation='" + operation + '\'' + ", name='" + name + '\'' + '}';
    }
}
