package xyz.unifycraft.template.server

import net.fabricmc.api.DedicatedServerModInitializer
import xyz.unifycraft.template.TemplateMod

class TemplateModServer : DedicatedServerModInitializer {
    override fun onInitializeServer() {
        TemplateMod.logger.info("Hello, Server!")
    }
}