package com.gmrit.csigmrit.modals;

public class EssentialData {

    private String essentialName, essentialDescription;
    private int backgroundImage;

    public EssentialData(String essentialName, String essentialDescription, int backgroundImage) {
        this.essentialName = essentialName;
        this.essentialDescription = essentialDescription;
        this.backgroundImage = backgroundImage;
    }

    public String getEssentialName() {
        return essentialName;
    }

    public void setEssentialName(String essentialName) {
        this.essentialName = essentialName;
    }

    public String getEssentialDescription() {
        return essentialDescription;
    }

    public void setEssentialDescription(String essentialDescription) {
        this.essentialDescription = essentialDescription;
    }

    public int getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(int backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
}
