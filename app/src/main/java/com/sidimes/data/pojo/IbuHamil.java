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
    private final String mId;

    @Nullable
    @ColumnInfo(name = "nama")
    private final String nama;

    @Nullable
    @ColumnInfo(name = "no_telp")
    private final String no_telp;

    @Nullable
    @ColumnInfo(name = "usia")
    private final String usia;

    @Nullable
    @ColumnInfo(name = "berat_sebelum_hamil")
    private final String berat_sebelum_hamil;

    @Nullable
    @ColumnInfo(name = "berat_saat_ini")
    private final String berat_saat_ini;

    @Nullable
    @ColumnInfo(name = "tinggi_sesudah_hamil")
    private final String tinggi_sesudah_hamil;

    @Nullable
    @ColumnInfo(name = "usia_hamil_saat_ini")
    private final String usia_hamil_saat_ini;

    @Nullable
    @ColumnInfo(name = "lingkar_lengan_atas")
    private final String lingkar_lengan_atas;

    @Nullable
    @ColumnInfo(name = "pendidikan_terakhir")
    private final String pendidikan_terakhir;

    @Nullable
    @ColumnInfo(name = "pendidikan_terakhir_suami")
    private final String pendidikan_terakhir_suami;

    @Nullable
    @ColumnInfo(name = "kadar_hemoglobin")
    private final String kadar_hemoglobin;

    @Nullable
    @ColumnInfo(name = "sifilis_vdrl")
    private final String sifilis_vdrl;

    @Nullable
    @ColumnInfo(name = "hbsag")
    private final String hbsag;

    @Nullable
    @ColumnInfo(name = "hiv")
    private final String hiv;

    @Nullable
    @ColumnInfo(name = "paparan_asap_rokok")
    private final String paparan_asap_rokok;

    @Nullable
    @ColumnInfo(name = "kesulitan_air_berkualitas")
    private final String kesulitan_air_berkualitas;

    @Nullable
    @ColumnInfo(name = "tempat_bab")
    private final String tempat_bab;

    public IbuHamil(@Nullable String usia,
                    @Nullable String nama,
                    @Nullable String no_telp,
                    @Nullable String berat_sebelum_hamil,
                    @Nullable String berat_saat_ini,
                    @Nullable String tinggi_sesudah_hamil,
                    @Nullable String usia_hamil_saat_ini,
                    @Nullable String lingkar_lengan_atas,
                    @Nullable String pendidikan_terakhir,
                    @Nullable String pendidikan_terakhir_suami,
                    @Nullable String kadar_hemoglobin,
                    @Nullable String sifilis_vdrl,
                    @Nullable String hbsag,
                    @Nullable String hiv,
                    @Nullable String paparan_asap_rokok,
                    @Nullable String kesulitan_air_berkualitas,
                    @Nullable String tempat_bab) {

        mId = UUID.randomUUID().toString();
        this.usia = usia;
        this.nama = nama;
        this.no_telp = no_telp;
        this.berat_sebelum_hamil = berat_sebelum_hamil;
        this.berat_saat_ini = berat_saat_ini;
        this.tinggi_sesudah_hamil = tinggi_sesudah_hamil;
        this.usia_hamil_saat_ini = usia_hamil_saat_ini;
        this.lingkar_lengan_atas = lingkar_lengan_atas;
        this.pendidikan_terakhir = pendidikan_terakhir;
        this.pendidikan_terakhir_suami = pendidikan_terakhir_suami;
        this.kadar_hemoglobin = kadar_hemoglobin;
        this.sifilis_vdrl = sifilis_vdrl;
        this.hbsag = hbsag;
        this.hiv = hiv;
        this.paparan_asap_rokok = paparan_asap_rokok;
        this.kesulitan_air_berkualitas = kesulitan_air_berkualitas;
        this.tempat_bab = tempat_bab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IbuHamil object = (IbuHamil) o;
        return Objects.equal(mId, object.mId) &&
                Objects.equal(usia, object.usia) &&
                Objects.equal(nama, object.nama);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mId, nama, no_telp);
    }

    @Override
    public String toString() {
        return "IbuHamil " + nama;
    }
}