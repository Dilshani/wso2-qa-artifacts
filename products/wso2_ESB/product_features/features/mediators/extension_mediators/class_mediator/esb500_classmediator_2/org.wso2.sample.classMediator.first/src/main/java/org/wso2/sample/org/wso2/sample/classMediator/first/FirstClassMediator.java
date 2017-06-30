package org.wso2.sample.org.wso2.sample.classMediator.first;

import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.xml.namespace.QName;
import java.util.Map;
import java.util.logging.Logger;

public class FirstClassMediator extends AbstractMediator{

	public FirstClassMediator(){
		
	}
	
	public boolean mediate(MessageContext arg0) {
		String price = arg0.getEnvelope().getBody().getFirstElement().getFirstElement().getFirstChildWithName(new QName("http://sample.wso2.org/xsd", "price")).getText();
		double priceDoubleValue = Double.valueOf(price);
		double discountedPrice = 0.054 * priceDoubleValue;
		System.out.println("Price with discount" + " "+ discountedPrice);
		return true;
	}

}
