package br.univel.correcao;

import javax.swing.table.AbstractTableModel;

public class Ex02Model extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private int d1 = 1, d2 = 4, d3 = 8, d4 = 3, d5 = 1, d6 = 5;
	
	
	
	public Ex02Model(String ra) {
		d1 = Integer.parseInt(ra.substring(0 ,1));
		d2 = Integer.parseInt(ra.substring(0 ,4));
		d3 = Integer.parseInt(ra.substring(0 ,3));
		d4 = Integer.parseInt(ra.substring(0 ,1));
		d5 = Integer.parseInt(ra.substring(0 ,5));
	}

	@Override
	public int getColumnCount() {

		return 0;
	}

	@Override
	public int getRowCount() {

		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return null;
	}

}
