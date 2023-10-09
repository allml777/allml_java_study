package com.allml.D129.bean;

import java.time.LocalDate;

public class Schedule {
    private LocalDate today;

    private boolean morning;
    private LocalDate mstart;
    private LocalDate mend;
    private int mTotalNumber;
    private int mAppointNumber;

    private boolean afternoon;
    private LocalDate astart;
    private LocalDate aend;
    private int aTotalNumber;
    private int aAppointNumber;

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalDate getMstart() {
        return mstart;
    }

    public void setMstart(LocalDate mstart) {
        this.mstart = mstart;
    }

    public LocalDate getMend() {
        return mend;
    }

    public void setMend(LocalDate mend) {
        this.mend = mend;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalDate getAstart() {
        return astart;
    }

    public void setAstart(LocalDate astart) {
        this.astart = astart;
    }

    public LocalDate getAend() {
        return aend;
    }

    public void setAend(LocalDate aend) {
        this.aend = aend;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }
}
