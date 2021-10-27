package fr.umontpellier.iut.svg;

public class AppSVG {
    public static void main(String[] args) {
        /*SVG svg = new SVG(100,100);
        Circle c1 = new Circle(0,0,40);
        svg.add(c1);
        Rectangle r1 = new Rectangle(50,50,20,20);
        svg.add(r1);
        svg.saveAsFile("photoshopv2.svg");*/

//        SVG svg = new SVG(100,100);
//        Circle c1 = new Circle(0,0,40);
//        Rectangle r1 = new Rectangle(50,50,20,20);
//        Style s1 = new Style();
//        s1.setFill("green");
//        s1.setStroke("blue");
//        r1.setStyle(s1);
//        Style s2 = new Style();
//        s2.setFill("red");
//        s2.setStroke("black");
//        c1.setStyle(s2);
//        svg.add(r1);
//        svg.add(c1);
//        svg.saveAsFile("photoshopv2.svg");

        //Question 13
        SVG Q13 = new SVG(1000.0,1000.0);
        Style style_r1 = new Style();
        style_r1.setFill("lightblue");
        Rectangle r1 = new Rectangle(0,0,1000.0,1000.0);
        r1.setStyle(style_r1);
        Q13.add(r1);
        Group group1 = new Group();
        Style style_group1 = new Style();
        style_group1.setStroke("black");
        style_group1.setStrokeWidth(20.0);
        style_group1.setFillOpacity(0.8);
        group1.setStyle(style_group1);
        Rectangle r2 = new Rectangle(100.0, 100.0 , 200.0, 200.0);
        Style style_r2 = new Style();
        style_r2.setFill("#080");
        r2.setStyle(style_r2);
        group1.add(r2);
        Rectangle r3 = new Rectangle(200.0, 200.0 , 400.0, 400.0);
        Style style_r3 = new Style();
        style_r3.setFill("#0C0");
        r3.setStyle(style_r3);
        group1.add(r3);
        Group group2 = new Group();
        Style styleg2 = new Style();
        Transform translateg2 = new Translate(0.0, 700.0);
        Transform rotateg2 = new Rotate(-45, 100, 50);
        styleg2.addTransform(translateg2);
        styleg2.addTransform(rotateg2);
        group2.setStyle(styleg2);
        Rectangle r4 = new Rectangle(100.0, 100.0 , 200.0, 200.0);
        Style style_r4 = new Style();
        style_r4.setFill("#800");
        r4.setStyle(style_r4);
        group2.add(r4);
        Rectangle r5 = new Rectangle(200.0, 200.0 , 400.0, 400.0);
        Style style_r5 = new Style();
        style_r5.setFill("#C00");
        r5.setStyle(style_r5);
        group2.add(r5);
        group1.add(group2);
        Q13.add(group1);
        Q13.saveAsFile("Question13.svg");

        //Question 14
        SVG Q14 = new SVG(1000.0,1000.0);
        Group group = new Group();
        Style stylegroup1 = new Style();
        stylegroup1.setFillOpacity(0.5);
        stylegroup1.setStroke("black");
        stylegroup1.setStrokeWidth(12.5);
        group.setStyle(stylegroup1);

        Circle circle1 = new Circle(300.0,350.0,275);
        Style stylec1 = new Style();
        stylec1.setFill("green");
        circle1.setStyle(stylec1);
        Circle circle2 = new Circle(650.0,350.0,275);
        Style stylec2 = new Style();
        stylec2.setFill("blue");
        circle2.setStyle(stylec2);
        Circle circle3 = new Circle(475.0,625.0,275);
        Style stylec3 = new Style();
        stylec3.setFill("red");
        circle3.setStyle(stylec3);
        group.add(circle1);
        group.add(circle2);
        group.add(circle3);
        Q14.add(group);
        Q14.saveAsFile("Question14.svg");
    }
}
