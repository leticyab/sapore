package br.com.sapore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DB  extends SQLiteOpenHelper{
	
	private static String dbName = "banco.db";
	private static String sqlPedido = "CREATE TABLE [cadpedido]"+
					"([id] INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE," +
					"[mesa] varchar(4), " +
					"[tamanho] varchar(20), " +
					"[borda] varchar(50), " +
					"[saborUm] varchar(50), " +
					"[saborDois] varchar(50), " +
					"[saborTres] varchar(50), " +
					"[obs] varchar(50), " +
					"[observacao] varchar (200));" ;
	
	private static String sqlCliente = "CREATE TABLE [mesa]"+
							"([id] INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE," +
							"[nome] varchar(30)); ";
					
						
	private static int version =1;//versao do meu banco é 1
	

	public DB(Context ctx) {
		super(ctx, dbName, null, version);
	
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
	//db.execSQL(sqlCliente);
	db.execSQL(sqlPedido);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
