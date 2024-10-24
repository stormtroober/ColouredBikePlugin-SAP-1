package sap.ass01.hexagonal.application.ports.entities;

public record EBikeDTO(String id, double x, double y, int batteryLevel, String state) {
}