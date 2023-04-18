package ast.nodes;

import java.util.List;

public class Output extends Inside {

    @Override
    public void generateInside(String path) {

    }
    public Output()
    {
        this.nameTag="";
        this.name="";
        this.type="";
    }

    public Output(Output output)
    {
        this.nameTag=new String(output.getNameTag());
        this.name=new String(output.getName());
        this.type=new String(output.getType());
    }




    @Override
    public void setNameTag(String nameTag) {
        this.nameTag=nameTag;

    }

    @Override
    public void setType(String type) {
        this.type=type;

    }

    @Override
    public void setName(String name) {
     this.name=name;
    }

    @Override
    public List<String> getClasses() {
        return super.getClasses();
    }

    @Override
    public void setClasses(List<String> classes) {
        super.setClasses(classes);
    }

    @Override
    public String getNameTag() {
        return super.getNameTag();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Output{" + "name='" + name + '\'' + ", nameTag='" + nameTag + '\'' + ", type='" + type + '\'' + ", classes=" + classes + '}';
    }
}
