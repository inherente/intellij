package com.inherente.dummy.dto;

import javax.persistence.*;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_VOICE_CONFIG", schema = "DEV_GPON_ADM", catalog = "")
public class GponVoiceConfigEntity {
    private byte voiceConfigId;
    private String dialPlan;
    private String codec;
    private String media;
    private String callFeature;
    private String trunk;
    private GponOntModelEntity gponOntModelByOntModelId;

    @Id
    @Column(name = "VOICE_CONFIG_ID")
    public byte getVoiceConfigId() {
        return voiceConfigId;
    }

    public void setVoiceConfigId(byte voiceConfigId) {
        this.voiceConfigId = voiceConfigId;
    }

    @Basic
    @Column(name = "DIAL_PLAN")
    public String getDialPlan() {
        return dialPlan;
    }

    public void setDialPlan(String dialPlan) {
        this.dialPlan = dialPlan;
    }

    @Basic
    @Column(name = "CODEC")
    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    @Basic
    @Column(name = "MEDIA")
    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    @Basic
    @Column(name = "CALL_FEATURE")
    public String getCallFeature() {
        return callFeature;
    }

    public void setCallFeature(String callFeature) {
        this.callFeature = callFeature;
    }

    @Basic
    @Column(name = "TRUNK")
    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponVoiceConfigEntity that = (GponVoiceConfigEntity) o;

        if (voiceConfigId != that.voiceConfigId) return false;
        if (dialPlan != null ? !dialPlan.equals(that.dialPlan) : that.dialPlan != null) return false;
        if (codec != null ? !codec.equals(that.codec) : that.codec != null) return false;
        if (media != null ? !media.equals(that.media) : that.media != null) return false;
        if (callFeature != null ? !callFeature.equals(that.callFeature) : that.callFeature != null) return false;
        if (trunk != null ? !trunk.equals(that.trunk) : that.trunk != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) voiceConfigId;
        result = 31 * result + (dialPlan != null ? dialPlan.hashCode() : 0);
        result = 31 * result + (codec != null ? codec.hashCode() : 0);
        result = 31 * result + (media != null ? media.hashCode() : 0);
        result = 31 * result + (callFeature != null ? callFeature.hashCode() : 0);
        result = 31 * result + (trunk != null ? trunk.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ONT_MODEL_ID", referencedColumnName = "ONT_MODEL_ID")
    public GponOntModelEntity getGponOntModelByOntModelId() {
        return gponOntModelByOntModelId;
    }

    public void setGponOntModelByOntModelId(GponOntModelEntity gponOntModelByOntModelId) {
        this.gponOntModelByOntModelId = gponOntModelByOntModelId;
    }
}
