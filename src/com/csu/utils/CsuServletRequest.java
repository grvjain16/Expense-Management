package com.csu.utils;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibm.json.java.JSONObject;

public class CsuServletRequest extends Object {

	public CsuServletRequest() {

		super();

	}

	public static final double getDoubleParameter(HttpServletRequest request, String parameterName, double defaultValue) {
		try {

			return request.getParameter(parameterName) == null ? defaultValue : Double.parseDouble(request.getParameter(parameterName));

		} catch (Exception e) {

			return defaultValue;

		}

	}

	public static final float getFloatParameter(HttpServletRequest request, String parameterName, float defaultValue) {
		try {

			return request.getParameter(parameterName) == null ? defaultValue : Float.parseFloat(request.getParameter(parameterName));

		} catch (Exception e) {

			return defaultValue;

		}

	}

	public static final int getIntParameter(HttpServletRequest request, String parameterName, int defaultValue) {
		try {

			return request.getParameter(parameterName) == null ? defaultValue : Integer.parseInt(request.getParameter(parameterName).trim());

		} catch (Exception e) {

			return defaultValue;

		}
	}

	public static final boolean getBooleanParameter(HttpServletRequest request, String parameterName, boolean defaultValue) {
		try {

			return request.getParameter(parameterName) == null ? defaultValue : Boolean.parseBoolean(request.getParameter(parameterName));

		} catch (Exception e) {

			return defaultValue;

		}
	}

	public static final short getShortParameter(HttpServletRequest request, String parameterName, short defaultValue) {
		try {

			return request.getParameter(parameterName) == null ? defaultValue : Short.parseShort(request.getParameter(parameterName));

		} catch (Exception e) {

			return defaultValue;

		}
	}

	public static final long getLongParameter(HttpServletRequest request, String parameterName, long defaultValue) {
		try {

			return request.getParameter(parameterName) == null ? defaultValue : Long.parseLong(request.getParameter(parameterName));

		} catch (Exception e) {

			return defaultValue;

		}
	}

	public static final String getStringParameter(HttpServletRequest request, String parameterName, String defaultValue) {
		try {

			return request.getParameter(parameterName) == null ? defaultValue : request.getParameter(parameterName);

		} catch (Exception e) {

			return defaultValue;

		}

	}

	public static final String[] getStringParameterValues(HttpServletRequest request, String parameterName, String defaultValue) {

		String defaultReturn[] = new String[1];
		defaultReturn[0] = defaultValue;

		try {

			return request.getParameterValues(parameterName) == null ? defaultReturn : request.getParameterValues(parameterName);

		} catch (Exception e) {

			return defaultReturn;

		}

	}

	public static final String getStringAttribute(HttpServletRequest request, String attributeName, String defaultValue) {

		try {

			return request.getAttribute(attributeName) == null ? defaultValue : (String) request.getAttribute(attributeName);

		} catch (Exception e) {

			return defaultValue;

		}
	}

	public static final String getStringAttribute(HttpServletRequest request, String attributeName) {

		try {

			return request.getAttribute(attributeName) == null ? getStringParameter(request, attributeName, "") : (String) request.getAttribute(attributeName);

		} catch (Exception e) {

			return "";

		}
	}

	public static final int getIntAttribute(HttpServletRequest request, String attributeName, int defaultValue) {

		try {

			return request.getAttribute(attributeName) == null ? defaultValue : ((Integer) request.getAttribute(attributeName)).intValue();

		} catch (Exception e) {

			return defaultValue;

		}

	}

	public static final int getIntAttribute(HttpServletRequest request, String attributeName) {

		try {

			return request.getAttribute(attributeName) == null ? getIntParameter(request, attributeName, 0)
					: ((Integer) request.getAttribute(attributeName)).intValue();

		} catch (Exception e) {

			return 0;

		}
	}

	public static final long getLongAttribute(HttpServletRequest request, String attributeName, long defaultValue) {

		try {

			return request.getAttribute(attributeName) == null ? defaultValue : ((Long) request.getAttribute(attributeName)).longValue();

		} catch (Exception e) {

			return defaultValue;

		}
	}

	public static final long getLongAttribute(HttpServletRequest request, String attributeName) {

		try {

			return request.getAttribute(attributeName) == null ? getLongParameter(request, attributeName, 0)
					: ((Long) request.getAttribute(attributeName)).longValue();

		} catch (Exception e) {

			return 0;

		}
	}

