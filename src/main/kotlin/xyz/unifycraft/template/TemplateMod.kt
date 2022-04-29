package xyz.unifycraft.template

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager

class TemplateMod : ModInitializer {
    override fun onInitialize() {
        logger.info("Hello, World!")
    }

    companion object {
        const val NAME = "@NAME@"
        const val ID = "@ID@"
        const val VERSION = "@VERSION@"

        @JvmStatic val logger = LogManager.getLogger(NAME)
    }
}