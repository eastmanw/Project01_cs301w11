package c301w11.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper
{
	
	public static final String TABLE_PHOTOS = "photos";
	public static final String COLUMN_PHOTO_ID = "photo_id";
	public static final String COLUMN_DESCRIPTION = "description";
	//public static final String COLUMN_TIME_STAMP = "time_stamp";
	public static final String COLUMN_TAG = "tag";
	
	private static final String DATABASE_NAME = "photos.db";
	private static final int DATABASE_VERSION = 1;
	
	private static final String DATABASE_CREATE = "CREATE TABLE " + TABLE_PHOTOS +
			"(" + COLUMN_PHOTO_ID + " INTEGER, " + COLUMN_DESCRIPTION + " TEXT, " + 
			/*COLUMN_TIME_STAMP + " INTEGER, " +*/ COLUMN_TAG + " TEXT NOT NULL);";
	
	public MySQLiteHelper(Context context)
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	public void onCreate(SQLiteDatabase database)
	{
		database.execSQL(DATABASE_CREATE);
	}
	
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		Log.w(MySQLiteHelper.class.getName(),
				"Upgrading darabase from version " + oldVersion + " to " + newVersion + ", " +
						"which will destroy all old data.");
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_PHOTOS);
		onCreate(db);
	}
}
