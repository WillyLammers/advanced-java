package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import edu.wgu.d387_sample_code.i18n.DisplayMessage;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);

		DisplayMessage displayMessageEnglish = new DisplayMessage(Locale.US);
		Thread englishWelcomeThread = new Thread(displayMessageEnglish);
		englishWelcomeThread.start();

		DisplayMessage displayMessageFrench = new DisplayMessage(Locale.CANADA_FRENCH);
		Thread frenchWelcomeThread = new Thread(displayMessageFrench);
		frenchWelcomeThread.start();
	}

}
