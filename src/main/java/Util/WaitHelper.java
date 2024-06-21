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

/*
    WaitHelper class'ı, belirtilen süre kadar beklemek için kullanılan yardımcı bir sınıftır.
    İşlevi oldukça basittir: verilen süre kadar (saniye cinsinden) beklemeyi sağlar.
 */