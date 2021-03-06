package com.aLavel;

import java.io.*;

public class WorkInFile {
    public static void main(String[] args) throws FileNotFoundException {
        /*WorkInFile.read("no_file.txt");*/

    //Чтение файла
    String textFromFile = WorkInFile.read(fileName);
    System.out.println(textFromFile);
}

    private static String fileName = "FileUtils.txt";

    public static String read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);

        exists(fileName);

                    try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}

