package com.enterra.contactus;

import java.util.*;

import javax.jws.WebService;

@WebService(endpointInterface = "com.enterra.contactus.ContactUsService", 
        name = "contactUs", portName = "contactUsPort", 
        serviceName = "contactUsService", targetNamespace = "urn:enterra:contactus")
public class ContactUsServiceImpl implements ContactUsService {

    @Override
    public List<Message> getMessages() {
        List<Message> messages = new ArrayList<Message>();
        messages.add(new Message("Willie", "Wheeler", "willie.wheeler@xyz.com",
                "Great job"));
        messages.add(new Message("Dardy", "Chen", "dardy.chen@xyz.com",
                "I want my money back"));
        return messages;
    }

    @Override
    public void postMessage(Message message) {
        System.out.println(message);
        
    }

}
