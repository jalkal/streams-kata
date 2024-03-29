package com.merkle.course.streams;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IntermediateTest {

    /**
     * Convert Stream items with map()
     */
    @Test
    void stream_map(){
        Stream<String> stream = Stream.of("a", "b", "c", "d"); //Modify this line

        assertThat(stream).containsExactly("A", "B", "C", "D");
    }

    /**
     * Convert Stream items with flatMap()
     * consider a flatMap(Function<String, Stream<String>>)
     */
    @Test
    void stream_flatMap(){
        Stream<String> stream = Stream.of("hello", "world"); //Modify this line

        assertThat(stream).containsExactly("h", "e", "l", "l", "o", "w", "o", "r", "l", "d");
    }

    /**
     * Filter Stream items with filter()
     */
    @Test
    void stream_filter(){
        Stream<String> stream = Stream.of("hello", "", "world"); //Modify this line

        assertThat(stream).containsExactly("hello", "world");
    }

    /**
     * Limit Stream items with limit()
     */
    @Test
    void stream_limit(){
        Stream<String> stream = Stream.of("hello", "world", "this", "hello", "world"); //Modify this line

        assertThat(stream).containsExactly("hello", "world");
    }

    /**
     * Skip Stream items with skip()
     */
    @Test
    void stream_skip(){
        Stream<String> stream = Stream.of("hello", "world", "this", "hello", "world"); //Modify this line

        assertThat(stream).containsExactly("this", "hello", "world");
    }

    /**
     * Combine skip() and limit()
     */
    @Test
    void stream_skip_limit(){
        Stream<String> stream = Stream.of("hello", "world", "this", "hello", "world"); //Modify this line

        assertThat(stream).containsExactly("this");
    }

    /**
     * Remove duplicates Stream items with distinct()
     */
    @Test
    void stream_distinct(){
        Stream<String> stream = Stream.of("hello", "world", "this", "hello", "world"); //Modify this line

        assertThat(stream).containsExactly("hello", "world", "this");
    }
}
