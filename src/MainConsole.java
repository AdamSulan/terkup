/*
* File: MainConsole.java
* Author: Sulan Ádám
* Copyright: 2023, Sulan Ádám
* Group: Szoft I-1-N
* Date: 2023-02-13
* Github: https://github.com/AdamSulan/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        this.about();
        System.out.println("Szia :D");
        String radiusStr = input("Sugár: ");
        String heightStr = input("Magasság: ");
        double radius=Double.parseDouble(radiusStr);
        double height=Double.parseDouble(heightStr);
        Cone cone =new Cone();
        System.out.println(cone.calcVolume(radius, height));
    }
    public String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        String text = scanner.nextLine();
        return text;
    }
    public void about(){
        System.out.println("--------------------");
        System.out.println("     Sulan Ádám     ");
        System.out.println("----SZOFT I-1-N-----");
        System.out.println("-----2023-02-13-----");
        System.out.println("--------------------");
    }
}
