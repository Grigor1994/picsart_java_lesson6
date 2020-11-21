package com.grigor.picsart.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Reader {
    private final Scanner input;

    public Reader(String path) throws FileNotFoundException {
        this.input = new Scanner(new File(path));
    }

    public List<String> readAllData() {
        List<String> data = new ArrayList<>();
        while (input.hasNext()) {
            data.add(input.nextLine());
        }
        return data;
    }
}
