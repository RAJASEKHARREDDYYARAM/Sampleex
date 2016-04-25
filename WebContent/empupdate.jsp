
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<h1><bean:message key="title"/></h1>

<html:form action="empupdate">
<pre>
<bean:message key="id"/><html:text property="id"/><html:errors property="id"/>
<bean:message key="name"/><html:text property="name"/><html:errors property="name"/>
<bean:message key="email"/><html:text property="email"/><html:errors property="email"/>
<bean:message key="salary"/><html:textarea property ="salary"/><html:errors property="salary"/>
<html:submit property="submit"> <bean:message  key="update"/></html:submit>

<html:link action="./changelang.do?lang=en">English</html:link>
<html:link action="./changelang.do?lang=te">Telugu</html:link>
<html:link action="./changelang.do?lang=hi">Hindi</html:link>

</pre>
</html:form>