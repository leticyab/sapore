package br.com.sapore;


import java.util.ArrayList;
import java.util.List;

import br.com.sapore.VO.PedidoVO;
import br.com.sapore.dao.cadPedidoDao;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class Pedido extends Activity {
	RadioButton radio;
	RadioGroup rg;
	RadioGroup rg2;
	EditText textRadio;
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cad_pizza);
   
        cadPedidoDao daoPedido = new cadPedidoDao(getApplicationContext());
        
         
        ArrayList<String> listmesa2 = daoPedido.getAllMesa();
        
        SpinnerAdapter mesa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listmesa2);
     
          
        
        final Spinner spnsalum;

        Button btmostrar = (Button) findViewById(R.id.btnCadPedPiz);
        
    
        spnsalum = (Spinner) findViewById(R.id.cadNumMesa);
        
        spnsalum.setAdapter( mesa);  
        
        rg=(RadioGroup) findViewById(R.id.radioGroup1);
        rg2=(RadioGroup) findViewById(R.id.radioGroup2);
        
        
        final String[] saborUm = {"calabresa", "portuguesa", "feijao"};
        ArrayAdapter<String> asaborUm; //array que adapta para o spinner
        final Spinner spnsal2;
        asaborUm = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, saborUm);
        spnsal2 = (Spinner) findViewById(R.id.cadSaborUm);
        spnsal2.setAdapter(asaborUm);
        
           
        final String[] saborDois = {"calabresa", "portuguesa", "feijao"};
        ArrayAdapter<String> asaborDois; //array que adapta para o spinner
        final Spinner spnsal3;
        asaborDois= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, saborDois);
        spnsal3 = (Spinner) findViewById(R.id.cadSaborDois);
        spnsal3.setAdapter(asaborDois);
        
        final String[] saborTres = {"calabresa", "portuguesa", "feijao"};
        ArrayAdapter<String> asaborTres; //array que adapta para o spinner
        final Spinner spnsal4;
        asaborTres= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, saborTres);
        spnsal4 = (Spinner) findViewById(R.id.cadSabortres);
        spnsal4.setAdapter(asaborTres);
        
        final String[] obs = {"calabresa", "portuguesa", "feijao"};
        ArrayAdapter<String> aobs; //array que adapta para o spinner
        final Spinner spnsal5;
        aobs= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, obs);
        spnsal5 = (Spinner) findViewById(R.id.cadObs);
        spnsal5.setAdapter(aobs);
        
        EditText observacao = (EditText) findViewById(R.id.cadTxtObs);
        
        
        	btmostrar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
			
      
    		});
        
        
        
    }

    
}
