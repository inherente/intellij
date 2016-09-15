package com.inherente.dummy.dto;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_EQUIPMENT", schema = "DEV_GPON_ADM", catalog = "")
public class GponEquipmentEntity {
    private byte equipmentId;
    private String ontSerialNumber;
    private String ip;
    private String systemName;
    private byte shelf;
    private byte slotOlt;
    private byte pon;
    private byte ont;
    private byte virtual;
    private Time lastUpdate;

    @Id
    @Column(name = "EQUIPMENT_ID")
    public byte getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(byte equipmentId) {
        this.equipmentId = equipmentId;
    }

    @Basic
    @Column(name = "ONT_SERIAL_NUMBER")
    public String getOntSerialNumber() {
        return ontSerialNumber;
    }

    public void setOntSerialNumber(String ontSerialNumber) {
        this.ontSerialNumber = ontSerialNumber;
    }

    @Basic
    @Column(name = "IP")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "SYSTEM_NAME")
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    @Basic
    @Column(name = "SHELF")
    public byte getShelf() {
        return shelf;
    }

    public void setShelf(byte shelf) {
        this.shelf = shelf;
    }

    @Basic
    @Column(name = "SLOT_OLT")
    public byte getSlotOlt() {
        return slotOlt;
    }

    public void setSlotOlt(byte slotOlt) {
        this.slotOlt = slotOlt;
    }

    @Basic
    @Column(name = "PON")
    public byte getPon() {
        return pon;
    }

    public void setPon(byte pon) {
        this.pon = pon;
    }

    @Basic
    @Column(name = "ONT")
    public byte getOnt() {
        return ont;
    }

    public void setOnt(byte ont) {
        this.ont = ont;
    }

    @Basic
    @Column(name = "VIRTUAL")
    public byte getVirtual() {
        return virtual;
    }

    public void setVirtual(byte virtual) {
        this.virtual = virtual;
    }

    @Basic
    @Column(name = "LAST_UPDATE")
    public Time getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Time lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponEquipmentEntity that = (GponEquipmentEntity) o;

        if (equipmentId != that.equipmentId) return false;
        if (shelf != that.shelf) return false;
        if (slotOlt != that.slotOlt) return false;
        if (pon != that.pon) return false;
        if (ont != that.ont) return false;
        if (virtual != that.virtual) return false;
        if (ontSerialNumber != null ? !ontSerialNumber.equals(that.ontSerialNumber) : that.ontSerialNumber != null)
            return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (systemName != null ? !systemName.equals(that.systemName) : that.systemName != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) equipmentId;
        result = 31 * result + (ontSerialNumber != null ? ontSerialNumber.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (systemName != null ? systemName.hashCode() : 0);
        result = 31 * result + (int) shelf;
        result = 31 * result + (int) slotOlt;
        result = 31 * result + (int) pon;
        result = 31 * result + (int) ont;
        result = 31 * result + (int) virtual;
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        return result;
    }
}
