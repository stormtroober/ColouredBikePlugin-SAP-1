package ebikes.plugin.effects;


import ebikes.core.application.ColorStatePlugin;
import ebikes.core.domain.EBikeViewModel;

import java.awt.*;

public class ColorStateEffect implements ColorStatePlugin {

    @Override
    public void colorState(EBikeViewModel bike) {
        // Implementation of the method
        // For example, change the color of the eBike
        bike.updateColor(Color.RED);
        System.out.println("Color state applied: " + bike.color());
    }
}