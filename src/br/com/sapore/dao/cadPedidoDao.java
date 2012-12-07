package br.com.sapore.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.sapore.DB;
import br.com.sapore.VO.PedidoVO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class cadPedidoDao {
private static String table_name ="cadpedido";
private Context ctx;//pegar contexto da interface
private static String[] columns = {"id", "mesa","tamanho","borda","saborUm", "saborDois","saborTres","obs","observacao"};


public cadPedidoDao(Context ctx){
	
	this.ctx= ctx;
	
}

public boolean insert(PedidoVO vo){//vai inserir os dados no banco
	SQLiteDatabase db= new DB(ctx).getWritableDatabase();//escrever no banco
	
	ContentValues ctv = new ContentValues();//pra carregar valor

	ctv.put("mesa", vo.getMesa());
	ctv.put("borda", vo.getBorda());
	ctv.put("tamanho", vo.getTamanho());
	ctv.put("saborUm", vo.getSaborUm());
	ctv.put("saborDois", vo.getSaborDois());
	ctv.put("saborTres", vo.getSaborTres());
	ctv.put("obs", vo.getObs());
	ctv.put("observacao", vo.getObservacao());
	
	return db.insert(table_name, null, ctv)>0;//true false
	
}

public boolean delete (PedidoVO vo){//pego contexto
	
	SQLiteDatabase db = new DB(ctx).getWritableDatabase();
	return(db.delete(table_name, "id=?", new String[]{vo.getId().toString()})>0);//tudo que for int tem que colocar toString
}

public boolean update(PedidoVO vo){
	SQLiteDatabase db = new DB(ctx).getWritableDatabase();
	ContentValues ctv = new ContentValues();
	
	ctv.put("mesa", vo.getMesa());
	ctv.put("obs", vo.getObs());
	
	return (db.update(table_name, ctv, "id=?", new String[]{vo.getId().toString()})>0);
	
}

public PedidoVO getById(Integer ID){
	
	SQLiteDatabase db=new DB(ctx).getReadableDatabase();
	
	Cursor rs = db.query(table_name, columns, "id=?", new String[]{ID.toString()}, null, null,null);
	
	PedidoVO vo = null;
	if(rs.moveToFirst()){//pega o id que passar
		vo=new PedidoVO();
		vo.setId(rs.getInt(rs.getColumnIndex("id")));
	
		vo.setMesa(rs.getString(rs.getColumnIndex("mesa")));
		vo.setTamanho(rs.getString(rs.getColumnIndex("tamanho")));
		vo.setBorda(rs.getString(rs.getColumnIndex("borda")));
		vo.setSaborUm(rs.getString(rs.getColumnIndex("saborUm")));
		vo.setSaborDois(rs.getString(rs.getColumnIndex("saborDois")));
		vo.setSaborTres(rs.getString(rs.getColumnIndex("saborTres")));
		vo.setObs(rs.getString(rs.getColumnIndex("obs")));
		vo.setObservacao(rs.getString(rs.getColumnIndex("observacao")));
	}
	return vo;
	
}

public List<PedidoVO> getAll(){
	
	SQLiteDatabase db =new DB(ctx).getReadableDatabase();
	Cursor rs =db.rawQuery("SELECT * FROM cadpedido", null);
	List<PedidoVO>lista = new ArrayList<PedidoVO>();
	while (rs.moveToNext()){
		PedidoVO vo = new PedidoVO(rs.getInt(0),
			rs.getString(1), rs.getString(2),  rs.getString(3), rs.getString(4),  rs.getString(5),  rs.getString(6),
			 rs.getString(7), rs.getString(8));
		
				
	lista.add(vo);
		
	}
	return lista;
	
}

public ArrayList<String> getAllMesa(){
	
	SQLiteDatabase db =new DB(ctx).getReadableDatabase();
	Cursor rs =db.rawQuery("SELECT mesa FROM cadpedido ", null);
	ArrayList<String>lista = new ArrayList<String>();
	while (rs.moveToNext()){
//		PedidoVO vo = new PedidoVO(rs.getInt(0),
//			rs.getString(1));
		
		lista.add(rs.getString(1));
		Log.e("aaaaaaaaaaaaaa", ""+lista.get(0));
	}
	return lista;
	
}

}
