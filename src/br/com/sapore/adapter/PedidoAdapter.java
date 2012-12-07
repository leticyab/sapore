package br.com.sapore.adapter;

import java.util.List;

import br.com.sapore.VO.PedidoVO;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PedidoAdapter extends BaseAdapter {
	private Context ctx;
	private List<PedidoVO> lista;
	
	
	
	public PedidoAdapter(Context ctx, List<PedidoVO> lista) {
		super();
		this.ctx = ctx;
		this.lista = lista;
	}

	public Context getCtx() {
		return ctx;
	}

	public void setCtx(Context ctx) {//
		this.ctx = ctx;
	}

	public List<PedidoVO> getLista() {
		return lista;
	}

	public void setLista(List<PedidoVO> lista) {
		this.lista = lista;
	}


	public int getCount() {
		// TODO Auto-generated method stub
		return lista.size();//saber tamanho da lista
	}

	public Object getItem(int position) {//saber a posição
		// TODO Auto-generated method stub
		return lista.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		PedidoVO vo =(PedidoVO) getItem(position);
		LayoutInflater layout = (LayoutInflater)
				ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
View v = layout.inflate(android.R.layout.simple_list_item_1, null);
TextView txtNome=(TextView) v.findViewById(android.R.id.text1);//do listar
txtNome.setText(vo.getObservacao());
		return v;
	}
	

}
