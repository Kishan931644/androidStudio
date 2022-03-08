import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DbConfig extends SQLiteOpenHelper {
    private static final String DB_NAME = "Money";
    private static final String TABLE_NAME = "budget_data";

    public DbConfig(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createQuery = "CREATE TABLE  " + TABLE_NAME + " (id INTEGER, money INTEGER, description VARCHAR, createdDate DATE)";
        db.execSQL(createQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String dropTable = "DROP TABLE " + TABLE_NAME + "";
        db.execSQL(dropTable);
    }

    public boolean addBudget(String money, String description, String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("money",money);
        cv.put("description",description);
        cv.put("createdDate",date);

        db.insert(TABLE_NAME,null,cv);
        db.close();
        return true;
    }

}
