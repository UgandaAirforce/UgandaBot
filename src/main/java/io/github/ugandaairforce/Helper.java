package io.github.ugandaairforce;

import org.jetbrains.annotations.NotNull;

public class Helper {

    //Accessors for reference
    @NotNull(exception = NullPointerException.class)
    public static String getToken() {
        return UgandaBotProperties.getProperty("bot.token");
    }

    @NotNull(exception = NullPointerException.class)
    public static String getGame() {
        return UgandaBotProperties.getProperty("bot.game");
    }

    //Accessor for the bot
    public static UgandaBot getBot() {
        return UgandaBot.getInstance();
    }
}
