package org.mobicents.servlet.sip.ctf.core.extension.context.sip;

import javax.servlet.sip.SipServletRequest;
import javax.servlet.sip.SipSession;

import org.jboss.weld.context.BoundContext;
import org.jboss.weld.context.ConversationContext;

/*
* @author gvagenas 
* gvagenas@gmail.com / devrealm.org
*/

public interface SipConversationContext extends BoundContext<SipServletRequest>, ConversationContext 
{

	public boolean destroy(SipSession session);
	
}
