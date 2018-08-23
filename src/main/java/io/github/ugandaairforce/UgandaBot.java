package io.github.ugandaairforce;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class UgandaBot {
	private static final UgandaBot INSTANCE = new UgandaBot();

	public static UgandaBot getInstance() {
		return INSTANCE;
	}

	private JDA jda;

    public void setupBot() throws LoginException {
    	this.jda = new JDABuilder(AccountType.BOT)
				.setToken(Helper.getToken())
				.setAutoReconnect(true)
				.build();
	}
}
