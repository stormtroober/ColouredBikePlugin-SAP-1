package sap.ass01.layered.effects;


import sap.ass01.layered.plugin.ColorStatePlugin;
import sap.ass01.layered.ui.models.EBikeViewModel;

import java.awt.*;

public class ColorStateEffect implements ColorStatePlugin {

    @Override
    public EBikeViewModel colorState(EBikeViewModel bike) {
        return bike.updateColor(Color.GREEN);
    }
}