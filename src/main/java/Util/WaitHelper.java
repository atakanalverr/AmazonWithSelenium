package Util;

public class WaitHelper {
    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//Bu class'ı; otomasyonun koştuğu her step'in arasına belirttiğim saniyeyi koyması için açtım.