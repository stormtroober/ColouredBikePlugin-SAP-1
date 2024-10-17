package sap.ass01.layered.effects;

import sap.ass01.layered.plugin.ColorStatePlugin;
import sap.ass01.layered.ui.models.EBikeViewModel;

import java.awt.*;

public class ColorStateEffect implements ColorStatePlugin {

    @Override
    public EBikeViewModel colorState(EBikeViewModel bike) {
        String state = bike.state().toUpperCase();
        return switch (state) {
            case "AVAILABLE" -> bike.updateColor(Color.GREEN);
            case "IN_USE" -> bike.updateColor(Color.YELLOW);
            case "MAINTENANCE" -> bike.updateColor(Color.RED);
            default -> bike;
        };
    }
}