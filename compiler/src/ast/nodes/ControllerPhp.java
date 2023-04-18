package ast.nodes;

import com.company.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ControllerPhp {
    Integer id ,idPage;
    String name,namePage;
    List<InsideController>insideControllers=new ArrayList<InsideController>();


    public ControllerPhp()
    {


    }

    public ControllerPhp(ControllerPhp controller)
    {
        this.id=controller.id;
        this.name=new String(controller.name);
        this.idPage=controller.idPage;
        this.namePage=new String(controller.namePage);
        this.insideControllers=controller.insideControllers;
    }

    public List<InsideController> getInsideControllers() {
        return insideControllers;
    }

    public void setInsideControllers(List<InsideController> insideControllers) {
        this.insideControllers = insideControllers;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPage() {
        return idPage;
    }

    public void setIdPage(Integer idPage) {
        this.idPage = idPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePage() {
        return namePage;
    }

    public void setNamePage(String namePage) {
        this.namePage = namePage;
    }



    public void generateController()
    {
        try {
            File file=new File(Main.path +this.name+".php");
            boolean result;
            result=file.createNewFile();
            String path=Main.path +this.name+".php";
            FileWriter fw=new FileWriter(path,true);

            fw.write( "<?php \n" );
            fw.close();

            for(int i=0;i<insideControllers.size();i++)
            {
             insideControllers.get(i).generateInside(path);
            }

            }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Controller{" + "id=" + id + ", idPage=" + idPage + ", name='" + name + '\'' + ", namePage='" + namePage + '\'' + ", insideControllers=" + insideControllers + '}';
    }
}
