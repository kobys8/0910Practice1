/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0910practice1;

/**
 *
 * @author kms080
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

class Clockers {
    private int hour, minute;
    public Clockers() {
        hour = 0;
        minute = 0;
    }
    public Clockers(int h, int m) {
        hour = h;
        minute = m;
    }
    String returnTime() {
        return Integer.toString(hour) + " : " + Integer.toString(minute);
    }
    void setTime(int h, int m) {
        hour = h;
        minute = m;
    }
}