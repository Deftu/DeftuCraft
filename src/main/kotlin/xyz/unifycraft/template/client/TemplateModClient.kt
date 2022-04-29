package xyz.unifycraft.template.client

import net.fabricmc.api.ClientModInitializer
import xyz.unifycraft.template.TemplateMod

class TemplateModClient : ClientModInitializer {
    override fun onInitializeClient() {
        TemplateMod.logger.info("Hello, Client!")
    }
}