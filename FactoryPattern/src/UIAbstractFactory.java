/**
 * The abstract factory!
 * Could be a abstract class or even an interface.
 * Provides an abstract interface for create a family of product.
 */
public abstract class UIAbstractFactory {
    // The factory method i'll implement in concrete factory
    public abstract UIAbstractProduct init();
}
