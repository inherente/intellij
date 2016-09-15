package com.inherente.dummy.dto;

import javax.persistence.*;

/**
 * Created by luis.gutierrez.ext on 13/09/2016.
 */
@Entity
@Table(name = "GPON_TEMPLATE_CONFIG", schema = "DEV_GPON_ADM", catalog = "")
public class GponTemplateConfigEntity {
    private byte templateConfigId;
    private String templateName;
    private byte isData;
    private byte isVideo;
    private byte isVoice;
    private byte concatenatePop;
    private GponOntModelEntity gponOntModelByOntModelId;

    @Id
    @Column(name = "TEMPLATE_CONFIG_ID")
    public byte getTemplateConfigId() {
        return templateConfigId;
    }

    public void setTemplateConfigId(byte templateConfigId) {
        this.templateConfigId = templateConfigId;
    }

    @Basic
    @Column(name = "TEMPLATE_NAME")
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Basic
    @Column(name = "IS_DATA")
    public byte getIsData() {
        return isData;
    }

    public void setIsData(byte isData) {
        this.isData = isData;
    }

    @Basic
    @Column(name = "IS_VIDEO")
    public byte getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(byte isVideo) {
        this.isVideo = isVideo;
    }

    @Basic
    @Column(name = "IS_VOICE")
    public byte getIsVoice() {
        return isVoice;
    }

    public void setIsVoice(byte isVoice) {
        this.isVoice = isVoice;
    }

    @Basic
    @Column(name = "CONCATENATE_POP")
    public byte getConcatenatePop() {
        return concatenatePop;
    }

    public void setConcatenatePop(byte concatenatePop) {
        this.concatenatePop = concatenatePop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GponTemplateConfigEntity that = (GponTemplateConfigEntity) o;

        if (templateConfigId != that.templateConfigId) return false;
        if (isData != that.isData) return false;
        if (isVideo != that.isVideo) return false;
        if (isVoice != that.isVoice) return false;
        if (concatenatePop != that.concatenatePop) return false;
        if (templateName != null ? !templateName.equals(that.templateName) : that.templateName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) templateConfigId;
        result = 31 * result + (templateName != null ? templateName.hashCode() : 0);
        result = 31 * result + (int) isData;
        result = 31 * result + (int) isVideo;
        result = 31 * result + (int) isVoice;
        result = 31 * result + (int) concatenatePop;
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
