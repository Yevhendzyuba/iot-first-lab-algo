package ua.lviv.iot;

import java.lang.String;

public class ElectricLamp {

    private static String companyProducer;

    protected float widthInMm;

    protected float lengthInMm;

    private float powerOfLightningInWatts;

    private int warrantyPeriodOfWorkInDays;

    private String producingCountry;

    private String materials;

    private String typeOfLamp;

    private String typeOfLight;

    public ElectricLamp() {

    }

    public ElectricLamp(float powerOfLightningInWatts, int warrantyPeriodOfWorkInDays, String producingCountry,
                        String materials, String typeOfLamp, String typeOfLight) {
        this(0, 0, powerOfLightningInWatts, warrantyPeriodOfWorkInDays, producingCountry, materials, typeOfLamp,
                typeOfLight);

    }

    public ElectricLamp(float widthInMm, float lengthInMm, float powerOfLightningInWatts,
                        int warrantyPeriodOfWorkInDays, String producingCountry, String materials, String typeOfLamp,
                        String typeOfLight) {
        this.widthInMm = widthInMm;
        this.lengthInMm = lengthInMm;
        this.powerOfLightningInWatts = powerOfLightningInWatts;
        this.warrantyPeriodOfWorkInDays = warrantyPeriodOfWorkInDays;
        this.producingCountry = producingCountry;
        this.materials = materials;
        this.typeOfLamp = typeOfLamp;
        this.typeOfLight = typeOfLight;
    }

    public static String getCompanyProducer() {
        return companyProducer;
    }

    public static void setCompanyProducer(String companyProducer) {
        ElectricLamp.companyProducer = companyProducer;
    }

    public float getWidthInMm() {
        return widthInMm;
    }

    public void setWidthInMm(float widthInMm) {
        this.widthInMm = widthInMm;
    }

    public float getLengthInMm() {
        return lengthInMm;
    }

    public void setLengthInMm(float lengthInMm) {
        this.lengthInMm = lengthInMm;
    }

    public float getPowerOfLightningInWatts() {
        return powerOfLightningInWatts;
    }

    public void setPowerOfLightningInWatts(float powerOfLightningInWatts) {
        this.powerOfLightningInWatts = powerOfLightningInWatts;
    }

    public int getWarrantyPeriodOfWorkInDays() {
        return warrantyPeriodOfWorkInDays;
    }

    public void setWarrantyPeriodOfWorkInDays(int warrantyPeriodOfWorkInDays) {
        this.warrantyPeriodOfWorkInDays = warrantyPeriodOfWorkInDays;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getTypeOfLamp() {
        return typeOfLamp;
    }

    public void setTypeOfLamp(String typeOfLamp) {
        this.typeOfLamp = typeOfLamp;
    }

    public String getTypeOfLight() {
        return typeOfLight;
    }

    public void setTypeOfLight(String typeOfLight) {
        this.typeOfLight = typeOfLight;
    }

    @Override
    public String toString() {
        return "ElectricLamp{" + "widthInMm=" + widthInMm + ", lengthInMm=" + lengthInMm + ", powerOfLightningInWatts="
                + powerOfLightningInWatts + ", warrantyPeriodOfWorkInDays=" + warrantyPeriodOfWorkInDays
                + ", producingCountry='" + producingCountry + '\'' + ", material='" + materials + '\''
                + ", typeOfLamp='" + typeOfLamp + '\'' + ", typeOfLight='" + typeOfLight + '\'' + '}';
    }
}
