package com.example.exerciciolivraria;

import java.io.Serializable;
import java.util.*;


import android.app.ListActivity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ListaLivros  extends ListActivity implements OnClickListener{
	Carrinho car;
	
	
	@Override
	
	
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		
		Livro livro1= new Livro(R.drawable.livro1,"Livro 1","Autor 1","Editora 1", 100.1 , 12345);
		Livro livro2= new Livro(R.drawable.livro2,"Livro 2","Autor 2","Editora 2", 140.1 , 12346);
		Livro livro3= new Livro(R.drawable.livro3,"Livro 2","Autor 2","Editora 2", 149.1 , 12347);
		ArrayList<Livro> list= new ArrayList<Livro>();
		list.add(livro1);
		list.add(livro2);
		list.add(livro3);
		
		setListAdapter(new ListaAdapter(this, list));
		
		Button carrinho= (Button)findViewById(R.id.carrinho);
		carrinho.setOnClickListener(this);
		
		//TextView total= (TextView) findViewById(R.id.total);
		
	}



	public void onListItemClick(ListView l,View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Livro livro = (Livro) this.getListAdapter().getItem(position);
		
		
		
		Intent it= new Intent(this, InfoLivro.class);
		Bundle params= new Bundle();
		params.putString("livro", livro.getNome());
		params.putInt("imagem", livro.getImagem());
		params.putString("editora",livro.getEditora());
		params.putDouble("valor", livro.getPreco());
		params.putInt("isbn", livro.getIsbn());
		params.putString("autor", livro.getAutor());
//		params.putSerializable("livro", (Serializable) livro);
		it.putExtras(params);
		startActivity(it);
		
		
	}



	@Override
	public void onClick(View v) {
		Intent it= new Intent(this, CarrinhoActivity.class);
		Bundle params= new Bundle();
		params.putDouble("total", car.getValorTotal() );
		startActivity(it);
	}
	
	
	
	

}
