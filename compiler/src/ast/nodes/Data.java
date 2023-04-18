package ast.nodes;

import java.util.*;

public class Data extends Inside {

    Map<String,String> map=new HashMap<String, String>();
    public Data()
    {
        this.nameTag="";
        this.name="";
        this.type="";
    }

    public Data(Data data)
    {
        this.nameTag=new String(data.getNameTag());
        this.name=new String(data.getName());
        this.type=new String(data.getType());
        this.map=data.map;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
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
    public List<String> getClasses() {
        return super.getClasses();
    }

    @Override
    public void setClasses(List<String> classes) {
        super.setClasses(classes);
    }
    @Override
    public String toString() {
        return "Data{" + "nameTag='" + nameTag + '\'' + ", type='" + type + '\'' + ", map=" + map + '}';
    }

    @Override
    public void generateInside(String path) {

    }
}
