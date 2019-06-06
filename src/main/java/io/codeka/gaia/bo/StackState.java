package io.codeka.gaia.bo;

/**
 * Represents the state of a Stack.
 */
public enum StackState {

    /**
     * When the stack is created but never applied
     */
    NEW,

    /**
     * When the stack has been applied
     */
    RUNNING,

    /**
     * When the stack is running, but need to be updated (after a variable or module change)
     */
    TO_UPDATE,

    /**
     * When the stack has been destroyed
     */
    DESTROYED,

    /**
     * When the stack is not visible anaymore
     */
    ARCHIVED

}