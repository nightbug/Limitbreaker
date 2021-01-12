package Limitbreaker.vars;

import Limitbreaker.cards.abs.abs_lb_card;
import basemod.abstracts.DynamicVariable;
import com.megacrit.cardcrawl.cards.AbstractCard;

import static Limitbreaker.Limitbreaker.makeID;

;

public class lb_card_magic extends DynamicVariable {

    @Override
    public String key() {
        return makeID("si");
    } //TODO: Change this, if you want. It's already modID prefixed, so no worries about conflicts (ASSUMING YOU CHANGED YOUR MODID!)

    @Override
    public boolean isModified(AbstractCard card) {
        if (card instanceof abs_lb_card) {
            return ((abs_lb_card) card).isLBSecondMagicNumberModified;
        }
        return false;
    }

    @Override
    public int value(AbstractCard card) {
        if (card instanceof abs_lb_card) {
            return ((abs_lb_card) card).lbSecondMagicNumber;
        }
        return -1;
    }

    public void setIsModified(AbstractCard card, boolean v) {
        if (card instanceof abs_lb_card) {
            ((abs_lb_card) card).isLBSecondMagicNumberModified = v;
        }
    }

    @Override
    public int baseValue(AbstractCard card) {
        if (card instanceof abs_lb_card) {
            return ((abs_lb_card) card).lbBaseSecondMagicNumber;
        }
        return -1;
    }

    @Override
    public boolean upgraded(AbstractCard card) {
        if (card instanceof abs_lb_card) {
            return ((abs_lb_card) card).upgradedLBSecondMagicNumber;
        }
        return false;
    }
}