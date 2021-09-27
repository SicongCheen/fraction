
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FractionImplTest {


    /* ****************************************************
       test: int getSmaller(int numerator, int denominator)
       **************************************************** */


    @Test
    public void getSmallerTest_1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getSmaller", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(3, 5);
        int smaller = (int) method.invoke(f, 3, 5);
        assertEquals(3, smaller);
    }

    @Test
    public void getSmallerTest_2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getSmaller", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(5, 3);
        int smaller = (int) method.invoke(f, 5, 3);
        assertEquals(3, smaller);
    }

    @Test
    public void getSmallerTest_3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getSmaller", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(0, 5);
        int smaller = (int) method.invoke(f, 0, 5);
        assertEquals(0, smaller);
    }

    @Test
    public void getSmallerTest_4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getSmaller", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(5, 5);
        int smaller = (int) method.invoke(f, 5, 5);
        assertEquals(5, smaller);
    }


    /* ************************************************
       test: int getGCD(int numerator, int denominator)
       ************************************************ */


    @Test
    public void getGCDTest_1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(3, 5);
        int GCD = (int) method.invoke(f, 3, 5);
        assertEquals(1, GCD);
    }

    @Test
    public void getGCDTest_2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(-3, -5);
        int GCD = (int) method.invoke(f, -3, -5);
        assertEquals(1, GCD);
    }

    @Test
    public void getGCDTest_3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(3, -5);
        int GCD = (int) method.invoke(f, 3, -5);
        assertEquals(1, GCD);
    }

    @Test
    public void getGCDTest_4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(0, 5);
        int GCD = (int) method.invoke(f, 0, 5);
        assertEquals(1, GCD);
    }

    @Test
    public void getGCDTest_5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(-1, -6);
        int GCD = (int) method.invoke(f, -1, -6);
        assertEquals(1, GCD);
    }

    @Test
    public void getGCDTest_6() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(140, 70);
        int GCD = (int) method.invoke(f, 140, 70);
        assertEquals(70, GCD);
    }

    @Test
    public void getGCDTest_7() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(144, -12);
        int GCD = (int) method.invoke(f, 144, -12);
        assertEquals(12, GCD);
    }

    @Test
    public void getGCDTest_8() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(-525, -50);
        int GCD = (int) method.invoke(f, -525, -50);
        assertEquals(25, GCD);
    }

    @Test
    public void getGCDTest_9() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(-1000, 50);
        int GCD = (int) method.invoke(f, -1000, 50);
        assertEquals(50, GCD);
    }

    @Test
    public void getGCDTest_10() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getGCD", int.class, int.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(163, 54);
        int GCD = (int) method.invoke(f, 163, 54);
        assertEquals(1, GCD);
    }


    /* ***************************************************
       test: ArrayList<Integer> getNumDen(String fraction)
       *************************************************** */


    @Test
    public void getNumDenTest_1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getNumDen", String.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(" 3/5");
        ArrayList<Integer> numbs = (ArrayList<Integer>) method.invoke(f," 3/5");
        assertEquals("[3, 5]", numbs.toString());
    }

    @Test
    public void getNumDenTest_2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getNumDen", String.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl("-3 ");
        ArrayList<Integer> numbs = (ArrayList<Integer>) method.invoke(f,"-3 ");
        assertEquals("[-3]", numbs.toString());
    }

    @Test
    public void getNumDenTest_3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getNumDen", String.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl("-3 /-5");
        ArrayList<Integer> numbs = (ArrayList<Integer>) method.invoke(f,"-3 /-5");
        assertEquals("[-3, -5]", numbs.toString());
    }

    @Test
    public void getNumDenTest_4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getNumDen", String.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl("0/ -5");
        ArrayList<Integer> numbs = (ArrayList<Integer>) method.invoke(f,"0/ -5");
        assertEquals("[0, -5]", numbs.toString());
    }

    @Test
    public void getNumDenTest_5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getNumDen", String.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl("0/1 ");
        ArrayList<Integer> numbs = (ArrayList<Integer>) method.invoke(f,"0/1 ");
        assertEquals("[0, 1]", numbs.toString());
    }

    @Test
    public void getNumDenTest_6() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = FractionImpl.class.getDeclaredMethod("getNumDen", String.class);
        method.setAccessible(true);
        FractionImpl f = new FractionImpl(" 7 / 20 ");
        ArrayList<Integer> numbs = (ArrayList<Integer>) method.invoke(f," 7 / 20 ");
        assertEquals("[7, 20]", numbs.toString());
    }



    /* **************************************************************
       test: constructor FractionImpl(int numerator, int denominator)
       ************************************************************** */


    @Test
    public void FractionImplTest_NumDen_1() {
        FractionImpl actual = new FractionImpl(7, 5);
        FractionImpl expected = new FractionImpl(7, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void FractionImplTest_NumDen_2() {
        FractionImpl actual = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(-7, 5);
        assertEquals(expected, actual);
    }

    @Test  // denominator negative
    public void FractionImplTest_NumDen_3() {
        FractionImpl actual = new FractionImpl(7, -5);
        FractionImpl expected = new FractionImpl(-7, 5);
        assertEquals(expected, actual);
    }

    @Test  // normalization
    public void FractionImplTest_NumDen_4() {
        FractionImpl actual = new FractionImpl(143, 110);
        FractionImpl expected = new FractionImpl(13, 10);
        assertEquals(expected, actual);
    }

    @Test  // normalization
    public void FractionImplTest_NumDen_5() {
        FractionImpl actual = new FractionImpl(70, -110);
        FractionImpl expected = new FractionImpl(-7, 11);
        assertEquals(expected, actual);
    }

    @Test  // normalization
    public void FractionImplTest_NumDen_6() {
        FractionImpl actual = new FractionImpl(-70, 110);
        FractionImpl expected = new FractionImpl(-7, 11);
        assertEquals(expected, actual);
    }

    @Test  // normalization
    public void FractionImplTest_NumDen_7() {
        FractionImpl actual = new FractionImpl(-21, -84);
        FractionImpl expected = new FractionImpl(1, 4);
        assertEquals(expected, actual);
    }

    @Test  // denominator zero
    public void FractionImplTest_NumDen_8() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FractionImpl(7, 0);
            }
        });
    }

    @Test  // denominator zero
    public void FractionImplTest_NumDen_9() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FractionImpl(0, 0);
            }
        });
    }

    @Test  // denominator zero
    public void FractionImplTest_NumDen_10() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FractionImpl(-5, 0);
            }
        });
    }

    @Test  // denominator one
    public void FractionImplTest_NumDen_11() {
        FractionImpl actual = new FractionImpl(5, 1);
        FractionImpl expected = new FractionImpl(5, 1);
        assertEquals(expected, actual);
    }

    @Test  // denominator one
    public void FractionImplTest_NumDen_12() {
        FractionImpl actual = new FractionImpl(0, 1);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, actual);
    }

    @Test  // denominator one
    public void FractionImplTest_NumDen_13() {
        FractionImpl actual = new FractionImpl(-5, 1);
        FractionImpl expected = new FractionImpl(-5, 1);
        assertEquals(expected, actual);
    }

    @Test  // numerator zero
    public void FractionImplTest_NumDen_14() {
        FractionImpl actual = new FractionImpl(0, 7);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, actual);
    }

    @Test  // numerator zero
    public void FractionImplTest_NumDen_15() {
        FractionImpl actual = new FractionImpl(0, -7);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, actual);
    }


    /* ***********************************************
       test: constructor FractionImpl(int wholeNumber)
       *********************************************** */


    @Test
    public void FractionImplTest_WNumb_1() {
        FractionImpl actual = new FractionImpl(2);
        FractionImpl expected = new FractionImpl(2, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void FractionImplTest_WNumb_2() {
        FractionImpl actual = new FractionImpl(56748);
        FractionImpl expected = new FractionImpl(56748, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void FractionImplTest_WNumb_3() {
        FractionImpl actual = new FractionImpl(-3);
        FractionImpl expected = new FractionImpl(-3, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void FractionImplTest_WNumb_4() {
        FractionImpl actual = new FractionImpl(-37567);
        FractionImpl expected = new FractionImpl(-37567, 1);
        assertEquals(expected, actual);
    }

    @Test  // numerator zero
    public void FractionImplTest_WNumb_5() {
        FractionImpl actual = new FractionImpl(0);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, actual);
    }


    /* ***********************************************
       test: constructor FractionImpl(String fraction)
       *********************************************** */


    @Test
    public void FractionImplTest_Frac_1() {
        FractionImpl actual = new FractionImpl("5");
        FractionImpl expected = new FractionImpl(5, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void FractionImplTest_Frac_2() {
        FractionImpl actual = new FractionImpl("-3");
        FractionImpl expected = new FractionImpl(-3, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void FractionImplTest_Frac_3() {
        FractionImpl actual = new FractionImpl("-70/80");
        FractionImpl expected = new FractionImpl(-7, 8);
        assertEquals(expected, actual);
    }

    @Test  // denominator negative
    public void FractionImplTest_Frac_4() {
        FractionImpl actual = new FractionImpl("72/-112");
        FractionImpl expected = new FractionImpl(-9, 14);
        assertEquals(expected, actual);
    }

    @Test  // normalization
    public void FractionImplTest_Frac_5() {
        FractionImpl actual = new FractionImpl("40/26");
        FractionImpl expected = new FractionImpl(20, 13);
        assertEquals(expected, actual);
    }

    @Test  // denominator zero
    public void FractionImplTest_Frac_6() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FractionImpl("-3/0");
            }
        });
    }

    @Test  // numerator zero
    public void FractionImplTest_Frac_7() {
        FractionImpl actual = new FractionImpl("0/-10");
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, actual);
    }

    @Test  // format
    public void FractionImplTest_Frac_8() {
        FractionImpl actual = new FractionImpl(" -10/7");
        FractionImpl expected = new FractionImpl(-10, 7);
        assertEquals(expected, actual);
    }

    @Test  // format
    public void FractionImplTest_Frac_9() {
        FractionImpl actual = new FractionImpl("-10 /7");
        FractionImpl expected = new FractionImpl(-10, 7);
        assertEquals(expected, actual);
    }

    @Test  // format
    public void FractionImplTest_Frac_10() {
        FractionImpl actual = new FractionImpl("-10/ 7");
        FractionImpl expected = new FractionImpl(-10, 7);
        assertEquals(expected, actual);
    }

    @Test  // format
    public void FractionImplTest_Frac_11() {
        FractionImpl actual = new FractionImpl("-10/7 ");
        FractionImpl expected = new FractionImpl(-10, 7);
        assertEquals(expected, actual);
    }

    @Test  // format
    public void FractionImplTest_Frac_12() {
        FractionImpl actual = new FractionImpl(" -10 / 7 ");
        FractionImpl expected = new FractionImpl(-10, 7);
        assertEquals(expected, actual);
    }

    @Test  // format
    public void FractionImplTest_Frac_13() {
        assertThrows(NumberFormatException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FractionImpl("-1 0/7");
            }
        });
    }

    @Test  // format
    public void FractionImplTest_Frac_14() {
        assertThrows(NumberFormatException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                new FractionImpl("- 10/7");
            }
        });
    }


    /* ********************
       test: Fraction abs()
       ******************** */


    @Test  // positive
    public void absTest_1() {
        FractionImpl test = new FractionImpl(5,3);
        FractionImpl expected = new FractionImpl(5,3);
        assertEquals(expected, test.abs());
    }

    @Test  // positive
    public void absTest_2() {
        FractionImpl test = new FractionImpl("7/149");
        FractionImpl expected = new FractionImpl(7,149);
        assertEquals(expected, test.abs());
    }

    @Test  // positive
    public void absTest_3() {
        FractionImpl test = new FractionImpl("1449");
        FractionImpl expected = new FractionImpl(1449, 1);
        assertEquals(expected, test.abs());
    }

    @Test  // negative
    public void absTest_4() {
        FractionImpl test = new FractionImpl(20,-12);
        FractionImpl expected = new FractionImpl(5, 3);
        assertEquals(expected, test.abs());
    }

    @Test  // negative
    public void absTest_5() {
        FractionImpl test = new FractionImpl("7/-149");
        FractionImpl expected = new FractionImpl(7, 149);
        assertEquals(expected, test.abs());
    }

    @Test  // zero
    public void absTest_6() {
        FractionImpl test = new FractionImpl(0,39);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, test.abs());
    }

    @Test  // zero
    public void absTest_7() {
        FractionImpl test = new FractionImpl(0,-49);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, test.abs());
    }


    /* ***********************
       test: Fraction negate()
       *********************** */


    @Test  // positive
    public void negateTest_1() {
        FractionImpl test = new FractionImpl(10,6);
        FractionImpl expected = new FractionImpl(-5, 3);
        assertEquals(expected, test.negate());
    }

    @Test  // positive
    public void negateTest_2() {
        FractionImpl test = new FractionImpl(35);
        FractionImpl expected = new FractionImpl(-35, 1);
        assertEquals(expected, test.negate());
    }

    @Test  // positive
    public void negateTest_3() {
        FractionImpl test = new FractionImpl("6/7");
        FractionImpl expected = new FractionImpl(-6, 7);
        assertEquals(expected, test.negate());
    }

    @Test  // negative
    public void negateTest_4() {
        FractionImpl test = new FractionImpl(-20, 5);
        FractionImpl expected = new FractionImpl(4, 1);
        assertEquals(expected, test.negate());
    }

    @Test  // negative
    public void negateTest_5() {
        FractionImpl test = new FractionImpl(-253);
        FractionImpl expected = new FractionImpl(253, 1);
        assertEquals(expected, test.negate());
    }


    @Test  // negative
    public void negateTest_6() {
        FractionImpl test = new FractionImpl("-253/253");
        FractionImpl expected = new FractionImpl(1, 1);
        assertEquals(expected, test.negate());
    }

    @Test  // zero
    public void negateTest_7() {
        FractionImpl test = new FractionImpl("0/-7");
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, test.negate());
    }


    /* ***********************
       test: Fraction invert()
       *********************** */


    @Test // positive
    public void inverseTest_1() {
        FractionImpl test = new FractionImpl(3, 1);
        FractionImpl expected = new FractionImpl(1, 3);
        assertEquals(expected, test.inverse());
    }

    @Test // positive
    public void inverseTest_2() {
        FractionImpl test = new FractionImpl(1, 3);
        FractionImpl expected = new FractionImpl(3, 1);
        assertEquals(expected, test.inverse());
    }

    @Test // negative
    public void inverseTest_3() {
        FractionImpl test = new FractionImpl(5, -3);
        FractionImpl expected = new FractionImpl(-3, 5);
        assertEquals(expected, test.inverse());
    }

    @Test // negative
    public void inverseTest_4() {
        FractionImpl test = new FractionImpl("1/-5");
        FractionImpl expected = new FractionImpl(-5, 1);
        assertEquals(expected, test.inverse());
    }

    @Test // negative
    public void inverseTest_5() {
        FractionImpl test = new FractionImpl("-5");
        FractionImpl expected = new FractionImpl(-1, 5);
        assertEquals(expected, test.inverse());
    }


    @Test // numerator zero
    public void inverseTest_6() {
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                FractionImpl f = new FractionImpl(0, 3);
                f.inverse();
            }
        });
    }


    /* ******************************
       test: Fraction add(Fraction f)
       ****************************** */


    @Test
    public void addTest_1() {
        FractionImpl f1 = new FractionImpl(2, 3);
        FractionImpl f2 = new FractionImpl(5, 7);
        FractionImpl expected = new FractionImpl(29, 21);
        assertEquals(expected, f1.add(f2));
    }

    @Test
    public void addTest_2() {
        FractionImpl f1 = new FractionImpl(7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, f1.add(f2));
    }

    @Test
    public void addTest_3() {
        FractionImpl f1 = new FractionImpl(-7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(-14, 5);
        assertEquals(expected, f1.add(f2));
    }

    @Test
    public void addTest_4() {
        FractionImpl f1 = new FractionImpl(0, 84);
        FractionImpl f2 = new FractionImpl(21, 84);
        FractionImpl expected = new FractionImpl(1, 4);
        assertEquals(expected, f1.add(f2));
    }

    @Test
    public void addTest_5() {
        FractionImpl f1 = new FractionImpl(0);
        FractionImpl f2 = new FractionImpl(-2, 3);
        FractionImpl expected = new FractionImpl(-2, 3);
        assertEquals(expected, f1.add(f2));
    }


    /* ***********************************
       test: Fraction subtract(Fraction f)
       *********************************** */


    @Test
    public void subtractTest_1() {
        FractionImpl f1 = new FractionImpl(2, 3);
        FractionImpl f2 = new FractionImpl(5, 7);
        FractionImpl expected = new FractionImpl(-1, 21);
        assertEquals(expected, f1.subtract(f2));
    }

    @Test
    public void subtractTest_2() {
        FractionImpl f1 = new FractionImpl(7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(14, 5);
        assertEquals(expected, f1.subtract(f2));

    }

    @Test
    public void subtractTest_3() {
        FractionImpl f1 = new FractionImpl(-7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, f1.subtract(f2));
    }

    @Test
    public void subtractTest_4() {
        FractionImpl f1 = new FractionImpl(0, 84);
        FractionImpl f2 = new FractionImpl(21, 84);
        FractionImpl expected = new FractionImpl(-1, 4);
        assertEquals(expected, f1.subtract(f2));
    }

    @Test
    public void subtractTest_5() {
        FractionImpl f1 = new FractionImpl(0);
        FractionImpl f2 = new FractionImpl(-2, 3);
        FractionImpl expected = new FractionImpl(2, 3);
        assertEquals(expected, f1.subtract(f2));
    }


    /* ***********************************
       test: Fraction multiply(Fraction f)
       *********************************** */


    @Test
    public void multiplyTest_1() {
        FractionImpl f1 = new FractionImpl(2, 3);
        FractionImpl f2 = new FractionImpl(5, 7);
        FractionImpl expected = new FractionImpl(10, 21);
        assertEquals(expected, f1.multiply(f2));
    }

    @Test
    public void multiplyTest_2() {
        FractionImpl f1 = new FractionImpl(7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(-49, 25);
        assertEquals(expected, f1.multiply(f2));
    }

    @Test
    public void multiplyTest_3() {
        FractionImpl f1 = new FractionImpl(-7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(49, 25);
        assertEquals(expected, f1.multiply(f2));
    }

    @Test
    public void multiplyTest_4() {
        FractionImpl f1 = new FractionImpl(0, 84);
        FractionImpl f2 = new FractionImpl(21, 84);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, f1.multiply(f2));
    }

    @Test
    public void multiplyTest_5() {
        FractionImpl f1 = new FractionImpl(0);
        FractionImpl f2 = new FractionImpl(-2, 3);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, f1.multiply(f2));
    }


    /* *********************************
       test: Fraction divide(Fraction f)
       ********************************* */


    @Test
    public void divideTest_1() {
        FractionImpl f1 = new FractionImpl(2, 3);
        FractionImpl f2 = new FractionImpl(5, 7);
        FractionImpl expected = new FractionImpl(14, 15);
        assertEquals(expected, f1.divide(f2));
    }

    @Test
    public void divideTest_2() {
        FractionImpl f1 = new FractionImpl(7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(-1, 1);
        assertEquals(expected, f1.divide(f2));
    }

    @Test
    public void divideTest_3() {
        FractionImpl f1 = new FractionImpl(-7, 5);
        FractionImpl f2 = new FractionImpl(-7, 5);
        FractionImpl expected = new FractionImpl(1, 1);
        assertEquals(expected, f1.divide(f2));
    }

    @Test
    public void divideTest_4() {
        FractionImpl f1 = new FractionImpl(0, 84);
        FractionImpl f2 = new FractionImpl(21, 84);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, f1.divide(f2));
    }

    @Test
    public void divideTest_5() {
        FractionImpl f1 = new FractionImpl(0);
        FractionImpl f2 = new FractionImpl(-2, 3);
        FractionImpl expected = new FractionImpl(0, 1);
        assertEquals(expected, f1.divide(f2));
    }

    @Test
    public void divideTest_6() {
        Fraction f1 = new FractionImpl(1, 2);
        FractionImpl f2 = new FractionImpl(0);
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                f1.divide(f2);
            }
        });
    }


    /* *******************************
       test: int compareTo(Fraction f)
       ******************************* */


    @Test // positive
    public void compareToTest_1() {
        FractionImpl f1 = new FractionImpl(2, 3);
        FractionImpl f2 = new FractionImpl(5, 3);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test // positive
    public void compareToTest_2() {
        FractionImpl f1 = new FractionImpl("10");
        FractionImpl f2 = new FractionImpl(467, 984);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test // positive
    public void compareToTest_3() {
        FractionImpl f1 = new FractionImpl("10");
        FractionImpl f2 = new FractionImpl(100, 10);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test // positive with zero
    public void compareToTest_4() {
        FractionImpl f1 = new FractionImpl(0, 100);
        FractionImpl f2 = new FractionImpl(100, 10);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test // positive with zero
    public void compareToTest_5() {
        FractionImpl f1 = new FractionImpl(10, 100);
        FractionImpl f2 = new FractionImpl(0, 10);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test // positive with zero
    public void compareToTest_6() {
        FractionImpl f1 = new FractionImpl(0, 100);
        FractionImpl f2 = new FractionImpl(0, 10);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test // negative
    public void compareToTest_7() {
        FractionImpl f1 = new FractionImpl(-2, 3);
        FractionImpl f2 = new FractionImpl(5, -3);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test // negative
    public void compareToTest_8() {
        FractionImpl f1 = new FractionImpl("-10");
        FractionImpl f2 = new FractionImpl(467, -984);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test // negative
    public void compareToTest_9() {
        FractionImpl f1 = new FractionImpl("-10");
        FractionImpl f2 = new FractionImpl(-100, 10);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test // negative with zero
    public void compareToTest_10() {
        FractionImpl f1 = new FractionImpl(0, -100);
        FractionImpl f2 = new FractionImpl(100, -10);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test // negative with zero
    public void compareToTest_11() {
        FractionImpl f1 = new FractionImpl(-10, 100);
        FractionImpl f2 = new FractionImpl(0, -10);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test // negative with zero
    public void compareToTest_12() {
        FractionImpl f1 = new FractionImpl(0, -100);
        FractionImpl f2 = new FractionImpl(0, -10);
        assertEquals(0, f1.compareTo(f2));
    }


    /* ******************************
       test: boolean equals(Object o)
       ****************************** */


    @Test
    public void equalsTest_1() {
        FractionImpl f1 = new FractionImpl(2, 3);
        FractionImpl f2 = new FractionImpl("2/3");
        assertEquals(true, f1.equals(f2));
    }

    @Test
    public void equalsTest_2() {
        FractionImpl f1 = new FractionImpl(2, 3);
        FractionImpl f2 = new FractionImpl("5/3");
        assertEquals(false, f1.equals(f2));
    }

    @Test
    public void equalsTest_3() {
        FractionImpl f1 = new FractionImpl(143, 110);
        FractionImpl f2 = new FractionImpl("13/10");
        assertEquals(true, f1.equals(f2));
    }

    @Test
    public void equalsTest_4() {
        FractionImpl f1 = new FractionImpl(143, 110);
        FractionImpl f2 = new FractionImpl("-13/10");
        assertEquals(false, f1.equals(f2));
    }

    @Test
    public void equalsTest_5() {
        FractionImpl f1 = new FractionImpl(0, -7);
        FractionImpl f2 = new FractionImpl("0/-7");
        assertEquals(true, f1.equals(f2));
    }

    @Test
    public void equalsTest_6() {
        FractionImpl f1 = new FractionImpl(5, 1);
        FractionImpl f2 = new FractionImpl("5/-1");
        assertEquals(false, f1.equals(f2));
    }

    @Test
    public void equalsTest_7() {
        FractionImpl f1 = new FractionImpl(5, 1);
        FractionImpl f2 = new FractionImpl("25/5");
        assertEquals(true, f1.equals(f2));
    }

    @Test
    public void equalsTest_8() {
        FractionImpl f1 = new FractionImpl(-5, 1);
        FractionImpl f2 = new FractionImpl("-100/20");
        assertEquals(true, f1.equals(f2));
    }

    @Test
    public void equalsTest_9() {
        FractionImpl f = new FractionImpl(3);
        Integer i = 3;
        assertEquals(false, f.equals(i));
    }


    /* ***********************
       test: String toString()
       *********************** */


    @Test
    public void toStringTest_1() {
        FractionImpl f = new FractionImpl(30, 7);
        assertEquals("30/7", f.toString());
    }

    @Test
    public void toStringTest_2() {
        FractionImpl f = new FractionImpl(40, -7);
        assertEquals("-40/7", f.toString());
    }

    @Test  // denominator one
    public void toStringTest_3() {
        FractionImpl f = new FractionImpl(30, 1);
        assertEquals("30", f.toString());
    }

    @Test  // denominator one
    public void toStringTest_4() {
        FractionImpl f = new FractionImpl(-20, 1);
        assertEquals("-20", f.toString());
    }

    @Test  // numerator zero
    public void toStringTest_5() {
        FractionImpl f = new FractionImpl(0, 7);
        assertEquals("0", f.toString());
    }

    @Test  // numerator zero
    public void toStringTest_6() {
        FractionImpl f = new FractionImpl(0, -35);
        assertEquals("0", f.toString());
    }

}
