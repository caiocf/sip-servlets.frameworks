/**
 * 
 */
package org.mobicents.servlet.sip.ctf.core.extension.event.servlet;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * @author gvagenas 
 * gvagenas@gmail.com
 * 
 */
@Qualifier
@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
@Documented
public @interface ServletInitialized {

}
