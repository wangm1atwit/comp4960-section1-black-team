package com.app.blackteam.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Time;

@Entity
public class TimeSlot extends PersistableEntity {
    @Column(nullable = false)
    private Time startTime;

    @Column(nullable = false)
    private Time endTime;

    public TimeSlot() {
    }

    public TimeSlot(Time startTime, Time endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Time getStartTime() {
        return startTime;
    }

    public TimeSlot setStartTime(Time startTime) {
        this.startTime = startTime;
        return this;
    }

    public Time getEndTime() {
        return endTime;
    }

    public TimeSlot setEndTime(Time endTime) {
        this.endTime = endTime;
        return this;
    }
}
