package dev.monitoringhytale.query.util;

import com.hypixel.hytale.logger.HytaleLogger;

import javax.annotation.Nonnull;
import java.util.logging.Level;

public final class PromotionLogger {

    private PromotionLogger() {
    }

    public static void printPromotion(@Nonnull HytaleLogger logger, @Nonnull String url) {
        logger.at(Level.INFO).log("");
        logger.at(Level.INFO).log("╔═══════════════════════════════════════════════════════════════════════════╗");
        logger.at(Level.INFO).log("║  Get more players! Your server is waiting to be discovered.              ║");
        logger.at(Level.INFO).log("║                                                                           ║");
        logger.at(Level.INFO).log("║  Claim your server on monitoringhytale.ru to:                            ║");
        logger.at(Level.INFO).log("║    - Appear in the server list and attract new players                   ║");
        logger.at(Level.INFO).log("║    - Add banners, descriptions, and showcase your community              ║");
        logger.at(Level.INFO).log("║                                                                           ║");
        logger.at(Level.INFO).log("║  Claim now: %s", url);
        logger.at(Level.INFO).log("╚═══════════════════════════════════════════════════════════════════════════╝");
        logger.at(Level.INFO).log("");
    }
}
