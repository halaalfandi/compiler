package ast.nodes;

import com.company.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Head {
    String type;
    String path;

    public  Head()
    {
        this.path="";
        this.type="";
    }

    public  Head(Head head)
    {
        this.path=new String(head.path);
        this.type=new String(head.type);
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Head{" + "type='" + type + '\'' + ", path='" + path + '\'' + '}';
    }


    public void generateHead(String path)
    {

        try {

            FileWriter fw=new FileWriter(path,true);
            if(this.type.compareToIgnoreCase("css")==0)
            {
                fw.write("<link href=\""+this.path+".css\" rel=\"stylesheet\">\n");
            }

            if(this.type.compareToIgnoreCase("script")==0)
            {
                fw.write("<script src=\""+this.path+".js\"></script>\n\n");
            }
            fw.close();
            }catch (IOException e) {
            e.printStackTrace();
        }



    }
}
