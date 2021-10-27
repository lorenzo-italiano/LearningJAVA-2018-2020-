package fr.umontpellier.iut.svg;

import java.util.LinkedList;
import java.util.List;

public abstract class Principaux extends Tag{

    private String name;
    private List<Tag> content;

    public Principaux(String name){
        super(name);
        this.content = new LinkedList<>();
    }

    public void add(Tag t){
        if(!(t instanceof SVG)){
            content.add(t);
        }
    }

    @Override
    public String getContent() {
        StringBuilder builder = new StringBuilder();
        for (Tag t: content) {
            builder.append(t.toSVG());
        }
        return builder.toString();

    }
}
