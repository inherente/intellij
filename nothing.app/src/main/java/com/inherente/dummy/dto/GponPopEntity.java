package com.inherente.dummy.dto;

import javax.persistence.*;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_POP", schema = "DEV_GPON_ADM", catalog = "")
public class GponPopEntity {
    private byte popId;
    private String node;
    private String location;
    private String abbreviation;

    @Id
    @Column(name = "POP_ID")
    public byte getPopId() {
        return popId;
    }

    public void setPopId(byte popId) {
        this.popId = popId;
    }

    @Basic
    @Column(name = "NODE")
    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    @Basic
    @Column(name = "LOCATION")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "ABBREVIATION")
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponPopEntity that = (GponPopEntity) o;

        if (popId != that.popId) return false;
        if (node != null ? !node.equals(that.node) : that.node != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (abbreviation != null ? !abbreviation.equals(that.abbreviation) : that.abbreviation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) popId;
        result = 31 * result + (node != null ? node.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (abbreviation != null ? abbreviation.hashCode() : 0);
        return result;
    }
}
