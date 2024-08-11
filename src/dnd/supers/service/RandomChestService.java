package dnd.supers.service;

import dnd.supers.generated.RandomChest;

public class RandomChestService {

    private final RandomChest[] randomChest;

    public RandomChestService(RandomChest[] randomChest) {
        this.randomChest = randomChest;
    }



    public RandomChest[] getRandomChest() {
        return randomChest;
    }
}
