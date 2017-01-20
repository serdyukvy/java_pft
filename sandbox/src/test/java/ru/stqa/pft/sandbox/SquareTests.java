package ru.stqa.pft.sandbox;

/**
 * Created by Vladimir Serdyuk on 20.01.2017.
 */
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea()
    {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}
