package org.example.base.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamTransformation {
    @Test
    public void testStreamPeek() {
        Object[] objects = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Fetching " + e))
                .limit(20)
                .toArray();

        assertEquals(2.0, objects[1]);

    }
}
