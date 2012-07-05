package br.com.suelengc.shapesexamples;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ShapeAdapter extends BaseAdapter {

	private List<Shape> listaShape;
	private LayoutInflater inflater;
	
	public ShapeAdapter(Context context, List<Shape> list) {
		this.listaShape = list;
		this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	public int getCount() {
		return listaShape.size();
	}

	public Shape getItem(int position) {
		return listaShape.get(position);
	}

	public long getItemId(int id) {
		return id;
	}

	public View getView(int position, View view, ViewGroup parent) {
		view = inflater.inflate(R.layout.item_shape, null);
		
		TextView tvResumo = (TextView) view.findViewById(R.id.shapeResumo);
		TextView tvDescricao = (TextView) view.findViewById(R.id.shapeDescricao);
		
		Shape shape = getItem(position);
		
		tvResumo.setText(shape.resumo);
		tvDescricao.setText(shape.descricao);
		
		return view;
	}

}
