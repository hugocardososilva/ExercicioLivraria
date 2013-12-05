package com.example.exerciciolivraria;

import java.util.ArrayList;

import org.w3c.dom.Text;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoLivro extends Activity implements OnClickListener{
	Carrinho carrinho;
	Livro livro;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_info_livro);
		
		Intent it = getIntent();
		Bundle params= it.getExtras();
		String nome = params.getString("livro");
		int imagem = params.getInt("imagem");
		Double valor= params.getDouble("valor");
		String editora = params.getString("editora");
		String autor= params.getString("autor");
		int isbn= params.getInt("isbn");
		livro= new Livro(imagem, nome, autor, editora, valor, isbn);
		
		
		
		
		
		
		
		
		ImageView img = (ImageView) findViewById(R.id.imagem);
		img.setImageResource(imagem);
	//	img.setImageResource(livro.getImagem());
		
		TextView textnome= (TextView) findViewById(R.id.nome);
		textnome.setText(nome);
		
		TextView texteditora = (TextView)findViewById(R.id.editora);
		texteditora.setText(editora);
		
		
		TextView textautor = (TextView) findViewById(R.id.autor);
		textautor.setText(autor);
		
		TextView textvalor = (TextView) findViewById(R.id.valor);
		textvalor.setText(String.valueOf(valor));
		
		TextView textisbn = (TextView) findViewById(R.id.isbn);
		textisbn.setText(String.valueOf(isbn));
		
		Button botao = (Button) findViewById(R.id.COMPRAR);
		botao.setOnClickListener(this);
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.info_livro, menu);
		return true;
	}

	@Override
	public void onClick(View v)  {
		// TODO Auto-generated method stub
		try {
			
		
			Intent it= new Intent(this, ListaLivros.class);
			Bundle params= new Bundle();
		
//		if (carrinho.getLivros().isEmpty()){
//			ArrayList<Livro> lista= new ArrayList<Livro>();
//			Carrinho carrinho= new Carrinho(lista);
//			carrinho.setLivros(lista);
//		}
//			carrinho.getLivros().add(livro);
//		
//		
		
		
		
		
		
		
		params.putDouble("valor", livro.getPreco());
		
		it.putExtras(params);
		startActivity(it);
		
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
