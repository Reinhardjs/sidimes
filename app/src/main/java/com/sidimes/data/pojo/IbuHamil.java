package com.sidimes.data.pojo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.common.base.Objects;

import java.util.UUID;

@Entity(tableName = "ibuhamil")
public final class IbuHamil extends BasePojo {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "entryid")
    public String id;

    @Nullable
    @ColumnInfo(name = "nama")
    private String nama;

    @Nullable
    @ColumnInfo(name = "no_telp")
    private String no_telp;

    @Nullable
    @ColumnInfo(name = "usia")
    private String usia;

    @Nullable
    @ColumnInfo(name = "berat_sebelum_hamil")
    private String berat_sebelum_hamil;

    @Nullable
    @ColumnInfo(name = "berat_saat_ini")
    private String berat_saat_ini;

    @Nullable
    @ColumnInfo(name = "tinggi_sesudah_hamil")
    private String tinggi_sesudah_hamil;

    @Nullable
    @ColumnInfo(name = "usia_hamil_saat_ini")
    private String usia_hamil_saat_ini;

    @Nullable
    @ColumnInfo(name = "lingkar_lengan_atas")
    private String lingkar_lengan_atas;

    @Nullable
    @ColumnInfo(name = "pendidikan_terakhir")
    private String pendidikan_terakhir;

    @Nullable
    @ColumnInfo(name = "pendidikan_terakhir_suami")
    private String pendidikan_terakhir_suami;

    @Nullable
    @ColumnInfo(name = "kadar_hemoglobin")
    private String kadar_hemoglobin;

    @Nullable
    @ColumnInfo(name = "sifilis_vdrl")
    private String sifilis_vdrl;

    @Nullable
    @ColumnInfo(name = "hbsag")
    private String hbsag;

    @Nullable
    @ColumnInfo(name = "hiv")
    private String hiv;

    @Nullable
    @ColumnInfo(name = "paparan_asap_rokok")
    private String paparan_asap_rokok;

    @Nullable
    @ColumnInfo(name = "kesulitan_air_berkualitas")
    private String kesulitan_air_berkualitas;

    @Nullable
    @ColumnInfo(name = "tempat_bab")
    private String tempat_bab;

    @Nullable
    public String getNama() {
        return nama;
    }

    @Nullable
    public String getNo_telp() {
        return no_telp;
    }

    @Nullable
    public String getUsia() {
        return usia;
    }

    @Nullable
    public String getBerat_sebelum_hamil() {
        return berat_sebelum_hamil;
    }

    @Nullable
    public String getBerat_saat_ini() {
        return berat_saat_ini;
    }

    @Nullable
    public String getTinggi_sesudah_hamil() {
        return tinggi_sesudah_hamil;
    }

    @Nullable
    public String getUsia_hamil_saat_ini() {
        return usia_hamil_saat_ini;
    }

    @Nullable
    public String getLingkar_lengan_atas() {
        return lingkar_lengan_atas;
    }

    @Nullable
    public String getPendidikan_terakhir() {
        return pendidikan_terakhir;
    }

    @Nullable
    public String getPendidikan_terakhir_suami() {
        return pendidikan_terakhir_suami;
    }

    @Nullable
    public String getKadar_hemoglobin() {
        return kadar_hemoglobin;
    }

    @Nullable
    public String getSifilis_vdrl() {
        return sifilis_vdrl;
    }

    @Nullable
    public String getHbsag() {
        return hbsag;
    }

    @Nullable
    public String getHiv() {
        return hiv;
    }

    @Nullable
    public String getPaparan_asap_rokok() {
        return paparan_asap_rokok;
    }

    @Nullable
    public String getKesulitan_air_berkualitas() {
        return kesulitan_air_berkualitas;
    }

    @Nullable
    public String getTempat_bab() {
        return tempat_bab;
    }

    public void setNama(@Nullable String nama) {
        this.nama = nama;
    }

    public void setNo_telp(@Nullable String no_telp) {
        this.no_telp = no_telp;
    }

    public void setUsia(@Nullable String usia) {
        this.usia = usia;
    }

    public void setBerat_sebelum_hamil(@Nullable String berat_sebelum_hamil) {
        this.berat_sebelum_hamil = berat_sebelum_hamil;
    }

    public void setBerat_saat_ini(@Nullable String berat_saat_ini) {
        this.berat_saat_ini = berat_saat_ini;
    }

    public void setTinggi_sesudah_hamil(@Nullable String tinggi_sesudah_hamil) {
        this.tinggi_sesudah_hamil = tinggi_sesudah_hamil;
    }

    public void setUsia_hamil_saat_ini(@Nullable String usia_hamil_saat_ini) {
        this.usia_hamil_saat_ini = usia_hamil_saat_ini;
    }

    public void setLingkar_lengan_atas(@Nullable String lingkar_lengan_atas) {
        this.lingkar_lengan_atas = lingkar_lengan_atas;
    }

    public void setPendidikan_terakhir(@Nullable String pendidikan_terakhir) {
        this.pendidikan_terakhir = pendidikan_terakhir;
    }

    public void setPendidikan_terakhir_suami(@Nullable String pendidikan_terakhir_suami) {
        this.pendidikan_terakhir_suami = pendidikan_terakhir_suami;
    }

    public void setKadar_hemoglobin(@Nullable String kadar_hemoglobin) {
        this.kadar_hemoglobin = kadar_hemoglobin;
    }

    public void setSifilis_vdrl(@Nullable String sifilis_vdrl) {
        this.sifilis_vdrl = sifilis_vdrl;
    }

    public void setHbsag(@Nullable String hbsag) {
        this.hbsag = hbsag;
    }

    public void setHiv(@Nullable String hiv) {
        this.hiv = hiv;
    }

    public void setPaparan_asap_rokok(@Nullable String paparan_asap_rokok) {
        this.paparan_asap_rokok = paparan_asap_rokok;
    }

    public void setKesulitan_air_berkualitas(@Nullable String kesulitan_air_berkualitas) {
        this.kesulitan_air_berkualitas = kesulitan_air_berkualitas;
    }

    public void setTempat_bab(@Nullable String tempat_bab) {
        this.tempat_bab = tempat_bab;
    }

