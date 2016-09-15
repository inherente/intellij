package com.inherente.dummy.dto;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_EQUIPMENT_LOG", schema = "DEV_GPON_ADM", catalog = "")
public class GponEquipmentLogEntity {
    private byte equipmentLogId;
    private String ontSerialNumber;
    private String systemName;
    private byte shelf;
    private byte slotOlt;
    private byte pon;
    private byte ont;
    private Time createTime;

    @Id
    @Column(name = "EQUIPMENT_LOG_ID")
    public byte getEquipmentLogId() {
        return equipmentLogId;
    }

    public void setEquipmentLogId(byte equipmentLogId) {
        this.equipmentLogId = equipmentLogId;
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
    @Column(name = "CREATE_TIME")
    public Time getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Time createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponEquipmentLogEntity that = (GponEquipmentLogEntity) o;

        if (equipmentLogId != that.equipmentLogId) return false;
        if (shelf != that.shelf) return false;
        if (slotOlt != that.slotOlt) return false;
        if (pon != that.pon) return false;
        if (ont != that.ont) return false;
        if (ontSerialNumber != null ? !ontSerialNumber.equals(that.ontSerialNumber) : that.ontSerialNumber != null)
            return false;
        if (systemName != null ? !systemName.equals(that.systemName) : that.systemName != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) equipmentLogId;
        result = 31 * result + (ontSerialNumber != null ? ontSerialNumber.hashCode() : 0);
        result = 31 * result + (systemName != null ? systemName.hashCode() : 0);
        result = 31 * result + (int) shelf;
        result = 31 * result + (int) slotOlt;
        result = 31 * result + (int) pon;
        result = 31 * result + (int) ont;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
