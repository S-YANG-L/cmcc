package com.htyw.app.engineeringPolling.pojo.CopyForm;
//抄表类型
public class CopyFormType {
    private int id;
    private String instrumentNumber;
    private String instrumentName;
    private int instrumentTypeId;
    private String instrumentType;
    private String instrumentTypeName;
    private int housingResourcesId;
    private String housingResources;
    private String meterReadingCycle;
    private double initialReadingHistory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstrumentNumber() {
        return instrumentNumber;
    }

    public void setInstrumentNumber(String instrumentNumber) {
        this.instrumentNumber = instrumentNumber;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public int getInstrumentTypeId() {
        return instrumentTypeId;
    }

    public void setInstrumentTypeId(int instrumentTypeId) {
        this.instrumentTypeId = instrumentTypeId;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentTypeName() {
        return instrumentTypeName;
    }

    public void setInstrumentTypeName(String instrumentTypeName) {
        this.instrumentTypeName = instrumentTypeName;
    }

    public int getHousingResourcesId() {
        return housingResourcesId;
    }

    public void setHousingResourcesId(int housingResourcesId) {
        this.housingResourcesId = housingResourcesId;
    }

    public String getHousingResources() {
        return housingResources;
    }

    public void setHousingResources(String housingResources) {
        this.housingResources = housingResources;
    }

    public String getMeterReadingCycle() {
        return meterReadingCycle;
    }

    public void setMeterReadingCycle(String meterReadingCycle) {
        this.meterReadingCycle = meterReadingCycle;
    }

    public double getInitialReadingHistory() {
        return initialReadingHistory;
    }

    public void setInitialReadingHistory(double initialReadingHistory) {
        this.initialReadingHistory = initialReadingHistory;
    }
}
