import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
        public static void main(String[] args) throws LoginException {
            JDABuilder builder = new JDABuilder(AccountType.BOT);
            String token = "";
            builder.setToken(token);
            builder.addEventListener(new Main());
            builder.buildAsync();
        }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().contains("kk!help")) {
            event.getChannel().sendMessage("These are the commands you can use:\nkk!game - Starts the participation sequence for a game");
        }
        System.out.println(event.getMessage().getAuthor().getName() + ": " + event.getMessage().getContentRaw());
    }
}
