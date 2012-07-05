package br.com.suelengc.shapesexamples;

import java.io.ObjectOutputStream.PutField;
import java.util.List;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class ListaShapeActivity extends Activity implements OnItemClickListener, Runnable {
    
	private ListView listView;
	private ProgressDialog progressDialog;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_shape);
        
		listView = (ListView) findViewById(R.id.listview);
		listView.setOnItemClickListener(this);
		
		progressDialog = ProgressDialog.show(this, "Aguarde", "Buscando lista de shapes...");
		
        Thread t = new Thread(this);
        t.start();
    }

	public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
		Shape shape = (Shape) adapter.getAdapter().getItem(position);
		
		Toast toast = Toast.makeText(this, "Shape selecionado: " + shape.resumo, Toast.LENGTH_SHORT);
		toast.show();
		
		Intent intent = new Intent(this, ShapeDetailActivity.class);
		intent.putExtra("shape", shape.id);
		startActivity(intent);
		
	}

	public void run() {
		List<Shape> list;
		
		list = Shape.getListShape();

		final ShapeAdapter shapeAdapter = new ShapeAdapter(this, list);
		
		runOnUiThread(new Runnable() {
			public void run() {
				listView.setAdapter(shapeAdapter);
				
			}
		});
		
		progressDialog.dismiss();
	}
}