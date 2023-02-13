/*
* File: Cone.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1-N
* Date: 2023-02-13
* Github: https://github.com/AdamSulan/
* Licenc: GNU GPL
*/

public class Cone {
    public double calcVolume(double radius, double height) {
        double result=1.0/3.0*Math.pow(radius, 2)*height*Math.PI;
        return result;
    }
}
