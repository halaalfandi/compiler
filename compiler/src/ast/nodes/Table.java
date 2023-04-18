package ast.nodes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Table extends  Inside {
    List<String> headTable=new ArrayList<String>();
    List<List<String >> rows=new ArrayList<List<String>>();

    public List<String> getHeadTable() {
        return headTable;
    }

    public  Table()
    {

    }


    public Table(Table table)
    {
    this.nameTag=table.nameTag;
    this.type=table.type;
    this.name=table.name;
    this.headTable=table.headTable;
    this.rows=table.rows;
    }

    public void setHeadTable(List<String> headTable) {
        this.headTable = headTable;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    public void setRows(List<List<String>> rows) {
        this.rows = rows;
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
        return "Table{" + "headTable=" + headTable + ", rows=" + rows + ", name='" + name + '\'' + ", nameTag='" + nameTag + '\'' + ", type='" + type + '\'' + ", classes=" + classes + '}';
    }

    @Override
    public void generateInside(String path) {

        try {
            FileWriter fw=new FileWriter(path,true);
            fw.write("<table border=\"1\">  \n<br>\n"+"<tr>\n");
            for(int i=0;i<headTable.size();i++)
            {
                fw.write("<th>"+this.headTable.get(i)+"</th><br>\n");
            }

             fw.write("</tr><br>\n");
            for(int i=0;i<this.rows.size();i++)
            {
                   fw.write("<tr>\n");
                   for(int  j=0;j<this.rows.get(i).size();j++)
                    fw.write("<td>"+this.rows.get(i).get(j)+"</td>\n");
                    fw.write("</tr>\n");

            }

            fw.write("</table><br><br>\n");
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
