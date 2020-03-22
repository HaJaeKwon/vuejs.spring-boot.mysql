package com.taskagile.domain.model.common.mail;

import java.util.Objects;

public class MessageVariable {
    private String key;
    private Object value;

    private MessageVariable(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public static MessageVariable from(String key, Object value) {
        return new MessageVariable(key, value);
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageVariable that = (MessageVariable) o;
        return key.equals(that.key) &&
            value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "MessageVariable{" +
            "key='" + key + '\'' +
            ", value=" + value +
            '}';
    }
}
