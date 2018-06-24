package com.mavharsha.scratchPad;
@FunctionalInterface
public interface Sum<T, K, V> {
    T sum(K first, V second);
}
