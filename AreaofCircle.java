/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL-PC
 */
public class AreaofCircle {
    final float pi=3.14f;
    public void findareaofCircle()
    {
        float r=0;
        r=r*r*(pi);
        System.out.println(r);
    }
    public static void main(String [] args )
    {
        AreaofCircle arc=new AreaofCircle();
        arc.findareaofCircle();
    }
            
}
class Square
{
    public float calculateSquare(int r)
    {
        return r*r;
    }
}
