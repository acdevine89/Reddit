package reddit.example.com.reddit.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by anniedevine on 11/18/14.
 */
public class RedditObjectModel implements Parcelable {

    private String author, title, body;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.author);
        dest.writeString(this.title);
        dest.writeString(this.body);
    }

    private RedditObjectModel(Parcel in) {
        this.author = in.readString();
        this.title = in.readString();
        this.body = in.readString();
    }

    public static final Parcelable.Creator<RedditObjectModel> CREATOR = new Parcelable.Creator<RedditObjectModel>() {
        public RedditObjectModel createFromParcel(Parcel source) {
            return new RedditObjectModel(source);
        }

        public RedditObjectModel[] newArray(int size) {
            return new RedditObjectModel[size];
        }
    };


}
