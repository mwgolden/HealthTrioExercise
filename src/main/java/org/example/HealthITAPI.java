package org.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "region",
        "region_code",
        "period",
        "pct_hospitals_basic_ehr_notes",
        "pct_rural_hospitals_basic_ehr_notes",
        "pct_small_hospitals_basic_ehr_notes",
        "pct_critical_access_hospitals_basic_ehr_notes",
        "pct_hospitals_basic_ehr_no_notes",
        "pct_rural_hospitals_basic_ehr_no_notes",
        "pct_small_hospitals_basic_ehr_no_notes",
        "pct_critical_access_hospitals_basic_ehr_no_notes",
        "pct_hospitals_cehrt",
        "pct_small_rural_hospitals_cehrt",
        "pct_cah_hospitals_cehrt",
        "pct_hospitals_share_labs_any_outside_provs",
        "pct_hospitals_share_labs_any_outside_hospitals",
        "pct_hospitals_share_labs_any_outside_ambu_provs",
        "pct_hospitals_patients_ecopy_ehr",
        "pct_hospitals_patients_ecopy_discharge_instr",
        "pct_hospitals_share_care_summaries_any_outside_provs",
        "pct_hospitals_share_care_summaries_any_outside_hospitals",
        "pct_hospitals_share_care_summaries_any_outside_ambu_provs",
        "pct_hospitals_patients_vdt",
        "pct_hospitals_patients_secure_message",
        "pct_hospitals_find_clinical_info",
        "pct_hospitals_send_clinical_info",
        "pct_hospitals_receive_clinical_info",
        "pct_hospitals_integrate_any_clinical_info",
        "pct_hospitals_integrate_scr"
})
public class HealthITAPI {

    @JsonProperty("region")
    private String region;
    @JsonProperty("region_code")
    private String regionCode;
    @JsonProperty("period")
    private String period;
    @JsonProperty("pct_hospitals_basic_ehr_notes")
    private String pctHospitalsBasicEhrNotes;
    @JsonProperty("pct_rural_hospitals_basic_ehr_notes")
    private String pctRuralHospitalsBasicEhrNotes;
    @JsonProperty("pct_small_hospitals_basic_ehr_notes")
    private String pctSmallHospitalsBasicEhrNotes;
    @JsonProperty("pct_critical_access_hospitals_basic_ehr_notes")
    private String pctCriticalAccessHospitalsBasicEhrNotes;
    @JsonProperty("pct_hospitals_basic_ehr_no_notes")
    private String pctHospitalsBasicEhrNoNotes;
    @JsonProperty("pct_rural_hospitals_basic_ehr_no_notes")
    private String pctRuralHospitalsBasicEhrNoNotes;
    @JsonProperty("pct_small_hospitals_basic_ehr_no_notes")
    private String pctSmallHospitalsBasicEhrNoNotes;
    @JsonProperty("pct_critical_access_hospitals_basic_ehr_no_notes")
    private String pctCriticalAccessHospitalsBasicEhrNoNotes;
    @JsonProperty("pct_hospitals_cehrt")
    private String pctHospitalsCehrt;
    @JsonProperty("pct_small_rural_hospitals_cehrt")
    private String pctSmallRuralHospitalsCehrt;
    @JsonProperty("pct_cah_hospitals_cehrt")
    private String pctCahHospitalsCehrt;
    @JsonProperty("pct_hospitals_share_labs_any_outside_provs")
    private String pctHospitalsShareLabsAnyOutsideProvs;
    @JsonProperty("pct_hospitals_share_labs_any_outside_hospitals")
    private String pctHospitalsShareLabsAnyOutsideHospitals;
    @JsonProperty("pct_hospitals_share_labs_any_outside_ambu_provs")
    private String pctHospitalsShareLabsAnyOutsideAmbuProvs;
    @JsonProperty("pct_hospitals_patients_ecopy_ehr")
    private String pctHospitalsPatientsEcopyEhr;
    @JsonProperty("pct_hospitals_patients_ecopy_discharge_instr")
    private String pctHospitalsPatientsEcopyDischargeInstr;
    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_provs")
    private String pctHospitalsShareCareSummariesAnyOutsideProvs;
    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_hospitals")
    private String pctHospitalsShareCareSummariesAnyOutsideHospitals;
    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_ambu_provs")
    private String pctHospitalsShareCareSummariesAnyOutsideAmbuProvs;
    @JsonProperty("pct_hospitals_patients_vdt")
    private String pctHospitalsPatientsVdt;
    @JsonProperty("pct_hospitals_patients_secure_message")
    private String pctHospitalsPatientsSecureMessage;
    @JsonProperty("pct_hospitals_find_clinical_info")
    private String pctHospitalsFindClinicalInfo;
    @JsonProperty("pct_hospitals_send_clinical_info")
    private String pctHospitalsSendClinicalInfo;
    @JsonProperty("pct_hospitals_receive_clinical_info")
    private String pctHospitalsReceiveClinicalInfo;
    @JsonProperty("pct_hospitals_integrate_any_clinical_info")
    private String pctHospitalsIntegrateAnyClinicalInfo;
    @JsonProperty("pct_hospitals_integrate_scr")
    private String pctHospitalsIntegrateScr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("region_code")
    public String getRegionCode() {
        return regionCode;
    }

