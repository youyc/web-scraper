package GroupProject;

import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Pro_gamerr_bot extends TelegramLongPollingBot  {
    static String userMessage;
    @Override
    public void onUpdateReceived(Update update) {

        boolean found = false;




        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            userMessage = message_text;
            SendMessage loading = SendMessage // Create a message object object
                    .builder()
                    .chatId(Long.toString(chat_id))
                    .text("`"+"Loading"+"`")
                    .build();
            loading.setParseMode(ParseMode.MARKDOWN);
            loading.enableMarkdown(true);


            try {
                execute(loading);
                // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            // Set variables

            BotMessage botMessage = new BotMessage();
            botMessage.text();

            // Create a message object object



            if (message_text.equals("/start")) {
                SendMessage coreMessage = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+Core.replyText+"`")
                        .build();
                coreMessage.setParseMode(ParseMode.MARKDOWN);
                coreMessage.enableMarkdown(true);


                try {
                    execute(coreMessage);
                    // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                SendMessage message = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`Please select one option:\n" +
                                "/student\n" +
                                "/issue\n" +
                                "/issuesubmission\n" +
                                "/assignment\n" +
                                "/assignmentsubmission\n" +
                                "Your matric no (e.g: 263312)`")
                        .build();
                message.setParseMode(ParseMode.MARKDOWN);
                message.enableMarkdown(true);


                try {
                    execute(message);
                    // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }





            }

            else if (message_text.equals("/student")) {
                SendMessage coreMessage = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+Core.replyText+"`")
                        .build();
                coreMessage.setParseMode(ParseMode.MARKDOWN);
                coreMessage.enableMarkdown(true);


                try {
                    execute(coreMessage);
                    // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                SendMessage message = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+BotMessage.welcomeMessage+"`")
                        .build();
                message.setParseMode(ParseMode.MARKDOWN);
                message.enableMarkdown(true);

                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

        } else if (message_text.equals("/issue")) {
                SendMessage coreMessage = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+Core.replyText+"`")
                        .build();
                coreMessage.setParseMode(ParseMode.MARKDOWN);
                coreMessage.enableMarkdown(true);


                try {
                    execute(coreMessage);
                    // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                SendMessage message = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+BotMessage.issueMessage+"`")
                        .build();
                message.setParseMode(ParseMode.MARKDOWN);
                message.enableMarkdown(true);

                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }



            }
            else if (message_text.equals("/issuesubmission")) {
                SendMessage coreMessage = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+Core.replyText+"`")
                        .build();
                coreMessage.setParseMode(ParseMode.MARKDOWN);
                coreMessage.enableMarkdown(true);


                try {
                    execute(coreMessage);
                    // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                SendMessage message2 = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+BotMessage.issueMessage2+"`")
                        .build();
                message2.setParseMode(ParseMode.MARKDOWN);
                message2.enableMarkdown(true);

                try {
                    execute(message2); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }


            }
            else if (message_text.equals("/assignment")) {
                SendMessage coreMessage = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+Core.replyText+"`")
                        .build();
                coreMessage.setParseMode(ParseMode.MARKDOWN);
                coreMessage.enableMarkdown(true);


                try {
                    execute(coreMessage);
                    // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                SendMessage message = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+BotMessage.assignmentMessage+"`")
                        .build();
                message.setParseMode(ParseMode.MARKDOWN);
                message.enableMarkdown(true);

                try {
                    execute(message); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }


            }
            else if (message_text.equals("/assignmentsubmission")) {
                SendMessage coreMessage = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+Core.replyText+"`")
                        .build();
                coreMessage.setParseMode(ParseMode.MARKDOWN);
                coreMessage.enableMarkdown(true);


                try {
                    execute(coreMessage);
                    // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                SendMessage message2 = SendMessage // Create a message object object
                        .builder()
                        .chatId(Long.toString(chat_id))
                        .text("`"+BotMessage.assignmentMessage2+"`")
                        .build();
                message2.setParseMode(ParseMode.MARKDOWN);
                message2.enableMarkdown(true);

                try {
                    execute(message2); // Sending our message object to user
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }

            else {

                botMessage.finalText();
                for(int i = 0 ; i < Main2.student_list.size(); i ++) {
                    if (message_text.equals(Main2.student_list.get(i).getMatricNo())) {
                        found = true;
                        SendMessage message = SendMessage // Create a message object object
                                .builder()
                                .chatId(Long.toString(chat_id))
                                .text("`"+BotMessage.finalMessage+"`")
                                .build();
                        message.setParseMode(ParseMode.MARKDOWN);
                        message.enableMarkdown(true);

                        try {
                            execute(message); // Sending our message object to user
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                        SendMessage message2 = SendMessage // Create a message object object
                                .builder()
                                .chatId(Long.toString(chat_id))
                                .text("`"+BotMessage.finalMessage2+"`")
                                .build();
                        message2.setParseMode(ParseMode.MARKDOWN);
                        message2.enableMarkdown(true);

                        try {
                            execute(message2); // Sending our message object to user
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                        SendMessage message3 = SendMessage // Create a message object object
                                .builder()
                                .chatId(Long.toString(chat_id))
                                .text("`"+BotMessage.finalMessage3+"`")
                                .build();
                        message3.setParseMode(ParseMode.MARKDOWN);
                        message3.enableMarkdown(true);

                        try {
                            execute(message3); // Sending our message object to user
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }



                    }

                }
                if (found == false) {
                    SendMessage coreMessage = SendMessage // Create a message object object
                            .builder()
                            .chatId(Long.toString(chat_id))
                            .text("`"+Core.replyText+"`")
                            .build();
                    coreMessage.setParseMode(ParseMode.MARKDOWN);
                    coreMessage.enableMarkdown(true);


                    try {
                        execute(coreMessage);
                        // Sending our message object to user
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                    SendMessage message = SendMessage // Create a message object object
                            .builder()
                            .chatId(Long.toString(chat_id))
                            .text("`"+"Invalid Input"+"`")
                            .build();
                    message.setParseMode(ParseMode.MARKDOWN);
                    message.enableMarkdown(true);

                    try {
                        execute(message); // Sending our message object to user
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
            botMessage.clear();

        }



    }

    @Override
    public String getBotUsername() {
        // Return bot username
        // If bot username is @MyAmazingBot, it must return 'MyAmazingBot'
        return "Pro_gamerr_bot";
    }

    @Override
    public String getBotToken() {
        // Return bot token from BotFather
        return "1412322793:AAGIoGQi1v5UR5BIjw_x40t-vnTysP1Jeyw";
    }
}
