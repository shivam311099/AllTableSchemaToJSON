package test;

import java.io.Serializable;
import java.util.List;



/*Model Class to hold particular Table*/

/*Parent*/


@SuppressWarnings("serial")
public class Tables implements Serializable {
	private String tableName;
	private List<Columns> columns;

	public Tables() {
		super();
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Columns> getColumns() {
		return columns;
	}

	public void setColumns(List<Columns> columns) {
		this.columns = columns;
	}

	@Override
	public String toString() {
		return "Tables [tableName=" + tableName + ", columns=" + columns + "]";
	}



}
