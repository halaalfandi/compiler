package ast.nodes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IfVeriable extends InsideController
{
    public IfVeriable()
    {

    }
    public IfVeriable(IfVeriable ifVeriable)
    {
    this.valid=ifVeriable.valid;
    }

    List<String>valid=new ArrayList<String>();

    public List<String> getValid() {
        return valid;
    }

    public void setValid(List<String> valid) {
        this.valid = valid;
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
    public void generateInside(String path)
    {
        boolean email=false,password=false;

        try {
            FileWriter fw = new FileWriter(path, true);
            for (int i = 0; i < valid.size(); i++) {
                fw.write("$" + valid.get(i) + "= $_POST[\"" + valid.get(i) + "\"];" +
                        " \n");

                if( valid.get(i).compareTo("email")==0)
                {
                  email=true;
                }

                if( valid.get(i).compareTo("password")==0)
                {
                    password=true;
                }

            }

            if(email&&password)
            {
                fw.write("if($_POST[\"email\"]==\"admin@admin.com\" &&  $_POST[\"password\"]==\"admin\")\n" + "return include(\"admin.html\");\n" + "else include(\"user.html\");" +
                        " \n");
            }
            fw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "IfVeriable{" + "valid=" + valid + '}';
    }
}
