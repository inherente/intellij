package com.inherente.dummy.dto;

import javax.persistence.*;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_VOICE", schema = "DEV_GPON_ADM", catalog = "")
public class GponVoiceEntity {
    private byte voiceId;
    private String city;
    private byte activeAoe;
    private GponOntEntity gponOntByOntId;

    @Id
    @Column(name = "VOICE_ID")
    public byte getVoiceId() {
        return voiceId;
    }

    public void setVoiceId(byte voiceId) {
        this.voiceId = voiceId;
    }

    @Basic
    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "ACTIVE_AOE")
    public byte getActiveAoe() {
        return activeAoe;
    }

    public void setActiveAoe(byte activeAoe) {
        this.activeAoe = activeAoe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponVoiceEntity that = (GponVoiceEntity) o;

        if (voiceId != that.voiceId) return false;
        if (activeAoe != that.activeAoe) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) voiceId;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (int) activeAoe;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ONT_ID", referencedColumnName = "ONT_ID", nullable = false)
    public GponOntEntity getGponOntByOntId() {
        return gponOntByOntId;
    }

    public void setGponOntByOntId(GponOntEntity gponOntByOntId) {
        this.gponOntByOntId = gponOntByOntId;
    }
}
