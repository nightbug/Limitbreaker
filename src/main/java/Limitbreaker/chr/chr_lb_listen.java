package Limitbreaker.chr;

import com.brashmonkey.spriter.Animation;
import com.brashmonkey.spriter.Player;

public class chr_lb_listen implements Player.PlayerListener {
    private chr_lb character;
    public chr_lb_listen(chr_lb character) {
        this.character = character;
    }
    public void animationFinished(Animation animation){
        if (animation.name.equals("Win")) { character.stopAnimation(); }
        else if (!animation.name.equals("Idle")) { character.resetAnimation(); }
    }

    public void animationChanged(Animation var1, Animation var2){ }
    public void preProcess(Player var1){ }
    public void postProcess(Player var1){ }
    public void mainlineKeyChanged(com.brashmonkey.spriter.Mainline.Key var1, com.brashmonkey.spriter.Mainline.Key var2){ }
}
