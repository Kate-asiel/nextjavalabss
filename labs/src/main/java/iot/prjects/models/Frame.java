package iot.prjects.models;

public class Frame extends Details {
    String typeOfFrame;

    public Frame(String name, String producer, String material, String type, double weight, int serialNumber, boolean isPartOfTheChassis, String typeOfFrame) {
        super(name, producer, material, type, weight, serialNumber, isPartOfTheChassis);
        this.typeOfFrame = typeOfFrame;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", type of frame";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + typeOfFrame;
    }
}
