package Limitbreaker.relics;

import Limitbreaker.chr.chr_lb;

import static Limitbreaker.Limitbreaker.makeID;

public class TodoItem extends AbstractEasyRelic {
    public static final String ID = makeID("TodoItem");

    public TodoItem() {
        super(ID, RelicTier.STARTER, LandingSound.FLAT, chr_lb.Enums.LIMITBREAKER_COLOUR);
    }
}
