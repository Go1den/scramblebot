import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.channel.MessageChannel;

public final class ScrambleBot {

    public static void main(final String[] args) {
        Question question = new Question(1, "Test Game", "PSP");
        System.out.println(question.getScrambledGameName());
        System.out.println(question.getHiddenGameName());
//        final String token = args[0];
//        final DiscordClient discordClient = DiscordClient.create(token);
//        final GatewayDiscordClient gatewayDiscordClient = discordClient.login().block();
//
//        if (gatewayDiscordClient != null) {
//            gatewayDiscordClient.on(MessageCreateEvent.class).subscribe(event -> {
//                final Message message = event.getMessage();
//                if ("!ping".equals(message.getContent())) {
//                    final MessageChannel channel = message.getChannel().block();
//                    if (channel != null) {
//                        channel.createMessage("Pong!").block();
//                    }
//                }
//            });
//
//            gatewayDiscordClient.onDisconnect().block();
//        }
    }
}
