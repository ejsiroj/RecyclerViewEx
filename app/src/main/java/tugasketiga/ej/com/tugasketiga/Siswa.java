package tugasketiga.ej.com.tugasketiga;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by EJ Public on 29/11/2017.
 */

public class Siswa implements Parcelable {
    String namaSiswa;
    String kelasJurusan;

    public Siswa(String namaSiswa, String kelasJurusan) {
        this.namaSiswa = namaSiswa;
        this.kelasJurusan = kelasJurusan;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public String getKelasJurusan() {
        return kelasJurusan;
    }

    public void setKelasJurusan(String kelasJurusan) {
        this.kelasJurusan = kelasJurusan;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaSiswa);
        dest.writeString(this.kelasJurusan);
    }

    protected Siswa(Parcel in) {
        this.namaSiswa = in.readString();
        this.kelasJurusan = in.readString();
    }

    public static final Parcelable.Creator<Siswa> CREATOR = new Parcelable.Creator<Siswa>() {
        @Override
        public Siswa createFromParcel(Parcel source) {
            return new Siswa(source);
        }

        @Override
        public Siswa[] newArray(int size) {
            return new Siswa[size];
        }
    };
}
