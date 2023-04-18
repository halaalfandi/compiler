package ast.nodes;

import javax.crypto.spec.OAEPParameterSpec;
import java.io.FileWriter;
import java.io.IOException;

public class Option {
    String name;

    public Option()
    {
        this.name="";
    }

    public Option(Option option)
    {
        this.name=new String(option.getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Option{" + "name='" + name + '\'' + '}';
    }

    public void generateOption(String path) {

        try {
            FileWriter fw=new FileWriter(path,true);
            fw.write(" <option value=\""+this.name+"\">"+this.name+"</option>\n");
            fw.close();

           }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
