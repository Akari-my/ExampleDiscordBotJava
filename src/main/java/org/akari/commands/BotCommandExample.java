package org.akari.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class BotCommandExample extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("ping")) { // Check if the command name is "ping"
            event.getHook().sendMessage("Pong!").queue(); // Send the message "Pong!"
        }
    }
}
