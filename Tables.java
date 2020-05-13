package test;

import java.io.Serializable;
import java.util.List;



/*Model Class to hold particular Table*/



@SuppressWarnings("serial")
public class Tables implements Serializable {
	private String tableName;
	private List<String> colName;
	private List<String> colType;
	public Tables() {
		super();
	}
	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<String> getColName() {
		return colName;
	}

	public void setColName(List<String> colName) {
		this.colName = colName;
	}

	public List<String> getColType() {
		return colType;
	}

	public void setColType(List<String> colType) {
		this.colType = colType;
	}

	@Override
	public String toString() {
		return "Tables [tableName=" + tableName + ", colName=" + colName + ", colType=" + colType + "]";
	}
	
	
}
