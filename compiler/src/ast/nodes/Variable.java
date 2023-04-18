package ast.nodes;

public class Variable extends InsideController
{
    String value;

    public Variable()
    {
        this.value="";
        this.name="";
    }

    public Variable(Variable variable)
    {
        this.value=new String(variable.value);
        this.name=new String(variable.name);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void generateInside(String path) {

    }

    @Override
    public String toString() {
        return "Variable{" + "value='" + value + '\'' + ", name='" + name + '\'' + '}';
    }
}
