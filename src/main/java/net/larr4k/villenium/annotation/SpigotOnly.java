package net.larr4k.villenium.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Отметка означает, что метод/класс имеет смысл использовать только на стороне Spigot'a.
 */
@Retention(RetentionPolicy.SOURCE)
public @interface SpigotOnly {
}