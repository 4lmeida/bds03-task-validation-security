package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError implements Serializable {

    private List<FieldMessage> errors  = new ArrayList<>();

    public ValidationError() {
        super();
    }

    public List<FieldMessage> getMessageList() {
        return errors;
    }

    public void addMessage(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }

}
