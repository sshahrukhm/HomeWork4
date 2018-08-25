package oop.encapsulation;

public class Mobile {
    private int mobileModel;
    private String mobileBrand;
    private String mobileColor;
    public String MobileFeatures;

    public int getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(int mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public String getMobileColor() {
        return mobileColor;
    }

    public void setMobileColor(String mobileColor) {
        this.mobileColor = mobileColor;
    }

    public String getMobileFeatures() {
        return MobileFeatures;
    }

    public void setMobileFeatures(String mobileFeatures) {
        MobileFeatures = mobileFeatures;
    }
}
