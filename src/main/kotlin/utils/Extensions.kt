package utils

import org.telegram.telegrambots.meta.api.objects.Update

val Update.getChatId: Long get() = 
    this.message?.chatId
        ?: this.callbackQuery.message.chatId