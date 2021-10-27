package fr.umontpellier.iut.svg;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Style {

    private String fill;
    private String stroke;
    private Double strokeWidth;
    private Double fillOpacity;
    private ArrayList<Transform> transformations = new ArrayList<>();

    public String getFill() {
        return fill;
    }

    public String getStroke() {
        return stroke;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }

    public Double getFillOpacity() {
        return fillOpacity;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    public void setStroke(String stroke) {
        this.stroke = stroke;
    }

    public void setStrokeWidth(Double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public void setFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
    }

    public void addTransform(Transform transform){
        transformations.add(0,transform);
    }

    /**
     * Renvoie la représentation du style sous forme d'une chaîne de caractères qui peut être insérée dans une
     * balise SVG.
     *
     * @return représentation du style au format SVG
     */
    public String toSVG() {
        StringJoiner elements = new StringJoiner(" ");
        if (fill != null) {
            elements.add("fill=\"" + fill + "\"");
        }
        if (stroke != null) {
            elements.add("stroke=\"" + stroke + "\"");
        }
        if (strokeWidth != null) {
            elements.add("stroke-width=\"" + strokeWidth + "\"");
        }
        if (fillOpacity != null) {
            elements.add("fill-opacity=\"" + fillOpacity + "\"");
        }
        if (!transformations.isEmpty()){
            elements.add("transform=\"");
            for(int i =0; i < transformations.size(); i++){
                elements.add(transformations.get(i).toString());
                if(i != transformations.size()-1){
                    elements.add(" ");
                }
            }
            elements.add("\"");
        }

        return elements.toString();
    }
}
