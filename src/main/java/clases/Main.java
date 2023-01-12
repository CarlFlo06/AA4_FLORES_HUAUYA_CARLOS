package clases;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class Main {
	public static void main(String[] args) {
		BeanFactory fabrica=new XmlBeanFactory(new ClassPathResource("bean_datos.xml"));
		
		Afiliacion afil=fabrica.getBean("afiliacion", Afiliacion.class);
		afil.registro();
		afil.baja();
	}
}
