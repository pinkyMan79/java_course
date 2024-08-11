package dnd.supers.game;

import dnd.supers.Archer;
import dnd.supers.Barbarian;
import dnd.supers.Magician;
import dnd.supers.Player;
import dnd.util.ItemRandomisation;

public class GameInitializer {

    public static void main(String[] args) {
        Player player = new Archer(ItemRandomisation.initItems(Player.getLuck()));
        Player player1 = new Barbarian(ItemRandomisation.initItems(Player.getLuck()));
        Player player2 = new Magician(ItemRandomisation.initItems(Player.getLuck()));

        System.out.println(player.toString());
        System.out.println(player2.toString());
        System.out.println(player1.toString());
    }

}
