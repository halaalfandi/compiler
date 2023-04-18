package ast.nodes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Select extends Input {

    List<Option> options=new ArrayList<Option>();
    @Override
    public void generateInside(String path) {

        try {
            FileWriter fw=new FileWriter(path,true);
            fw.write("<label>"+"Select"+ this.name+":</label><br>\n" +
                    "<select  style=\"width: 222%;\" name=\""+this.name+"\" class=\"form-control rounded-left\"><br><br>\n\n"
                    );
            fw.close();
                for(int i=0;i<options.size();i++)
                {
              options.get(i).generateOption(path);
                }

            fw=new FileWriter(path,true);
            fw.write("</select><br><br>\n");
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }



    public Select() {
        super();
    }

    public Select(Select select) {
        this.name=new String(select.name);
        this.nameTag=new String(select.nameTag);
        this.type=new String(select.type);
        this.classes=select.classes;
        this.options = select.options;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Select{" + "options=" + options + ", name='" + name + '\'' + ", nameTag='" + nameTag + '\'' + ", type='" + type + '\'' + ", classes=" + classes + '}';
    }
}