    @JsonProperty("region_code")
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("pct_hospitals_basic_ehr_notes")
    public float getPctHospitalsBasicEhrNotes() {
        return Float.parseFloat(pctHospitalsBasicEhrNotes) * 100;
    }

    @JsonProperty("pct_hospitals_basic_ehr_notes")
    public void setPctHospitalsBasicEhrNotes(String pctHospitalsBasicEhrNotes) {
        this.pctHospitalsBasicEhrNotes = pctHospitalsBasicEhrNotes;
    }

    @JsonProperty("pct_rural_hospitals_basic_ehr_notes")
    public String getPctRuralHospitalsBasicEhrNotes() {
        return pctRuralHospitalsBasicEhrNotes;
    }

    @JsonProperty("pct_rural_hospitals_basic_ehr_notes")
    public void setPctRuralHospitalsBasicEhrNotes(String pctRuralHospitalsBasicEhrNotes) {
        this.pctRuralHospitalsBasicEhrNotes = pctRuralHospitalsBasicEhrNotes;
    }

    @JsonProperty("pct_small_hospitals_basic_ehr_notes")
    public String getPctSmallHospitalsBasicEhrNotes() {
        return pctSmallHospitalsBasicEhrNotes;
    }

    @JsonProperty("pct_small_hospitals_basic_ehr_notes")
    public void setPctSmallHospitalsBasicEhrNotes(String pctSmallHospitalsBasicEhrNotes) {
        this.pctSmallHospitalsBasicEhrNotes = pctSmallHospitalsBasicEhrNotes;
    }

    @JsonProperty("pct_critical_access_hospitals_basic_ehr_notes")
    public String getPctCriticalAccessHospitalsBasicEhrNotes() {
        return pctCriticalAccessHospitalsBasicEhrNotes;
    }

    @JsonProperty("pct_critical_access_hospitals_basic_ehr_notes")
    public void setPctCriticalAccessHospitalsBasicEhrNotes(String pctCriticalAccessHospitalsBasicEhrNotes) {
        this.pctCriticalAccessHospitalsBasicEhrNotes = pctCriticalAccessHospitalsBasicEhrNotes;
    }

