package ast.nodes;

import com.company.Main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Input extends Inside {

    public Input()
    {
        this.nameTag="";
        this.name="";
        this.type="";
    }

    public Input(Input input)
    {
        this.nameTag=new String(input.getNameTag());
        this.name=new String(input.getName());
        this.type=new String(input.getType());
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
        return "Input{" + "name='" + name + '\'' + ", nameTag='" + nameTag + '\'' + ", type='" + type + '\'' + ", classes=" + classes + '}';
    }

    @Override
    public void generateInside(String path) {
        try {
            FileWriter fw=new FileWriter(path,true);
            if(this.type.compareTo("radio")==0||this.type.compareTo("checkbox")==0)
            {
                fw.write("  <input style=\"width: 222%;\"  class=\"form-control rounded-left\" type=\""+this.type+"\" name=\""+this.name+"\" value=\""+this.name+"\" > Male<br>\n");
            }


            else
            {
                if(this.type.compareTo("field")==0)
                {
                    fw.write("<label>"+this.name+": </lable><br />\n" + "  <input style=\"width: 222%;\"  class=\"form-control rounded-left\"  type=\"text\" name=\""+this.name+"\"  ><br><br>\n");
                }

                else
                {

                    if(this.type.compareTo("text")==0)
                    {
                        fw.write("<label>"+this.name+": </lable><br />\n" + "  <textarea style=\"width: 222%;\"   class=\"form-control rounded-left\" type=\"text\" name=\""+this.name+"\"  ></textarea><br><br>\n");
                    }
                    else{
                        fw.write("<label>"+this.name+": </lable><br />\n" +
                                "<input  style=\"width: 222%;\"   class=\"form-control rounded-left\" type=\""+this.type+"\" name=\""+this.name+"\"><br><br>\n");
                    }
                }
            }
            fw.close();

           }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
