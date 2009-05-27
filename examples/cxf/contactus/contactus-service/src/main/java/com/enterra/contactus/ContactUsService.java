package com.enterra.contactus;

import java.util.List;

import javax.jws.*;

@WebService
public interface ContactUsService {
    List<Message> getMessages();

    void postMessage(@WebParam(name = "message") Message message);

}
