package encapPackage2;

import  encapPackage1.AreaRectangle;



public class AreaRectangle1 extends AreaRectangle{

    public static void main(String[]aaaa){
        AreaRectangle obj = new AreaRectangle();
        obj . setL(100);
        obj .setB(50);

        int area = obj.getArea();
        System.out.println("Area of a Rectangle is equal to "+area);


    }

}
