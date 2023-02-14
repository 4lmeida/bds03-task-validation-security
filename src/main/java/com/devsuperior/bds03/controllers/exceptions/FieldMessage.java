package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {

    private String FiledName;
    private String FieldMessage;

    public FieldMessage() {
    }

    public FieldMessage(String filedName, String fieldMessage) {
        FiledName = filedName;
        FieldMessage = fieldMessage;
    }

    public String getFiledName() {
        return FiledName;
    }

    public void setFiledName(String filedName) {
        FiledName = filedName;
    }

    public String getFieldMessage() {
        return FieldMessage;
    }

    public void setFieldMessage(String fieldMessage) {
        FieldMessage = fieldMessage;
    }
}
