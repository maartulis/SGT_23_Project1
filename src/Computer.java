public class Computer {
    // Fields - different values for different objects
    private float sizeInches;
    private float weightKg;
    private String color;
    private short capacityRam;
    private float priceEur;

    //non-argument constructor
    public Computer() {
        this.sizeInches = 15.4f;
        this.weightKg = 3.2f;
        this.color = "White";
        this.capacityRam = 4;
        this.priceEur = 450.99f;
    }

    //constructor with arguments
    public Computer(float inputSizeInches, float inputWeightKg, String inputColor, short inputCapacityRam, float inputPriceEur) {
        this.sizeInches = inputSizeInches;
        this.weightKg = inputWeightKg;
        this.color = inputColor;
        this.capacityRam = inputCapacityRam;
        this.priceEur = inputPriceEur;
    }

    public float getSizeInches() {
        return sizeInches;
    }

    public float getWeightKg() {
        return weightKg;
    }

    public String getColor() {
        return color;
    }

    public short getCapacityRam() {
        return capacityRam;
    }

    public float getPriceEur() {
        return priceEur;
    }
}