    @JsonProperty("pct_hospitals_basic_ehr_no_notes")
    public String getPctHospitalsBasicEhrNoNotes() {
        return pctHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_hospitals_basic_ehr_no_notes")
    public void setPctHospitalsBasicEhrNoNotes(String pctHospitalsBasicEhrNoNotes) {
        this.pctHospitalsBasicEhrNoNotes = pctHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_rural_hospitals_basic_ehr_no_notes")
    public String getPctRuralHospitalsBasicEhrNoNotes() {
        return pctRuralHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_rural_hospitals_basic_ehr_no_notes")
    public void setPctRuralHospitalsBasicEhrNoNotes(String pctRuralHospitalsBasicEhrNoNotes) {
        this.pctRuralHospitalsBasicEhrNoNotes = pctRuralHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_small_hospitals_basic_ehr_no_notes")
    public String getPctSmallHospitalsBasicEhrNoNotes() {
        return pctSmallHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_small_hospitals_basic_ehr_no_notes")
    public void setPctSmallHospitalsBasicEhrNoNotes(String pctSmallHospitalsBasicEhrNoNotes) {
        this.pctSmallHospitalsBasicEhrNoNotes = pctSmallHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_critical_access_hospitals_basic_ehr_no_notes")
    public String getPctCriticalAccessHospitalsBasicEhrNoNotes() {
        return pctCriticalAccessHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_critical_access_hospitals_basic_ehr_no_notes")
    public void setPctCriticalAccessHospitalsBasicEhrNoNotes(String pctCriticalAccessHospitalsBasicEhrNoNotes) {
        this.pctCriticalAccessHospitalsBasicEhrNoNotes = pctCriticalAccessHospitalsBasicEhrNoNotes;
    }

    @JsonProperty("pct_hospitals_cehrt")
    public String getPctHospitalsCehrt() {
        return pctHospitalsCehrt;
    }

    @JsonProperty("pct_hospitals_cehrt")
    public void setPctHospitalsCehrt(String pctHospitalsCehrt) {
        this.pctHospitalsCehrt = pctHospitalsCehrt;
    }

    @JsonProperty("pct_small_rural_hospitals_cehrt")
    public String getPctSmallRuralHospitalsCehrt() {
        return pctSmallRuralHospitalsCehrt;
    }

    @JsonProperty("pct_small_rural_hospitals_cehrt")
    public void setPctSmallRuralHospitalsCehrt(String pctSmallRuralHospitalsCehrt) {
        this.pctSmallRuralHospitalsCehrt = pctSmallRuralHospitalsCehrt;
    }

    @JsonProperty("pct_cah_hospitals_cehrt")
    public String getPctCahHospitalsCehrt() {
        return pctCahHospitalsCehrt;
    }

    @JsonProperty("pct_cah_hospitals_cehrt")
    public void setPctCahHospitalsCehrt(String pctCahHospitalsCehrt) {
        this.pctCahHospitalsCehrt = pctCahHospitalsCehrt;
    }

    @JsonProperty("pct_hospitals_share_labs_any_outside_provs")
    public String getPctHospitalsShareLabsAnyOutsideProvs() {
        return pctHospitalsShareLabsAnyOutsideProvs;
    }

    @JsonProperty("pct_hospitals_share_labs_any_outside_provs")
    public void setPctHospitalsShareLabsAnyOutsideProvs(String pctHospitalsShareLabsAnyOutsideProvs) {
        this.pctHospitalsShareLabsAnyOutsideProvs = pctHospitalsShareLabsAnyOutsideProvs;
    }

    @JsonProperty("pct_hospitals_share_labs_any_outside_hospitals")
    public String getPctHospitalsShareLabsAnyOutsideHospitals() {
        return pctHospitalsShareLabsAnyOutsideHospitals;
    }

    @JsonProperty("pct_hospitals_share_labs_any_outside_hospitals")
    public void setPctHospitalsShareLabsAnyOutsideHospitals(String pctHospitalsShareLabsAnyOutsideHospitals) {
        this.pctHospitalsShareLabsAnyOutsideHospitals = pctHospitalsShareLabsAnyOutsideHospitals;
    }

    @JsonProperty("pct_hospitals_share_labs_any_outside_ambu_provs")
    public String getPctHospitalsShareLabsAnyOutsideAmbuProvs() {
        return pctHospitalsShareLabsAnyOutsideAmbuProvs;
    }

    @JsonProperty("pct_hospitals_share_labs_any_outside_ambu_provs")
    public void setPctHospitalsShareLabsAnyOutsideAmbuProvs(String pctHospitalsShareLabsAnyOutsideAmbuProvs) {
        this.pctHospitalsShareLabsAnyOutsideAmbuProvs = pctHospitalsShareLabsAnyOutsideAmbuProvs;
    }

    @JsonProperty("pct_hospitals_patients_ecopy_ehr")
    public String getPctHospitalsPatientsEcopyEhr() {
        return pctHospitalsPatientsEcopyEhr;
    }

    @JsonProperty("pct_hospitals_patients_ecopy_ehr")
    public void setPctHospitalsPatientsEcopyEhr(String pctHospitalsPatientsEcopyEhr) {
        this.pctHospitalsPatientsEcopyEhr = pctHospitalsPatientsEcopyEhr;
    }

    @JsonProperty("pct_hospitals_patients_ecopy_discharge_instr")
    public String getPctHospitalsPatientsEcopyDischargeInstr() {
        return pctHospitalsPatientsEcopyDischargeInstr;
    }

    @JsonProperty("pct_hospitals_patients_ecopy_discharge_instr")
    public void setPctHospitalsPatientsEcopyDischargeInstr(String pctHospitalsPatientsEcopyDischargeInstr) {
        this.pctHospitalsPatientsEcopyDischargeInstr = pctHospitalsPatientsEcopyDischargeInstr;
    }

    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_provs")
    public String getPctHospitalsShareCareSummariesAnyOutsideProvs() {
        return pctHospitalsShareCareSummariesAnyOutsideProvs;
    }

    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_provs")
    public void setPctHospitalsShareCareSummariesAnyOutsideProvs(String pctHospitalsShareCareSummariesAnyOutsideProvs) {
        this.pctHospitalsShareCareSummariesAnyOutsideProvs = pctHospitalsShareCareSummariesAnyOutsideProvs;
    }

    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_hospitals")
    public String getPctHospitalsShareCareSummariesAnyOutsideHospitals() {
        return pctHospitalsShareCareSummariesAnyOutsideHospitals;
    }

    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_hospitals")
    public void setPctHospitalsShareCareSummariesAnyOutsideHospitals(String pctHospitalsShareCareSummariesAnyOutsideHospitals) {
        this.pctHospitalsShareCareSummariesAnyOutsideHospitals = pctHospitalsShareCareSummariesAnyOutsideHospitals;
    }

    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_ambu_provs")
    public String getPctHospitalsShareCareSummariesAnyOutsideAmbuProvs() {
        return pctHospitalsShareCareSummariesAnyOutsideAmbuProvs;
    }

    @JsonProperty("pct_hospitals_share_care_summaries_any_outside_ambu_provs")
    public void setPctHospitalsShareCareSummariesAnyOutsideAmbuProvs(String pctHospitalsShareCareSummariesAnyOutsideAmbuProvs) {
        this.pctHospitalsShareCareSummariesAnyOutsideAmbuProvs = pctHospitalsShareCareSummariesAnyOutsideAmbuProvs;
    }

    @JsonProperty("pct_hospitals_patients_vdt")
    public String getPctHospitalsPatientsVdt() {
        return pctHospitalsPatientsVdt;
    }

    @JsonProperty("pct_hospitals_patients_vdt")
    public void setPctHospitalsPatientsVdt(String pctHospitalsPatientsVdt) {
        this.pctHospitalsPatientsVdt = pctHospitalsPatientsVdt;
    }

    @JsonProperty("pct_hospitals_patients_secure_message")
    public String getPctHospitalsPatientsSecureMessage() {
        return pctHospitalsPatientsSecureMessage;
    }

    @JsonProperty("pct_hospitals_patients_secure_message")
    public void setPctHospitalsPatientsSecureMessage(String pctHospitalsPatientsSecureMessage) {
        this.pctHospitalsPatientsSecureMessage = pctHospitalsPatientsSecureMessage;
    }

    @JsonProperty("pct_hospitals_find_clinical_info")
    public String getPctHospitalsFindClinicalInfo() {
        return pctHospitalsFindClinicalInfo;
    }

    @JsonProperty("pct_hospitals_find_clinical_info")
    public void setPctHospitalsFindClinicalInfo(String pctHospitalsFindClinicalInfo) {
        this.pctHospitalsFindClinicalInfo = pctHospitalsFindClinicalInfo;
    }

    @JsonProperty("pct_hospitals_send_clinical_info")
    public String getPctHospitalsSendClinicalInfo() {
        return pctHospitalsSendClinicalInfo;
    }

    @JsonProperty("pct_hospitals_send_clinical_info")
    public void setPctHospitalsSendClinicalInfo(String pctHospitalsSendClinicalInfo) {
        this.pctHospitalsSendClinicalInfo = pctHospitalsSendClinicalInfo;
    }

    @JsonProperty("pct_hospitals_receive_clinical_info")
    public String getPctHospitalsReceiveClinicalInfo() {
        return pctHospitalsReceiveClinicalInfo;
    }

    @JsonProperty("pct_hospitals_receive_clinical_info")
    public void setPctHospitalsReceiveClinicalInfo(String pctHospitalsReceiveClinicalInfo) {
        this.pctHospitalsReceiveClinicalInfo = pctHospitalsReceiveClinicalInfo;
    }

    @JsonProperty("pct_hospitals_integrate_any_clinical_info")
    public String getPctHospitalsIntegrateAnyClinicalInfo() {
        return pctHospitalsIntegrateAnyClinicalInfo;
    }

    @JsonProperty("pct_hospitals_integrate_any_clinical_info")
    public void setPctHospitalsIntegrateAnyClinicalInfo(String pctHospitalsIntegrateAnyClinicalInfo) {
        this.pctHospitalsIntegrateAnyClinicalInfo = pctHospitalsIntegrateAnyClinicalInfo;
    }

    @JsonProperty("pct_hospitals_integrate_scr")
    public String getPctHospitalsIntegrateScr() {
        return pctHospitalsIntegrateScr;
    }

    @JsonProperty("pct_hospitals_integrate_scr")
    public void setPctHospitalsIntegrateScr(String pctHospitalsIntegrateScr) {
        this.pctHospitalsIntegrateScr = pctHospitalsIntegrateScr;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}