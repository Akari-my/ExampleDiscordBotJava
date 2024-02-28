package org.akari;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.akari.commands.BotCommandExample;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder.createDefault("YOUR TOKEN HERE")
                .enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MESSAGE_REACTIONS, GatewayIntent.MESSAGE_CONTENT)
                .addEventListeners(new BotCommandExample())
                .build().awaitReady();

        Guild guild =  jda.getGuildById("YOUR SERVER ID");

        if (guild != null){
            guild.upsertCommand("ping", "pong!")
                    .queue();
        }
    }
}