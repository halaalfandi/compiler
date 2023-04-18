package ast.nodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Language {

    private List<Page> pages;
    private List<ControllerPhp> controllers;
    public static Map<String, ControllerPhp> map=new HashMap<String, ControllerPhp>();


    public Language() {
        this.pages = new ArrayList<Page>();
        this.map = new HashMap<String, ControllerPhp>();
        this.controllers = new ArrayList<ControllerPhp>();
    }

    public List<ControllerPhp> getControllers() {
        return controllers;
    }

    public void setControllers(List<ControllerPhp> controllers) {
        this.controllers = controllers;
    }

    public Map<String, ControllerPhp> getMap() {
        return map;
    }

    public void setMap(Map<String, ControllerPhp> map) {
        this.map = map;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }


    @Override
    public String toString() {
        return "Language{" + "pages=" + pages + ", controllers=" + controllers + ", map=" + map + '}';
    }

    public  void generate()
    {
        for(int i=0;i<this.getPages().size();i++)
        this.getPages().get(i).generateHtml();


        for(int i=0;i<this.getControllers().size();i++)
            this.getControllers().get(i).generateController();

    }
}