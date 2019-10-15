package com.hackerrank.practice.algorithims.implementation;

import java.util.HashMap;
import java.util.Map;

public class Trie{

    private class TrieNode{
        Map<Character,TrieNode> children;
        boolean endOfWord;

        TrieNode(){
            children= new HashMap<>();
            endOfWord=false;
        }
    }
}