package com.inherente.dummy.dto;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_ONT", schema = "DEV_GPON_ADM", catalog = "")
public class GponOntEntity {
    private byte ontId;
    private String aoeSubscriberId;
    private Byte equipmentId;
    private String ontSerialNumber;
    private byte aoeVideoActive;
    private String businessJurisdiction;
    private String videoTemplateName;
    private String dataTemplateName;
    private String voiceTemplateName;
    private Collection<GponDataEntity> gponDatasByOntId;
    private GponSubscriberEntity gponSubscriberBySubscriberId;
    private GponOntModelEntity gponOntModelByOntModelId;
    private GponPopEntity gponPopByPopId;
    private Collection<GponVoiceEntity> gponVoicesByOntId;

    @Id
    @Column(name = "ONT_ID")
    public byte getOntId() {
        return ontId;
    }

    public void setOntId(byte ontId) {
        this.ontId = ontId;
    }

    @Basic
    @Column(name = "AOE_SUBSCRIBER_ID")
    public String getAoeSubscriberId() {
        return aoeSubscriberId;
    }

    public void setAoeSubscriberId(String aoeSubscriberId) {
        this.aoeSubscriberId = aoeSubscriberId;
    }

    @Basic
    @Column(name = "EQUIPMENT_ID")
    public Byte getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Byte equipmentId) {
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
    @Column(name = "AOE_VIDEO_ACTIVE")
    public byte getAoeVideoActive() {
        return aoeVideoActive;
    }

    public void setAoeVideoActive(byte aoeVideoActive) {
        this.aoeVideoActive = aoeVideoActive;
    }

    @Basic
    @Column(name = "BUSINESS_JURISDICTION")
    public String getBusinessJurisdiction() {
        return businessJurisdiction;
    }

    public void setBusinessJurisdiction(String businessJurisdiction) {
        this.businessJurisdiction = businessJurisdiction;
    }

    @Basic
    @Column(name = "VIDEO_TEMPLATE_NAME")
    public String getVideoTemplateName() {
        return videoTemplateName;
    }

    public void setVideoTemplateName(String videoTemplateName) {
        this.videoTemplateName = videoTemplateName;
    }

    @Basic
    @Column(name = "DATA_TEMPLATE_NAME")
    public String getDataTemplateName() {
        return dataTemplateName;
    }

    public void setDataTemplateName(String dataTemplateName) {
        this.dataTemplateName = dataTemplateName;
    }

    @Basic
    @Column(name = "VOICE_TEMPLATE_NAME")
    public String getVoiceTemplateName() {
        return voiceTemplateName;
    }

    public void setVoiceTemplateName(String voiceTemplateName) {
        this.voiceTemplateName = voiceTemplateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponOntEntity that = (GponOntEntity) o;

        if (ontId != that.ontId) return false;
        if (aoeVideoActive != that.aoeVideoActive) return false;
        if (aoeSubscriberId != null ? !aoeSubscriberId.equals(that.aoeSubscriberId) : that.aoeSubscriberId != null)
            return false;
        if (equipmentId != null ? !equipmentId.equals(that.equipmentId) : that.equipmentId != null) return false;
        if (ontSerialNumber != null ? !ontSerialNumber.equals(that.ontSerialNumber) : that.ontSerialNumber != null)
            return false;
        if (businessJurisdiction != null ? !businessJurisdiction.equals(that.businessJurisdiction) : that.businessJurisdiction != null)
            return false;
        if (videoTemplateName != null ? !videoTemplateName.equals(that.videoTemplateName) : that.videoTemplateName != null)
            return false;
        if (dataTemplateName != null ? !dataTemplateName.equals(that.dataTemplateName) : that.dataTemplateName != null)
            return false;
        if (voiceTemplateName != null ? !voiceTemplateName.equals(that.voiceTemplateName) : that.voiceTemplateName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ontId;
        result = 31 * result + (aoeSubscriberId != null ? aoeSubscriberId.hashCode() : 0);
        result = 31 * result + (equipmentId != null ? equipmentId.hashCode() : 0);
        result = 31 * result + (ontSerialNumber != null ? ontSerialNumber.hashCode() : 0);
        result = 31 * result + (int) aoeVideoActive;
        result = 31 * result + (businessJurisdiction != null ? businessJurisdiction.hashCode() : 0);
        result = 31 * result + (videoTemplateName != null ? videoTemplateName.hashCode() : 0);
        result = 31 * result + (dataTemplateName != null ? dataTemplateName.hashCode() : 0);
        result = 31 * result + (voiceTemplateName != null ? voiceTemplateName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "gponOntByOntId")
    public Collection<GponDataEntity> getGponDatasByOntId() {
        return gponDatasByOntId;
    }

    public void setGponDatasByOntId(Collection<GponDataEntity> gponDatasByOntId) {
        this.gponDatasByOntId = gponDatasByOntId;
    }

    @ManyToOne
    @JoinColumn(name = "SUBSCRIBER_ID", referencedColumnName = "SUBSCRIBER_ID", nullable = false)
    public GponSubscriberEntity getGponSubscriberBySubscriberId() {
        return gponSubscriberBySubscriberId;
    }

    public void setGponSubscriberBySubscriberId(GponSubscriberEntity gponSubscriberBySubscriberId) {
        this.gponSubscriberBySubscriberId = gponSubscriberBySubscriberId;
    }

    @ManyToOne
    @JoinColumn(name = "ONT_MODEL_ID", referencedColumnName = "ONT_MODEL_ID", nullable = false)
    public GponOntModelEntity getGponOntModelByOntModelId() {
        return gponOntModelByOntModelId;
    }

    public void setGponOntModelByOntModelId(GponOntModelEntity gponOntModelByOntModelId) {
        this.gponOntModelByOntModelId = gponOntModelByOntModelId;
    }

    @ManyToOne
    @JoinColumn(name = "POP_ID", referencedColumnName = "POP_ID", nullable = false)
    public GponPopEntity getGponPopByPopId() {
        return gponPopByPopId;
    }

    public void setGponPopByPopId(GponPopEntity gponPopByPopId) {
        this.gponPopByPopId = gponPopByPopId;
    }

    @OneToMany(mappedBy = "gponOntByOntId")
    public Collection<GponVoiceEntity> getGponVoicesByOntId() {
        return gponVoicesByOntId;
    }

    public void setGponVoicesByOntId(Collection<GponVoiceEntity> gponVoicesByOntId) {
        this.gponVoicesByOntId = gponVoicesByOntId;
    }
}
