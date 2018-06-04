package entity;

public class Templ {

	public int tid;
	public String templid;
	public String userid;
	public String content;
	public String class1;
	public String class2;
	public Templ(String templid,String userid,String content,String class1,String class2)
	{
		this.templid=templid;
		this.userid=userid;
		this.content=content;
		this.class1=class1;
		this.class2=class2;
		
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTemplid() {
		return templid;
	}
	public void setTemplid(String templid) {
		this.templid = templid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getClass1() {
		return class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}
	public String getClass2() {
		return class2;
	}
	public void setClass2(String class2) {
		this.class2 = class2;
	}
	
	
}
