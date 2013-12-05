package com.example.exerciciolivraria;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaAdapter extends BaseAdapter {
	private Context context;
	private ArrayList<Livro> lista;
	
	public ListaAdapter(Context context, ArrayList<Livro> lista) {
		super();
		this.context = context;
		this.lista = lista;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return lista.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Livro livro = lista.get(position);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v= inflater.inflate(R.layout.layout_livraria, null);
		
		ImageView imagemLivro = (ImageView) v.findViewById(R.id.image);
		imagemLivro.setImageResource(livro.getImagem());
		TextView nome= (TextView) v.findViewById(R.id.nome);
		nome.setText(livro.getNome());
		TextView valor= (TextView) v.findViewById(R.id.valor);
		valor.setText(String.valueOf(livro.getPreco()));
		return v;
		
		
	}

}
