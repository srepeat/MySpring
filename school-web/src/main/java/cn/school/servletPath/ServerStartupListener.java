package cn.school.servletPath;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * �Զ���·��������
 * @author ����
 *
 */
public class ServerStartupListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub
		// ��webӦ�����ƣ�·�������浽application��Χ��
		ServletContext servletContext = servletContextEvent.getServletContext();
		String contextPath = servletContext.getContextPath();
		servletContext.setAttribute("APP_PATH", contextPath);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