	public static final double getDoubleAttribute(HttpServletRequest request, String attributeName, double defaultValue) {

		try {

			return request.getAttribute(attributeName) == null ? defaultValue : ((Double) request.getAttribute(attributeName)).doubleValue();

		} catch (Exception e) {

			return defaultValue;

		}
	}

	public static final double getDoubleAttribute(HttpServletRequest request, String attributeName) {

		try {

			return request.getAttribute(attributeName) == null ? getDoubleParameter(request, attributeName, 0)
					: ((Double) request.getAttribute(attributeName)).doubleValue();

		} catch (Exception e) {

			return 0;

		}
	}

	public static final String[] getStringAttributeValues(HttpServletRequest request, String attributeName, String defaultValue) {

		String defaultReturn[] = new String[1];
		defaultReturn[0] = defaultValue;

		try {

			return request.getAttribute(attributeName) == null ? defaultReturn : (String[]) request.getAttribute(attributeName);

		} catch (Exception e) {

			return defaultReturn;

		}
	}

	public static final String[] getStringAttributeValues(HttpServletRequest request, String attributeName) {

		String defaultReturn[] = new String[1];
		defaultReturn[0] = "";

		try {

			return request.getAttribute(attributeName) == null ? getStringParameterValues(request, attributeName, "")
					: (String[]) request.getAttribute(attributeName);

		} catch (Exception e) {

			return defaultReturn;

		}

	}

	public static final HttpSession getSession(HttpServletRequest req) throws Exception {

		try {

			HttpSession session = req.getSession(false);

			return session;

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

	public static final HttpSession getSession(HttpServletRequest req, PrintWriter out) throws Exception {

		try {

			try {

				HttpSession session = req.getSession(false);

				if (session == null) {

					GoNewPage go = new GoNewPage();

					go.goP(out, "/" + req.getContextPath() + "/LogoffSession.do");

				}

				return session;

			} catch (Exception e) {

				GoNewPage go = new GoNewPage();

				go.goP(out, "/" + req.getContextPath() + "/LogoffSession.do");
				return null;

			}

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

	public static final HttpSession getSession(HttpServletRequest req, HttpServletResponse res) throws Exception {

		try {

			HttpSession session = req.getSession(false);

			if (session == null) {

				res.sendRedirect(req.getContextPath() + "/default.jsp");

			}

			return session;

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

	public static final JSONObject getMessageBodyJSON(HttpServletRequest req) throws Exception {

		try {

			StringBuffer jb = new StringBuffer();
			String line = null;

			BufferedReader reader = req.getReader();
			while ((line = reader.readLine()) != null) {
				jb.append(line);
			}
			JSONObject jsonObject = JSONObject.parse(jb.toString());

			return jsonObject;

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

	public static final String getMessageBodyString(HttpServletRequest req) throws Exception {

		try {

			StringBuffer jb = new StringBuffer();
			String line = null;

			BufferedReader reader = req.getReader();
			while ((line = reader.readLine()) != null) {
				jb.append(line);
			}

			return jb.toString();

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

	public static final String getSortParameter(HttpServletRequest request) throws Exception {

		try {

			String sortSequence = CsuServletRequest.getStringParameter(request, "sord", "asc");
			String sortColumn = sortSequence.equals("asc") ? "+" : "-";
			sortColumn += CsuServletRequest.getStringParameter(request, "sidx", "");

			return sortColumn;

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

	public static final int[] getRange(HttpServletRequest request) throws Exception {

		try {

			int[] range = new int[2];
			Arrays.fill(range, 0);

			String pageRange = request.getHeader("Range");
			if (pageRange != null) {

				int i = 0;
				StringTokenizer stx = new StringTokenizer(pageRange, "=-");
				while (stx.hasMoreTokens()) {

					String part = stx.nextToken();

					switch (++i) {

					case 2:
						range[0] = Integer.parseInt(part);
						break;
					case 3:
						range[1] = Integer.parseInt(part);
						break;
					}

				}

			}

			return range;

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

	public static final void setRangeResponse(HttpServletResponse response, int start, int end, int total) throws Exception {

		try {

			StringBuffer rangeResponse = new StringBuffer("items ");
			rangeResponse.append(start).append("-").append(total < (end - start) ? total : (end - start)).append("/").append(total);
			response.setHeader("Content-Range", rangeResponse.toString());

			return;

		} catch (Exception e) {

			e.printStackTrace();
			throw e;

		}

	}

}
