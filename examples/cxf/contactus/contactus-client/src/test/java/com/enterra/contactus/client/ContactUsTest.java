package com.enterra.contactus.client;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.enterra.contactus.*;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:applicationContext-contactus-client.xml", 
        "classpath:applicationContext-contactus-cxf.xml"})
public class ContactUsTest extends AbstractJUnit4SpringContextTests {

    private ContactUsService contactUsService;
    private Logger logger = Logger.getLogger(getClass());
    
    @Autowired
    public void setContactUsService(ContactUsService contactUsService) {
        this.contactUsService = contactUsService;
    }

    @Test
    public void serviceIsWired() throws Exception {
        assertNotNull(contactUsService);
    }
    
    @Test
    public void getMessages() throws Exception {
        List<Message> messages = contactUsService.getMessages();
        assertNotNull(messages);
        assertFalse(messages.isEmpty());
        for (Message message : messages) {
            assertNotNull(message);
            assertNotNull(message.getText());
            assertFalse(message.getText().isEmpty());
            logger.info(message);
        }
    }
    
    @Test
    public void postMessage() throws Exception {
        Message message = new Message("Barney", "Rubble", 
                "brubble@bedrock.net", "That Bamm-Bamm sure is strong");
        contactUsService.postMessage(message);
    }
}
