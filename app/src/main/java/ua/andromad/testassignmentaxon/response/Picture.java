package ua.andromad.testassignmentaxon.response;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Picture implements Parcelable {
    @SerializedName("large")
    private String large;

    @SerializedName("medium")
    private String medium;

    @SerializedName("thumbnail")
    private String thumbnail;

    protected Picture(Parcel in) {
        large = in.readString();
        medium = in.readString();
        thumbnail = in.readString();
    }

    public static final Creator<Picture> CREATOR = new Creator<Picture>() {
        @Override
        public Picture createFromParcel(Parcel in) {
            return new Picture(in);
        }

        @Override
        public Picture[] newArray(int size) {
            return new Picture[size];
        }
    };

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "large='" + large + '\'' +
                ", medium='" + medium + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(large);
        dest.writeString(medium);
        dest.writeString(thumbnail);
    }
}
