package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcomeJSF_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_size;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_validateLongRange_minimum_maximum;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_message_for;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_convertDateTime_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_type_action_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_size = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_validateLongRange_minimum_maximum = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_message_for = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_convertDateTime_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_type_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_form.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_h_inputText_value_size.release();
    _jspx_tagPool_f_validateLongRange_minimum_maximum.release();
    _jspx_tagPool_h_message_for.release();
    _jspx_tagPool_h_inputText_value.release();
    _jspx_tagPool_f_convertDateTime_pattern_nobody.release();
    _jspx_tagPool_h_commandButton_value_type_action_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id6");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    <html>\r\n");
        out.write("        <head>\r\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
        out.write("            <title>Dollar to Rub</title>\r\n");
        out.write("        </head>\r\n");
        out.write("        <body>\r\n");
        out.write("            ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </body>\r\n");
        out.write("    </html>\r\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_0.setJspId("id15");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <h1>");
        if (_jspx_meth_h_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</h1>\r\n");
        out.write("            <br>\r\n");
        out.write("            <h3>\r\n");
        out.write("                Курс доллара США:\r\n");
        out.write("                ");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("         \r\n");
        out.write("            <br>\r\n");
        out.write("\r\n");
        out.write("             Всего\r\n");
        out.write("             ");
        if (_jspx_meth_h_inputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             долларов\r\n");
        out.write("            </h3>\r\n");
        out.write("            <br>\r\n");
        out.write("            <h4>\r\n");
        out.write("             Введите дату (гггг-мм-дд):\r\n");
        out.write("             ");
        if (_jspx_meth_h_inputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            </h4>\r\n");
        out.write("\r\n");
        out.write("            <br>\r\n");
        out.write("                ");
        if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_0.setJspId("id18");
    _jspx_th_h_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Перевод денег", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_0.setJspId("id22");
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{ManagedBeanRequest.rub}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_0.setSize(org.apache.jasper.runtime.PageContextImpl.getValueExpression("1", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_eval_h_inputText_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_inputText_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_inputText_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_inputText_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                     ");
        if (_jspx_meth_f_validateLongRange_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_inputText_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_h_inputText_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_inputText_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_size.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_size.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_f_validateLongRange_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_inputText_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:validateLongRange
    com.sun.faces.taglib.jsf_core.ValidateLongRangeTag _jspx_th_f_validateLongRange_0 = (com.sun.faces.taglib.jsf_core.ValidateLongRangeTag) _jspx_tagPool_f_validateLongRange_minimum_maximum.get(com.sun.faces.taglib.jsf_core.ValidateLongRangeTag.class);
    _jspx_th_f_validateLongRange_0.setPageContext(_jspx_page_context);
    _jspx_th_f_validateLongRange_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_inputText_0);
    _jspx_th_f_validateLongRange_0.setMaximum(org.apache.jasper.runtime.PageContextImpl.getValueExpression("1000", (PageContext)_jspx_page_context, java.lang.Long.class, null));
    _jspx_th_f_validateLongRange_0.setMinimum(org.apache.jasper.runtime.PageContextImpl.getValueExpression("0", (PageContext)_jspx_page_context, java.lang.Long.class, null));
    int _jspx_eval_f_validateLongRange_0 = _jspx_th_f_validateLongRange_0.doStartTag();
    if (_jspx_eval_f_validateLongRange_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                         ");
        if (_jspx_meth_h_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_validateLongRange_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                     ");
        int evalDoAfterBody = _jspx_th_f_validateLongRange_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_validateLongRange_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_validateLongRange_minimum_maximum.reuse(_jspx_th_f_validateLongRange_0);
      return true;
    }
    _jspx_tagPool_f_validateLongRange_minimum_maximum.reuse(_jspx_th_f_validateLongRange_0);
    return false;
  }

  private boolean _jspx_meth_h_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_validateLongRange_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_0.setPageContext(_jspx_page_context);
    _jspx_th_h_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_validateLongRange_0);
    _jspx_th_h_message_0.setJspId("id26");
    _jspx_th_h_message_0.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("rub", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_message_0 = _jspx_th_h_message_0.doStartTag();
    if (_jspx_eval_h_message_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_message_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_message_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_message_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                             Введите число корректно.\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_message_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_message_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_for.reuse(_jspx_th_h_message_0);
      return true;
    }
    _jspx_tagPool_h_message_for.reuse(_jspx_th_h_message_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_1.setJspId("id32");
    _jspx_th_h_inputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{ManagedBeanRequest.dollar}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_inputText_1.setSize(org.apache.jasper.runtime.PageContextImpl.getValueExpression("1", (PageContext)_jspx_page_context, int.class, null));
    int _jspx_eval_h_inputText_1 = _jspx_th_h_inputText_1.doStartTag();
    if (_jspx_eval_h_inputText_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_inputText_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_inputText_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_inputText_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                     ");
        if (_jspx_meth_f_validateLongRange_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_inputText_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_h_inputText_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_inputText_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_inputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_size.reuse(_jspx_th_h_inputText_1);
      return true;
    }
    _jspx_tagPool_h_inputText_value_size.reuse(_jspx_th_h_inputText_1);
    return false;
  }

  private boolean _jspx_meth_f_validateLongRange_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_inputText_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:validateLongRange
    com.sun.faces.taglib.jsf_core.ValidateLongRangeTag _jspx_th_f_validateLongRange_1 = (com.sun.faces.taglib.jsf_core.ValidateLongRangeTag) _jspx_tagPool_f_validateLongRange_minimum_maximum.get(com.sun.faces.taglib.jsf_core.ValidateLongRangeTag.class);
    _jspx_th_f_validateLongRange_1.setPageContext(_jspx_page_context);
    _jspx_th_f_validateLongRange_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_inputText_1);
    _jspx_th_f_validateLongRange_1.setMaximum(org.apache.jasper.runtime.PageContextImpl.getValueExpression("1000", (PageContext)_jspx_page_context, java.lang.Long.class, null));
    _jspx_th_f_validateLongRange_1.setMinimum(org.apache.jasper.runtime.PageContextImpl.getValueExpression("0", (PageContext)_jspx_page_context, java.lang.Long.class, null));
    int _jspx_eval_f_validateLongRange_1 = _jspx_th_f_validateLongRange_1.doStartTag();
    if (_jspx_eval_f_validateLongRange_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                         ");
        if (_jspx_meth_h_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_validateLongRange_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                     ");
        int evalDoAfterBody = _jspx_th_f_validateLongRange_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_f_validateLongRange_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_validateLongRange_minimum_maximum.reuse(_jspx_th_f_validateLongRange_1);
      return true;
    }
    _jspx_tagPool_f_validateLongRange_minimum_maximum.reuse(_jspx_th_f_validateLongRange_1);
    return false;
  }

  private boolean _jspx_meth_h_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_validateLongRange_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:message
    com.sun.faces.taglib.html_basic.MessageTag _jspx_th_h_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.MessageTag.class) : new com.sun.faces.taglib.html_basic.MessageTag();
    _jspx_th_h_message_1.setPageContext(_jspx_page_context);
    _jspx_th_h_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_validateLongRange_1);
    _jspx_th_h_message_1.setJspId("id36");
    _jspx_th_h_message_1.setFor(org.apache.jasper.runtime.PageContextImpl.getValueExpression("dollar", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_message_1 = _jspx_th_h_message_1.doStartTag();
    if (_jspx_eval_h_message_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_message_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_message_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_message_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                             Введите число корректно.\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_h_message_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_message_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_message_for.reuse(_jspx_th_h_message_1);
      return true;
    }
    _jspx_tagPool_h_message_for.reuse(_jspx_th_h_message_1);
    return false;
  }

  private boolean _jspx_meth_h_inputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_inputText_2.setJspId("id44");
    _jspx_th_h_inputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{ManagedBeanRequest.data}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_inputText_2 = _jspx_th_h_inputText_2.doStartTag();
    if (_jspx_eval_h_inputText_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_inputText_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_inputText_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_inputText_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                 ");
        if (_jspx_meth_f_convertDateTime_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_inputText_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("             ");
        int evalDoAfterBody = _jspx_th_h_inputText_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_inputText_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_inputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value.reuse(_jspx_th_h_inputText_2);
      return true;
    }
    _jspx_tagPool_h_inputText_value.reuse(_jspx_th_h_inputText_2);
    return false;
  }

  private boolean _jspx_meth_f_convertDateTime_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_inputText_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:convertDateTime
    com.sun.faces.taglib.jsf_core.ConvertDateTimeTag _jspx_th_f_convertDateTime_0 = (com.sun.faces.taglib.jsf_core.ConvertDateTimeTag) _jspx_tagPool_f_convertDateTime_pattern_nobody.get(com.sun.faces.taglib.jsf_core.ConvertDateTimeTag.class);
    _jspx_th_f_convertDateTime_0.setPageContext(_jspx_page_context);
    _jspx_th_f_convertDateTime_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_inputText_2);
    _jspx_th_f_convertDateTime_0.setPattern(org.apache.jasper.runtime.PageContextImpl.getValueExpression("yyyy-mm-dd", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_f_convertDateTime_0 = _jspx_th_f_convertDateTime_0.doStartTag();
    if (_jspx_th_f_convertDateTime_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_convertDateTime_pattern_nobody.reuse(_jspx_th_f_convertDateTime_0);
      return true;
    }
    _jspx_tagPool_f_convertDateTime_pattern_nobody.reuse(_jspx_th_f_convertDateTime_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id51");
    _jspx_th_h_commandButton_0.setType(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Submit", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("Подсчитать", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{ManagedBeanRequest.Count}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_type_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_type_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }
}
