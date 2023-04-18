package ast.nodes;

import com.company.Main;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Page  {
    Integer id;
    String name;
    List<Head>heads;
    List<Inside>insides;
    List <Integer> extend=new ArrayList<Integer>();
    public Page()
    {
        this.id=0;
        this.name="";
        this.insides=new ArrayList<Inside>();
        this.heads=new ArrayList<Head>();
    }

   public Page(Page page)
   {
       this.id=page.id;
       this.name=new String(page.name);
       this.insides=page.insides;
       this.heads=page.heads;
       this.extend=page.extend;
   }


    public List<Integer> getExtend() {
        return extend;
    }

    public void setExtend(List<Integer> extend) {
        this.extend = extend;
    }

    public List<Head> getHeads() {
        return heads;
    }

    public void setHeads(List<Head> heads) {
        this.heads = heads;
    }

    public List<Inside> getInsides() {
        return insides;
    }

    public void setInsides(List<Inside> insides) {
        this.insides = insides;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
      //  generateHtml();
    }


    public void generateHtml()
    {
             boolean form=false;
            try {
                File file=new File(Main.path +this.name+".html");
                boolean result;
                result=file.createNewFile();
                String path=Main.path +this.name+".html";
                FileWriter fw=new FileWriter(path,true);

                    fw.write( "<!DOCTYPE html>\n" + "<html lang=\"en\">\n" );
                    fw.write("<head>\n" +
                            "    <meta charset=\"utf-8\">\n" +
                            "    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n" + "\n" +
                            "    <title>  "+this.name+"</title>\n" + "    <meta content=\"\" name=\"description\">\n" +
                            "    <meta content=\"\" name=\"keywords\">\n    <link rel=\"stylesheet\" href=\"bootstrap.min.css\">\n");
                  fw.close();
                for (int i=0;i<heads.size();i++)
               {
                  // System.out.println(heads.get(i));
                   heads.get(i).generateHead(path);
               }
                 fw=new FileWriter(path,true);
                fw.write( "</head>\n<body>\n" );
                    fw.close();
                    int i=0;
                for ( i=0;i<insides.size();i++)
                {
                    System.out.println("/********* "+ insides.get(i).getNameTag());


                    if(insides.get(i).getNameTag().compareTo("input")==0 && form==false && insides.get(i).getType().compareTo("select")!=0)
                    {
                        fw=new FileWriter(path,true);

                        String page;
                        if(Language.map.get(this.name)!=null)
                             page=new String(Language.map.get(this.name).getName());
                        else
                              page="";
                        fw.write( "<form method=\"post\" action=\""+page+".php\"  class=\"login-form\" style=\"margin-left: 34%;\n" + "margin-top: 100px;\">\n" );
                        fw.close();
                        form=true;
                    }

                    if(insides.get(i).getNameTag().compareTo("input")!=0 && form==true && insides.get(i).getType().compareTo("select")!=0)
                    {
                        fw=new FileWriter(path,true);
                        fw.write( "<br><br>\n" + "  <input type=\"submit\" value=\"Submit\">\n" + "</form> \n" );
                        fw.close();
                        form=false;
                    }
                insides.get(i).generateInside(path);
                }
                if(insides.get(i-1).getNameTag().compareTo("input")==0 && form==true)
                {
                    fw=new FileWriter(path,true);
                    fw.write( "   <input  style=\"margin-left: 60%;\" type=\"submit\" value=\"Submit\" class=\"form-control btn btn-primary rounded submit px-3\">\n\n" + "</form> \n" );
                    fw.close();
                    form=false;
                }
                fw=new FileWriter(path,true);
                fw.write( "</body>\n" );
               fw.close();

            }catch (IOException e) {
                e.printStackTrace();
            }



    }



    @Override
    public String toString() {
        return "Page{" + "id=" + id + ", name='" + name + '\'' + ", heads=" + heads + ", insides=" + insides + ", extend=" + extend + '}';
    }

    public void codeGeneration()
    {

    }
}
