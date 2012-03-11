package c301w11.Model;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.Time;

public class PhotosDataSource
{
	private SQLiteDatabase database;
	private MySQLiteHelper dbHelper;
	private String[] allColumns = {MySQLiteHelper.COLUMN_PHOTO_ID, MySQLiteHelper.COLUMN_DESCRIPTION, 
			MySQLiteHelper.COLUMN_TAG};
	
	public PhotosDataSource(Context context)
	{
		dbHelper = new MySQLiteHelper(context);
	}
	
	public void open() throws SQLException
	{
		database = dbHelper.getWritableDatabase();
	}
	public void close()
	{
		dbHelper.close();
	}
	
	/*
	 * Parameters of the query() method.
	 * 
	 * Parameter:           Comment:
	 * String dbName	    The table name to compile the query against.
	 * int[] columnNames	A list of which table columns to return. Passing "null" will return all columns.
	 * String whereClause	Where-clause, i.e. filter for the selection of data, null will select all data.
	 * String[] selectionArgs	You may include ?s in the "whereClause"". These placeholders will get replaced by the values from the selectionArgs array.
	 * String[] groupBy	    A filter declaring how to group rows, null will cause the rows to not be grouped.
	 * String[] having	    Filter for the groups, null means no filter.
	 * String[] orderBy	    Table columns which will be used to order the data, null means no ordering.
	 */
	public Photo createPhoto(String description, String tag)
	{
		Time time = new Time();
		time.setToNow();
		long photo_id = time.second + time.minute*100L + time.hour*10000L + time.monthDay*1000000L + 
				(time.month+1)*100000000L + time.year*10000000000L;
		database.execSQL("INSERT INTO " + MySQLiteHelper.TABLE_PHOTOS + 
				" VALUES (" + photo_id + ", " + "'" + description + "'" + ", " + 
				"'" + tag +"'" + ");");
		Cursor cursor = database.query(MySQLiteHelper.TABLE_PHOTOS, null, 
				MySQLiteHelper.COLUMN_PHOTO_ID + " = " + photo_id, null, null, null, null);
		cursor.moveToFirst();
		return cursorToPhoto(cursor);
	}
	public void deletePhoto(Photo photo)
	{
		long photo_id = photo.getId();
		System.out.println("Photo deleted with id: " + photo_id);
		database.delete(MySQLiteHelper.TABLE_PHOTOS, MySQLiteHelper.COLUMN_PHOTO_ID +
				 " = " + photo_id, null);
	}
	public List<Photo> getAllPhotos()
	{
		List<Photo> photos = new ArrayList<Photo>();
		Cursor cursor = database.query(MySQLiteHelper.TABLE_PHOTOS,
				allColumns, null, null, null, null, null);
		cursor.moveToFirst();
		while(!cursor.isAfterLast())
		{
			Photo photo = cursorToPhoto(cursor);
			photos.add(photo);
			cursor.moveToNext();
		}
		cursor.close();
		return photos;
	}
	private Photo cursorToPhoto(Cursor cursor)
	{
		Photo photo = new Photo();
		photo.setId(cursor.getLong(0));
		photo.setDescription(cursor.getString(1));
		photo.setTag(cursor.getString(2));
		return photo;
	}
}
