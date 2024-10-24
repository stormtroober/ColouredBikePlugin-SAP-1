package sap.ass01.hexagonal.effects;

import sap.ass01.hexagonal.application.ports.entities.EBikeDTO;
import sap.ass01.hexagonal.infrastructure.presentation.plugin.ColorStatePlugin;

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