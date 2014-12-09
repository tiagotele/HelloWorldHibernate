package com.teago.main;

import com.teago.dao.ModeloGenericoTesteDAO;
import com.teago.model.ModeloGenericoTeste;

public class Main {
	
	public static void main(String[] args) {
		ModeloGenericoTesteDAO modeloGenericoDAO = new ModeloGenericoTesteDAO();
		
		modeloGenericoDAO.listarModeloGenericoTeste();
		ModeloGenericoTeste md1 = new ModeloGenericoTeste( "c1", "c2");
		ModeloGenericoTeste md2 = new ModeloGenericoTeste( "cc1", "cc2");
		modeloGenericoDAO.savenModeloGenerico(md1);
		modeloGenericoDAO.savenModeloGenerico(md2);
		modeloGenericoDAO.listarModeloGenericoTeste();
	}
}
