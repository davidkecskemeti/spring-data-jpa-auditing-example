package com.forloop.spring.data.auditing.entity.listener;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class AuditListener {
     
    @PrePersist
    @PreUpdate
    @PreRemove
    private void beforeAnyOperation(Object object) {  }
     
}