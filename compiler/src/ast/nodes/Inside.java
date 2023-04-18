package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public abstract class Inside {
    String name,nameTag,type;
    List <String> classes=new ArrayList<String>() ;

    public abstract void setNameTag(String nameTag) ;

    public abstract void setType(String type) ;

    public abstract void setName(String name) ;

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public String getNameTag() {
        return nameTag;
    }

    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }


    public abstract void generateInside(String path);
}
