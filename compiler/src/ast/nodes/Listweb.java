package ast.nodes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Listweb extends Inside {
    List<String> list = new ArrayList<String>();

    @Override
    public void generateInside(String path) {
        try {
            FileWriter fw=new FileWriter(path,true);
            fw.write("<h3>LIST</h3>\n<ul>\n");
            for(int i=0;i<this.list.size();i++)
            {
                fw.write("<li>"+this.list.get(i)+ "</li>\n");
            }

            fw.write("</ul>\n");
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Listweb()
    {
    }

    public Listweb(Listweb listweb)
    {
        this.type=listweb.type;
        this.nameTag=listweb.nameTag;
        this.name=listweb.name;
        this.classes=listweb.classes;
        this.list=listweb.list;

    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
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
    public void setNameTag(String nameTag) {
        this.nameTag=nameTag;
    }

    @Override
    public void setType(String type) {
  this.type=type;
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
        return "Listweb{" + "list=" + list + '}';
    }
}
