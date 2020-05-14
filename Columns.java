package test;

import java.io.Serializable;

/*Child*/


@SuppressWarnings("serial")
public class Columns implements Serializable {
	private String colname;
	private String coltype;
	public Columns() {
		super();
	}
	public String getColname() {
		return colname;
	}
	public void setColname(String colname) {
		this.colname = colname;
	}
	public String getColtype() {
		return coltype;
	}
	public void setColtype(String coltype) {
		this.coltype = coltype;
	}
	@Override
	public String toString() {
		return "Columns [colname=" + colname + ", coltype=" + coltype + "]";
	}

}
