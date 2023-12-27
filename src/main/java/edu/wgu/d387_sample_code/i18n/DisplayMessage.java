package edu.wgu.d387_sample_code.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayMessage implements Runnable {

    Locale locale;

    // Constructor
    public DisplayMessage(Locale locale) {
        this.locale = locale;
    }

    public String getDisplayMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("translation",locale);
        return bundle.getString("welcome");
    }

    @Override
    public void run() {
        System.out.println( "Thread verification: " + getDisplayMessage() + ", ThreadID: " + Thread.currentThread().getId() );
    }
}