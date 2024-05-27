/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphsim;

/**
 *
 * @author Jeremy
 */
public class Square extends Shape {
    @Override
    public void draw()
    {System.out.println("Square.draw()");}
    @Override
    public void erase()
    {System.out.println("Square.erase()");}  
    @Override
    public void pesan()
    {System.out.println("Ini Pesan Dari Square");}
}
