package sap.ass01.layered.effects;

import sap.ass01.layered.services.dto.EBikeDTO;
import sap.ass01.layered.presentation.plugin.ColorStatePlugin;

import java.awt.*;

public class ColorStateEffect implements ColorStatePlugin {

    @Override
    public Color colorState(EBikeDTO bike) {
        String state = bike.state().toUpperCase();
        return switch (state) {
            case "AVAILABLE" -> Color.GREEN;
            case "IN_USE" -> Color.YELLOW;
            case "MAINTENANCE" -> Color.RED;
            default -> Color.BLACK;
        };
    }
}