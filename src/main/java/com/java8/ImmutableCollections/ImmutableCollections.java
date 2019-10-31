package com.java8.ImmutableCollections;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//You want to create an immutable list, set, or map using the Stream API.
/**
 *  pre java8 soln
 * static <T> List<T> unmodifiableList(List<? extends T> list)
static <T> Set<T> unmodifiableSet(Set<? extends T> s)
static <K,V> Map<K,V> unmodifiableMap(Map<? extends K,? extends V> m)
 */
public class ImmutableCollections{


    
    public static void main(String[] args) {
        
        Map<String, Integer> map = Collections.unmodifiableMap(
            new HashMap<String, Integer>() {{
                put("have", 1);
                put("the", 2);
                put("high", 3);
                put("ground", 4);
            }});

     
    }

     @SafeVarargs
    public final <T> List<T> createImmutableList(T... elements) {
        return Arrays.stream(elements)
                .collect(collectingAndThen(toList(), Collections::unmodifiableList));
    }

    @SafeVarargs
    public final <T> List<T> createImmutableListJava7(T... elements) {
        return Collections.unmodifiableList(Arrays.asList(elements));
    }

    @SafeVarargs
    public final <T> Set<T> createImmutableSet(T... elements) {
        return Arrays.stream(elements)
                .collect(collectingAndThen(toSet(), Collections::unmodifiableSet));
    }


  
}