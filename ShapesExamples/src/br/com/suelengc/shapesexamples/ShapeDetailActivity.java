package br.com.suelengc.shapesexamples;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;

public class ShapeDetailActivity extends Activity {

	private static final int SHAPE_RACTANGLE_LINEAR_GRADIENT = 1;
	private static final int SHAPE_RACTANGLE_RADIUS_GRADIENT = 2;
	private static final int SHAPE_OVAL = 3;
	private static final int SHAPE_RING = 4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shape_datail);
		
		Intent i = getIntent();
		int shapeType = i.getIntExtra("shape", 1);
		
		switch (shapeType) {
		
		case SHAPE_RACTANGLE_LINEAR_GRADIENT:
			getWindow().setBackgroundDrawableResource(R.drawable.shape_rectangle_linear_gradient);
			break;
			
		case SHAPE_RACTANGLE_RADIUS_GRADIENT:
			getWindow().setBackgroundDrawableResource(R.drawable.shape_rectangle_radius_gradient);
			break;

		case SHAPE_OVAL:
			getWindow().setBackgroundDrawableResource(R.drawable.shape_oval);
			break;
			
		case SHAPE_RING:
			getWindow().setBackgroundDrawableResource(R.drawable.shape_ring);
			break;
			
		default:
			getWindow().setBackgroundDrawableResource(R.drawable.shape_rectangle_linear_gradient);
			
		}
		
	}
}
