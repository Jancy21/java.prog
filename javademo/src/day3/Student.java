package day3;

public class Student 
{
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + "]";
	}

	private int sid;
	private String sname;
    private String scity;
    
    public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid)
    {
    	this.sid=sid;
    }
    
	
}
