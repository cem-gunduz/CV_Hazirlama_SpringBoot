package com.hoaxify.wss.shared;


import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.security.core.annotation.AuthenticationPrincipal;



@Target({ElementType.PARAMETER}) //authcontrollerda metodun parametresi olarak kullandık
@Retention(RUNTIME)
@AuthenticationPrincipal
public @interface CurrentUser {

}
