package smarthouse.util;

import jadex.adapter.fipa.AgentIdentifier;
import jadex.runtime.IExternalAccess;
import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;

public class AgentMessage  {
	
	
	
	public static IMessageEvent sendMessageAndWait(IExternalAccess from,String destAID,String messageID,Object content)
	{
		jadex.adapter.fipa.AgentIdentifier receiver;
		receiver = new AgentIdentifier(destAID,true);
		IMessageEvent me = from.createMessageEvent(messageID);
		me.getParameterSet(jadex.adapter.fipa.SFipa.RECEIVERS).addValue(receiver);
		me.setContent(content);
		IMessageEvent reply = from.sendMessageAndWait(me);
		return reply;
	}

}
