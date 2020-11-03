package com.company;
import javax.swing.*;
public class UsingIf {

    public static void main(String[] args) {
//	    Числа (числитель и знаменатель):
        double x,y;
//        Заголовок окна:
        String title="Деление чисел";
//        Текст сообщения (начальное значение):
        String text="Результаты деления: ";
//        Переменная определяет тип сообщения:
        int type;

//        Считывание числителя:
        x=Double.parseDouble(JOptionPane.showInputDialog("Числитель:"));
//        Считывание знаменателя:
        y=Double.parseDouble(JOptionPane.showInputDialog("Знаменатель:"));

//        Условный оператор: равен ли нулю знаменатель?
        if (y!=0) {type=JOptionPane.PLAIN_MESSAGE; // Знаменатель не равен нулю
                text=text+x+" / "+y+"="+x/y;}
        else {type=JOptionPane.ERROR_MESSAGE;
                text=text+"На ноль делить нельзя!";}
//      Отображение окна с сообщением:
        JOptionPane.showMessageDialog(null,text,title,type);
    }
}
