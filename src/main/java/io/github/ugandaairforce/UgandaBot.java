package io.github.ugandaairforce;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class UgandaBot {

	JDA jda;
	String token;

	public UgandaBot() {

		try {
			init();
		} catch (LoginException | RateLimitedException | InterruptedException exception) {
			exception.printStackTrace();
		}
	}

    private void init() throws LoginException, RateLimitedException, InterruptedException {

		System.out.println("Initializing bot...");
    	UgandaBotProperties.getProperty("bot.token");

    	if (token != null) {
			try {
				jda = new JDABuilder(AccountType.BOT).setToken("token").build();
			} catch (LoginException e) {
				e.printStackTrace();
			}
		}

	}
}
