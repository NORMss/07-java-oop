package com.eltex;

import com.eltex.data.WallService;

public class Main {
    public static void main(String[] args) {
        final var service = new WallService();
        service.like();

        System.out.println(service.getPost());
    }
}