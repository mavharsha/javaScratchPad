package com.mavharsha.scratchPad;

@FunctionalInterface
public interface CallOutInterface<T> {
     T callOut(T param);
}
