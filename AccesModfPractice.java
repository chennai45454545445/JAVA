package com.company;
class Cylinder{
    private int radius;
    private int height;
    private float volume;
    private float curvesurface;
    private float Totalsurfacearea;
    float pie=3.14f;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void getVolume() {
        volume=pie*radius*radius*height;
        System.out.println("VOLUME IS:"+volume);

    }
    public void getCurvesurface() {
        curvesurface=2*pie*radius*height;
        System.out.println("CURVESURFACE AREA IS :"+curvesurface);

    }

    public void getTotalsurfacearea() {
        Totalsurfacearea=(2*pie*radius*height)+(2*pie*radius*radius);
        System.out.println("TOTAL SURFACE AREA:"+Totalsurfacearea);

    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
        volume=pie*radius*radius*height;
        System.out.println("VOLUME IS:"+volume);
        curvesurface=2*pie*radius*height;
        System.out.println("CURVESURFACE AREA IS :"+curvesurface);
        Totalsurfacearea=(2*pie*radius*height)+(2*pie*radius*radius);
        System.out.println("TOTAL SURFACE AREA:"+Totalsurfacearea);

    }
}

public class AccesModfPractice {
    public static void main(String[] args) {
        Cylinder mycylinder=new Cylinder(10,20);
//        //PROBLEM 1
//        mycylinder.setRadius(10);
//        mycylinder.setHeight(20);
//        //PROBLEM 2
//        mycylinder.getVolume();
//        mycylinder.getCurvesurface();
//        mycylinder.getTotalsurfacearea();


    }

}
