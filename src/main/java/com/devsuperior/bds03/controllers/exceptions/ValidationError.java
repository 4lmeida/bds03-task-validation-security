package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError implements Serializable {

    private List<FieldMessage> messageList  = new ArrayList<>();

    public ValidationError() {
        super();
    }

    public List<FieldMessage> getMessageList() {
        return messageList;
    }

    public void addMessage(String fieldName, String fieldMessage) {
        messageList.add(new FieldMessage(fieldName, fieldMessage));
    }

}
