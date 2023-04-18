package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public abstract class InsideController {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void generateInside(String path);
}
