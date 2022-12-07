package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
//import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class Welcome extends TagSupport{
	
	
	public String msg; 
	
	
public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}


@Override
public int doStartTag() throws JspException {
	// TODO Auto-generated method stub
//	return super.doStartTag();
	try {
		JspWriter jw=pageContext.getOut();
		jw.print("<h1>Welcome : "+msg+"</h1>");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return SKIP_BODY;
}
}
