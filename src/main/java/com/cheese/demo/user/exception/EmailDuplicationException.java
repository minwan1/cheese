package com.cheese.demo.user.exception;

import com.cheese.demo.commons.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailDuplicationException extends RuntimeException {

    private String email;

    public EmailDuplicationException(String email) {
        super(String.valueOf(ErrorCodeEnum.EMAIL_DUPLICATION));
        log.error(ErrorCodeEnum.EMAIL_DUPLICATION.getMessage(), email);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
