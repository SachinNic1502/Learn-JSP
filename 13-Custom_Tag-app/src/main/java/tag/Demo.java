package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo extends TagSupport {
	
	public int side;
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
//		return super.doStartTag();
		int Sside=side*side;
		try {
			JspWriter jw=pageContext.getOut();
			jw.print("<h1>Squre of Area : "+Sside+" </h1>");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
