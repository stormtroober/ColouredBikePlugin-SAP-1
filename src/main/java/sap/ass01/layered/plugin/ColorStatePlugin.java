package sap.ass01.layered.plugin;

import sap.ass01.layered.services.dto.EBikeDTO;

import java.awt.*;

public interface ColorStatePlugin {
    Color colorState(EBikeDTO bike);
}