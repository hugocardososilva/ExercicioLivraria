package com.example.exerciciolivraria;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CarrinhoActivity extends Activity implements OnClickListener{
	Double vTotal= 0.0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_carrinho);
		Intent it = getIntent();
		Bundle params= it.getExtras();
		Double valor = params.getDouble("vTotal");
		String nome = params.getString("nome");	
		
		TextView valorTotal= (TextView) findViewById(R.id.valor);
		valorTotal.setText(String.valueOf(valor));
		
		Button botao = (Button) findViewById(R.id.voltar);
		botao.setOnClickListener(this);
	
		
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.carrinho, menu);
		return true;
	}
	public void onClick(View v){
		Intent it= new Intent(this, ListaLivros.class);	
		Bundle params=  new Bundle();
		
		startActivity(it);
		
	}

}
