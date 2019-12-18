package com.webank.wecube.platform.core.dto;

import java.util.List;

public class DataModelComparisionDto {
    private List<String> newEntities;
    private List<String> oldEntities;
    private List<String> newAttributes;
    private List<String> oldAttributes;

    public DataModelComparisionDto() {
    }

    public DataModelComparisionDto(List<String> newEntities, List<String> oldEntities, List<String> newAttributes, List<String> oldAttributes) {
        this.newEntities = newEntities;
        this.oldEntities = oldEntities;
        this.newAttributes = newAttributes;
        this.oldAttributes = oldAttributes;
    }

    public List<String> getNewEntities() {
        return newEntities;
    }

    public void setNewEntities(List<String> newEntities) {
        this.newEntities = newEntities;
    }

    public List<String> getOldEntities() {
        return oldEntities;
    }

    public void setOldEntities(List<String> oldEntities) {
        this.oldEntities = oldEntities;
    }

    public List<String> getNewAttributes() {
        return newAttributes;
    }

    public void setNewAttributes(List<String> newAttributes) {
        this.newAttributes = newAttributes;
    }

    public List<String> getOldAttributes() {
        return oldAttributes;
    }

    public void setOldAttributes(List<String> oldAttributes) {
        this.oldAttributes = oldAttributes;
    }
}
