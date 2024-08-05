package dnd.util;

import dnd.supers.Player;
import dnd.supers.buff.NegativeBuff;
import dnd.supers.buff.PositiveBuff;

import java.util.Arrays;

import static dnd.supers.buff.NegativeBuff.HEALTH_DEBUFF;
import static dnd.supers.buff.NegativeBuff.MANA_DEBUFF;
import static dnd.supers.buff.PositiveBuff.HEALTH;
import static dnd.supers.buff.PositiveBuff.MANA;

public class BuffApplier {

    public static void applyBuff(Player player, NegativeBuff negativeBuff) {
        NegativeBuff[] values = NegativeBuff.values();
        for (NegativeBuff value : values) {
            switch (value) {
                case HEALTH_DEBUFF:
                    player.setHealth(player.getHealth() - player.getHealth() / 10);
                    break;
                case MANA_DEBUFF:
                    player.setIntelligence(player.getIntelligence() - player.getIntelligence() / 10);
                    break;
                default:
                    System.out.println(Arrays.toString(values));
            }
        }
    }
    public static void applyBuff(Player player, PositiveBuff positiveBuff) {
        for (PositiveBuff value : PositiveBuff.values()) {
            switch (value) {
                case HEALTH:
                    player.setHealth(player.getHealth() - player.getHealth() / 10);
                    break;
                case MANA:
                    player.setIntelligence(player.getIntelligence() - player.getIntelligence() / 10);
                    break;
                default:
                    System.out.println(Arrays.toString(PositiveBuff.values()));
            }
        }
    }

}
