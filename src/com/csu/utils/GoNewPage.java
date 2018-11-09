package com.csu.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class GoNewPage extends Object {
    /**
     * GoNewPage constructor comment.
     */
    public GoNewPage() {
	super();
    }

    public void closeWindow(PrintWriter out) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Close</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    window.close();");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while closing window.</p>");
	}
    }

    public void go(PrintWriter out, String url) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    window.location.replace(\"").append(url).append("\");");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }

    public void goNo(PrintWriter out, String url) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    window.location.replace(\"").append(url).append("\");");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }

    public void goP(PrintWriter out, String url) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    window.parent.location.replace(\"").append(url).append("\");");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }

    public void goOff(PrintWriter out, String url) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");

	    outHTML.append("function getCookie(name)");
	    outHTML.append("{");
	    outHTML.append("    var prefix = name + \"=\";");
	    outHTML.append("    var cookieStartIndex = document.cookie.indexOf(prefix);");
	    outHTML.append("    if (cookieStartIndex == -1)");
	    outHTML.append("       return null;");
	    outHTML.append("    var cookieEndIndex = document.cookie.indexOf(\";\", cookieStartIndex + prefix.length);");
	    outHTML.append("    if (cookieEndIndex == -1)");
	    outHTML.append("       cookieEndIndex = document.cookie.length;");
	    outHTML.append("    return unescape(document.cookie.substring(cookieStartIndex + prefix.length, cookieEndIndex));");
	    outHTML.append("}");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    window.parent.location.replace(getCookie(\"originalPage\");");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }

    public void openWindow(PrintWriter out, String url) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    var features;");
	    outHTML.append(
		    "    features = \"channelmode=no,directories=no,fullscreen=no,location=no,menubar=no,status=no,titlebar=yes,toolbar=no,resizable=yes,scrollbars=yes\";");
	    outHTML.append("    window.open(\"").append(url).append("\", null, features);");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }

    public void openWindow(PrintWriter out, String url, String height, String width) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    var features;");
	    outHTML.append("    features = \"channelmode=no,directories=no,fullscreen=no,height=").append(height)
		    .append(",location=no,menubar=no,status=no,titlebar=yes,toolbar=no,resizable=yes,scrollbars=yes,width=").append(width).append("\";");
	    outHTML.append("    window.open(\"").append(url).append("\", null, features);");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }

    public void openWindow2(PrintWriter out, String url) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    window.open(\"").append(url).append("\");");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }

    public void closeFrame(PrintWriter out) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Close</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    javascript:parent.document.all(\"subFrame\").style.display=\"none\";");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while closing frame.</p>");
	}
    }

    public void goBlank(HttpServletRequest req, PrintWriter out) throws IOException {
	StringBuffer outHTML = new StringBuffer();

	try {
	    @SuppressWarnings("unused")
	    HttpSession session = req.getSession();

	    outHTML.append("<html>");

	    outHTML.append("<head>");
	    outHTML.append("<title>Go</title>");
	    outHTML.append("</head>");

	    outHTML.append("<script>");

	    outHTML.append("    window.location.replace(\"BlankPage.do\");");

	    outHTML.append("</script>");

	    outHTML.append("<body>");
	    outHTML.append("</body>");

	    outHTML.append("</html>");

	    out.write(outHTML.toString());
	} catch (Exception e) {
	    System.err.println(outHTML.toString());
	    System.err.println("Error occurred while attempting to navigate to new page:  (" + this.getClass().getName() + ")" + e.getMessage());
	}
    }
}
