package xyz.consentual.cocktailmatrixv4;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "liquor_table")
public class Liquor {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "ID")
    private int mId;
    private String mName;
    private String mDescription;

    public Liquor(@NonNull int id, String name, String description) {
        this.mId = id;
        this.mName = name;
        this.mDescription = description;
    }

    public int getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public String getDescription() {
        return this.mDescription;
    }
}
