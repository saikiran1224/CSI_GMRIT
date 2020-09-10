package com.gmrit.csigmrit.modals;

public class EventData {
    private int eventImage;
    private String eventName, eventDescription, eventDateTime, eventType;

    public EventData(int eventImage, String eventName, String eventDescription, String eventDateTime, String eventType) {
        this.eventImage = eventImage;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.eventType = eventType;
    }

    public int getEventImage() {
        return eventImage;
    }

    public void setEventImage(int eventImage) {
        this.eventImage = eventImage;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
