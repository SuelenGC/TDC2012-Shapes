package br.com.suelengc.shapesexamples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shape implements Serializable {

	public int id;
	public String resumo;
	public String descricao;
	
	public static List<Shape> getListShape() {
		List<Shape> shapes = new ArrayList<Shape>();
		Shape shape;
		
		shape = new Shape(1, "Shape Retangular 1", "Shape retangular com fundo gradiente linear.");
		shapes.add(shape);
		
		shape = new Shape(2, "Shape Retangular 2", "Shape retangular com fundo radiente curvo.");
		shapes.add(shape);
		
		shape = new Shape(3, "Shape Oval 1", "Shape oval.");
		shapes.add(shape);
		
		shape = new Shape(4, "Shape Anel 1", "Shape anelado.");
		shapes.add(shape);
		
		/* A implementar
		shape = new Shape(4, "Shape Linear 1", "Shape linear.");
		shapes.add(shape);
		
		*/
		
		return shapes; 
	}

	public Shape(int id, String resumo,  String descricao) {
		this.id = id;
		this.resumo = resumo;
		this.descricao = descricao;
	}
}
