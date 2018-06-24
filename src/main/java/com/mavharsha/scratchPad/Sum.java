package com.mavharsha.scratchPad;
@FunctionalInterface
public interface Sum<T extends Number, K extends Number, V extends Number> {
    T sum(K first, V second);
}
