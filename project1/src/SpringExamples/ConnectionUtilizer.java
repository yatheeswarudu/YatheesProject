package SpringExamples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import SpringExamples.Connection;
public class ConnectionUtilizer {
	private static BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringExamples/applicationContext.xml"));
	
	public static void main(String args[]){
		Connection contract=(Connection)factory.getBean("provider");
		String connectionString=contract.getConnection();
		System.out.println("Connection===="+connectionString);
	}

}
