package com.inherente.dummy.dto;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_ONT_MODEL", schema = "DEV_GPON_ADM", catalog = "")
public class GponOntModelEntity {
    private byte ontModelId;
    private String ontModelName;
    private String brand;
    private byte supportsData;
    private byte supportsVideo;
    private byte supportsVoice;
    private byte supportsWifi;
    private byte ethernetPorts;
    private byte phonePorts;
    private byte isRg;
    private Collection<GponOntEntity> gponOntsByOntModelId;
    private Collection<GponTemplateConfigEntity> gponTemplateConfigsByOntModelId;
    private Collection<GponVoiceConfigEntity> gponVoiceConfigsByOntModelId;

    @Id
    @Column(name = "ONT_MODEL_ID")
    public byte getOntModelId() {
        return ontModelId;
    }

    public void setOntModelId(byte ontModelId) {
        this.ontModelId = ontModelId;
    }

    @Basic
    @Column(name = "ONT_MODEL_NAME")
    public String getOntModelName() {
        return ontModelName;
    }

    public void setOntModelName(String ontModelName) {
        this.ontModelName = ontModelName;
    }

    @Basic
    @Column(name = "BRAND")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "SUPPORTS_DATA")
    public byte getSupportsData() {
        return supportsData;
    }

    public void setSupportsData(byte supportsData) {
        this.supportsData = supportsData;
    }

    @Basic
    @Column(name = "SUPPORTS_VIDEO")
    public byte getSupportsVideo() {
        return supportsVideo;
    }

    public void setSupportsVideo(byte supportsVideo) {
        this.supportsVideo = supportsVideo;
    }

    @Basic
    @Column(name = "SUPPORTS_VOICE")
    public byte getSupportsVoice() {
        return supportsVoice;
    }

    public void setSupportsVoice(byte supportsVoice) {
        this.supportsVoice = supportsVoice;
    }

    @Basic
    @Column(name = "SUPPORTS_WIFI")
    public byte getSupportsWifi() {
        return supportsWifi;
    }

    public void setSupportsWifi(byte supportsWifi) {
        this.supportsWifi = supportsWifi;
    }

    @Basic
    @Column(name = "ETHERNET_PORTS")
    public byte getEthernetPorts() {
        return ethernetPorts;
    }

    public void setEthernetPorts(byte ethernetPorts) {
        this.ethernetPorts = ethernetPorts;
    }

    @Basic
    @Column(name = "PHONE_PORTS")
    public byte getPhonePorts() {
        return phonePorts;
    }

    public void setPhonePorts(byte phonePorts) {
        this.phonePorts = phonePorts;
    }

    @Basic
    @Column(name = "IS_RG")
    public byte getIsRg() {
        return isRg;
    }

    public void setIsRg(byte isRg) {
        this.isRg = isRg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponOntModelEntity that = (GponOntModelEntity) o;

        if (ontModelId != that.ontModelId) return false;
        if (supportsData != that.supportsData) return false;
        if (supportsVideo != that.supportsVideo) return false;
        if (supportsVoice != that.supportsVoice) return false;
        if (supportsWifi != that.supportsWifi) return false;
        if (ethernetPorts != that.ethernetPorts) return false;
        if (phonePorts != that.phonePorts) return false;
        if (isRg != that.isRg) return false;
        if (ontModelName != null ? !ontModelName.equals(that.ontModelName) : that.ontModelName != null) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) ontModelId;
        result = 31 * result + (ontModelName != null ? ontModelName.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (int) supportsData;
        result = 31 * result + (int) supportsVideo;
        result = 31 * result + (int) supportsVoice;
        result = 31 * result + (int) supportsWifi;
        result = 31 * result + (int) ethernetPorts;
        result = 31 * result + (int) phonePorts;
        result = 31 * result + (int) isRg;
        return result;
    }

    @OneToMany(mappedBy = "gponOntModelByOntModelId")
    public Collection<GponOntEntity> getGponOntsByOntModelId() {
        return gponOntsByOntModelId;
    }

    public void setGponOntsByOntModelId(Collection<GponOntEntity> gponOntsByOntModelId) {
        this.gponOntsByOntModelId = gponOntsByOntModelId;
    }

    @OneToMany(mappedBy = "gponOntModelByOntModelId")
    public Collection<GponTemplateConfigEntity> getGponTemplateConfigsByOntModelId() {
        return gponTemplateConfigsByOntModelId;
    }

    public void setGponTemplateConfigsByOntModelId(Collection<GponTemplateConfigEntity> gponTemplateConfigsByOntModelId) {
        this.gponTemplateConfigsByOntModelId = gponTemplateConfigsByOntModelId;
    }

    @OneToMany(mappedBy = "gponOntModelByOntModelId")
    public Collection<GponVoiceConfigEntity> getGponVoiceConfigsByOntModelId() {
        return gponVoiceConfigsByOntModelId;
    }

    public void setGponVoiceConfigsByOntModelId(Collection<GponVoiceConfigEntity> gponVoiceConfigsByOntModelId) {
        this.gponVoiceConfigsByOntModelId = gponVoiceConfigsByOntModelId;
    }
}
