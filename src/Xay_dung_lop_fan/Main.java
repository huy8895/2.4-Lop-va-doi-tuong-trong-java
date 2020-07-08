package Xay_dung_lop_fan;

import com.sun.org.apache.bcel.internal.generic.FASTORE;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setSpeed(1);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        fan2.setOn(false);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