//    public IbuHamil(@Nullable String usia,
//                    @Nullable String nama,
//                    @Nullable String no_telp,
//                    @Nullable String berat_sebelum_hamil,
//                    @Nullable String berat_saat_ini,
//                    @Nullable String tinggi_sesudah_hamil,
//                    @Nullable String usia_hamil_saat_ini,
//                    @Nullable String lingkar_lengan_atas,
//                    @Nullable String pendidikan_terakhir,
//                    @Nullable String pendidikan_terakhir_suami,
//                    @Nullable String kadar_hemoglobin,
//                    @Nullable String sifilis_vdrl,
//                    @Nullable String hbsag,
//                    @Nullable String hiv,
//                    @Nullable String paparan_asap_rokok,
//                    @Nullable String kesulitan_air_berkualitas,
//                    @Nullable String tempat_bab) {
//
//        mId = UUID.randomUUID().toString();
//        this.usia = usia;
//        this.nama = nama;
//        this.no_telp = no_telp;
//        this.berat_sebelum_hamil = berat_sebelum_hamil;
//        this.berat_saat_ini = berat_saat_ini;
//        this.tinggi_sesudah_hamil = tinggi_sesudah_hamil;
//        this.usia_hamil_saat_ini = usia_hamil_saat_ini;
//        this.lingkar_lengan_atas = lingkar_lengan_atas;
//        this.pendidikan_terakhir = pendidikan_terakhir;
//        this.pendidikan_terakhir_suami = pendidikan_terakhir_suami;
//        this.kadar_hemoglobin = kadar_hemoglobin;
//        this.sifilis_vdrl = sifilis_vdrl;
//        this.hbsag = hbsag;
//        this.hiv = hiv;
//        this.paparan_asap_rokok = paparan_asap_rokok;
//        this.kesulitan_air_berkualitas = kesulitan_air_berkualitas;
//        this.tempat_bab = tempat_bab;
//    }

    public IbuHamil() {
        super.id = UUID.randomUUID().toString();
        id = UUID.randomUUID().toString();
        this.usia = "aaa";
        this.nama = "aaa";
        this.no_telp = "aaa";
        this.berat_sebelum_hamil = "aaa";
        this.berat_saat_ini = "aaa";
        this.tinggi_sesudah_hamil = "aaa";
        this.usia_hamil_saat_ini = "aaa";
        this.lingkar_lengan_atas = "aaa";
        this.pendidikan_terakhir = "aaa";
        this.pendidikan_terakhir_suami = "aaa";
        this.kadar_hemoglobin = "aaa";
        this.sifilis_vdrl = "aaa";
        this.hbsag = "aaa";
        this.hiv = "aaa";
        this.paparan_asap_rokok = "aaa";
        this.kesulitan_air_berkualitas = "aaa";
        this.tempat_bab = "aaa";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IbuHamil object = (IbuHamil) o;
        return Objects.equal(id, object.id) &&
                Objects.equal(usia, object.usia) &&
                Objects.equal(nama, object.nama);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, nama, no_telp);
    }

    @Override
    public String toString() {
        return "IbuHamil " + nama;
    }
}