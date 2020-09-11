package com.gmrit.csigmrit.modals;

public class TeamData {
    private int teamImage;
    private String teamName, txtTeamRole;

    public TeamData(int teamImage, String teamName, String txtTeamRole) {
        this.teamImage = teamImage;
        this.teamName = teamName;
        this.txtTeamRole = txtTeamRole;
    }

    public int getTeamImage() {
        return teamImage;
    }

    public void setTeamImage(int teamImage) {
        this.teamImage = teamImage;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTxtTeamRole() {
        return txtTeamRole;
    }

    public void setTxtTeamRole(String txtTeamRole) {
        this.txtTeamRole = txtTeamRole;
    }
}
