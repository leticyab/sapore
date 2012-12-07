package br.com.sapore;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
 

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btnPedidoMain).setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(new Intent(getBaseContext(),Pedido.class));
				
			}
		});
        
    //    findViewById(R.id.btnPedBebidaMain).setOnClickListener(new View.OnClickListener() {
			
	//		public void onClick(View v) {
	//			startActivity(new Intent(getBaseContext(),Pedido.class));
				
	//		}
	//	});
        
     //   findViewById(R.id.btnMesaMain).setOnClickListener(new View.OnClickListener() {
			
	//		public void onClick(View v) {
	//			startActivity(new Intent(getBaseContext(),Mesa.class));
	//			
	//		}
	//	});
        
 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
