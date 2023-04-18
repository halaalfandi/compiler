package ast.nodes;

public class Print extends InsideController {

    String statment;

    @Override
    public void generateInside(String path)
    {

    }

    public Print()
    {

    }
    public Print(Print printController)
    {
        this.statment=printController.getStatment();
    }
    public String getStatment() {
        return statment;
    }

    public void setStatment(String statment) {
        this.statment = statment;
    }

    @Override
    public String toString() {
        return "Print{" + "statment='" + statment + '\'' + '}';
    }
}
