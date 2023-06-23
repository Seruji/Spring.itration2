package itration.itration2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import itration.itration2.GameRunner;
import itration.itration2.MarioGame;
import itration.itration2.SuperContraGame;
import itration.itration2.PacManGame;

import itration.itration2.Itration2Application;

@SpringBootApplication
public class Itration2Application {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(Itration2Application.class, args);

		// SuperContraGame game = new SuperContraGame();
		// PacManGame game = new PacManGame();
		
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);

		runner.runGame();
	}

}